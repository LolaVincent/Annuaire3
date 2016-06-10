

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DefaultNamespace.AnnuaireProxy;
import beans.Annonce;
import beans.Categorie;

/**
 * Servlet implementation class ModificationAnnonce
 */
@WebServlet("/ModificationAnnonce")
public class ModificationAnnonce extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModificationAnnonce() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int annonce_id = Integer.parseInt(request.getParameter("annonce_nom"));
		AnnuaireProxy annuaire = new AnnuaireProxy();
		Annonce annonce = annuaire.affichageAnnonce(annonce_id);
		Categorie[] categories = annuaire.affichageCategories();
		request.setAttribute("categories", categories);
		request.setAttribute("annonce", annonce);
		this.getServletContext().getRequestDispatcher("/WEB-INF/ModificationAnnonce.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("nom");
		int id = Integer.parseInt(request.getParameter("id"));
		String adresse = request.getParameter("adresse"); 
		String numero = request.getParameter("numero");
		int sujet = Integer.parseInt(request.getParameter("categorie"));
		AnnuaireProxy annuaire = new AnnuaireProxy();
		annuaire.modificationAnnonce(sujet, nom, adresse, numero, id);
		 
		this.getServletContext().getRequestDispatcher("/WEB-INF/admin.jsp").forward(request, response);
	}

}
