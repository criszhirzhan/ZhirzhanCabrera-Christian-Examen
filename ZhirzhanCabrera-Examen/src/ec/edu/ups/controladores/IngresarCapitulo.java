package ec.edu.ups.controladores;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ec.edu.ups.dao.AutorDAO;
import ec.edu.ups.dao.CapituloDAO;
import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.modelos.Autor;
import ec.edu.ups.modelos.Capitulo;

/**
 * Servlet implementation class IngresarCapitulo
 */
@WebServlet("/IngresarCapitulo")
public class IngresarCapitulo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IngresarCapitulo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		String numCapitulo="";
		String titulo="";
		Autor autor = new Autor();
		Capitulo capitulo= new Capitulo();
		String autorN= "";
		
		String accion = request.getParameter("ingresarCapitulo");
		if (accion.equals("IngresarCapitulo")) {
			numCapitulo = request.getParameter("numeroCapitulo");
			titulo = request.getParameter("titulo");
			
			
			autorN = request.getParameter("tip");
			AutorDAO autord = DAOFactory.getFactory().getAutorDAO();
			CapituloDAO capitulod = DAOFactory.getFactory().getCapituloDAO();
			autor= autord.buscar("nombre", autorN);
			
			capitulo = new Capitulo( Integer.parseInt(numCapitulo) , titulo, autor);
			
			
			
			autor.setCapitulo(capitulo);
			autord.update(autor);
			
			capitulod.create(capitulo);
			


		}
		
		try {
			getServletContext().getRequestDispatcher("/Paginas/index.html").forward(request, response);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}

}
