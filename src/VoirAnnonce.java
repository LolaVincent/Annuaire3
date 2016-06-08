import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DefaultNamespace.AnnuaireProxy;
import beans.Annonce;

/**
 * Servlet implementation class VoirAnnonce
 */
@WebServlet("/VoirAnnonce")
public class VoirAnnonce extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VoirAnnonce() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String annonce_nom = request.getParameter("annonce_nom");
		AnnuaireProxy annuaire = new AnnuaireProxy();
		Annonce annonce = annuaire.affichageAnnonceNom(annonce_nom);
		String sujet = annonce.getCategorie().getSujet();
		request.setAttribute("annonce", annonce);
		request.setAttribute("sujet", sujet);
		this.getServletContext().getRequestDispatcher("/WEB-INF/VoirAnnonce.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
