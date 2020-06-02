package ec.edu.ups.jpa;

import ec.edu.ups.dao.LibroDAO;

import ec.edu.ups.modelos.Libro;

public class JPALibroDAO extends JPAGenericDAO<Libro, Integer> implements LibroDAO {

	public JPALibroDAO()  {
		super(Libro.class);
		// TODO Auto-generated constructor stub
	}

}
