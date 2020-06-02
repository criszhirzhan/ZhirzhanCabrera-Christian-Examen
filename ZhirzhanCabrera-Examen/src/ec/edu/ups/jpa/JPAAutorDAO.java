package ec.edu.ups.jpa;

import javax.persistence.Persistence;

import ec.edu.ups.dao.AutorDAO;
import ec.edu.ups.modelos.Autor;


public class JPAAutorDAO extends JPAGenericDAO<Autor, Integer> implements AutorDAO{

	public JPAAutorDAO() {
		// TODO Auto-generated constructor stub
		super(Autor.class);
	}

}
