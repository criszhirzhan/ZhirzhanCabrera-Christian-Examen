package ec.edu.ups.controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.dao.AutorDAO;
import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.modelos.Autor;


/**
 * Servlet implementation class IngresarAutor
 */
@WebServlet("/IngresarAutor")
public class IngresarAutor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IngresarAutor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		AutorDAO autor = DAOFactory.getFactory().getAutorDAO();
		Autor autor1 = new Autor("Julio Ramirez", "Ecuatoriana");
		Autor autor2 = new Autor("Gabriel Garcia Marquez", "Colombiana");
		Autor autor3 = new Autor("Pablo Neruda", "Chilena");

		
		autor.create(autor1);
		autor.create(autor2);
		autor.create(autor3);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
