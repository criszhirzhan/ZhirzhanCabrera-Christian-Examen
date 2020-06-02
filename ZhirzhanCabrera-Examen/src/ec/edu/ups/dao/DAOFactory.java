package ec.edu.ups.dao;

import ec.edu.ups.jpa.JPADAOFactory;

public abstract class DAOFactory {
    // Sería mejor por inyección de objetos
    protected static DAOFactory factory = new JPADAOFactory();

    public static DAOFactory getFactory() {
	return factory;
    }

    public abstract AutorDAO getAutorDAO();
    public abstract CapituloDAO getCapituloDAO();
    public abstract LibroDAO getLibroDAO();
    

}
