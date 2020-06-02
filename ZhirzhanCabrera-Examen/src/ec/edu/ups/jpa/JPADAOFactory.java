package ec.edu.ups.jpa;

import ec.edu.ups.dao.AutorDAO;
import ec.edu.ups.dao.CapituloDAO;
import ec.edu.ups.dao.DAOFactory;
import ec.edu.ups.dao.LibroDAO;

public class JPADAOFactory extends DAOFactory {




	@Override
	public AutorDAO getAutorDAO() {
		// TODO Auto-generated method stub
		return new JPAAutorDAO();
	}

	@Override
	public CapituloDAO getCapituloDAO() {
		// TODO Auto-generated method stub
		return new JPACapituloDAO();
	}
	
	@Override
	public LibroDAO getLibroDAO() {
		// TODO Auto-generated method stub
		return new JPALibroDAO();
	}

}
