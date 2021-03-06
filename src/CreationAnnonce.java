

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import DefaultNamespace.AnnuaireProxy;
import beans.Categorie;

/**
 * Servlet implementation class creationAnnonce
 */
@WebServlet("/creationAnnonce")
public class CreationAnnonce extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreationAnnonce() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		AnnuaireProxy annuaire = new AnnuaireProxy();
		Categorie[] categories = annuaire.affichageCategories();
		request.setAttribute("categories", categories);
		this.getServletContext().getRequestDispatcher("/WEB-INF/CreationAnnonce.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String nom = request.getParameter("nom");
		 String adresse = request.getParameter("adresse"); 
		 String numero = request.getParameter("numero");
		 int categorie = Integer.parseInt(request.getParameter("categorie"));
		 		 
		 AnnuaireProxy annuaire = new AnnuaireProxy();
		 annuaire.creationAnnonce(categorie, nom, adresse, numero);
		 
		 this.getServletContext().getRequestDispatcher("/WEB-INF/admin.jsp").forward(request, response);
	}

}
