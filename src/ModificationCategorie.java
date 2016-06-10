

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DefaultNamespace.AnnuaireProxy;
import beans.Categorie;

/**
 * Servlet implementation class ModificationCategorie
 */
@WebServlet("/ModificationCategorie")
public class ModificationCategorie extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModificationCategorie() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("categorie_id"));
		AnnuaireProxy annuaire = new AnnuaireProxy();
		Categorie categorie = annuaire.affichageCategorie(id);
		request.setAttribute("categorie", categorie);
		this.getServletContext().getRequestDispatcher("/WEB-INF/modificationcategorie.jsp").forward(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sujet = request.getParameter("sujet");
		int id = Integer.parseInt(request.getParameter("id"));
		AnnuaireProxy annuaire = new AnnuaireProxy();
		annuaire.modificationCategorie(sujet, id);
		this.getServletContext().getRequestDispatcher("/ListeCategorie").forward(request, response);
	}

}
