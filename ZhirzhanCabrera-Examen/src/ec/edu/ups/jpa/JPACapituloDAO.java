package ec.edu.ups.jpa;

import ec.edu.ups.dao.AutorDAO;
import ec.edu.ups.dao.CapituloDAO;
import ec.edu.ups.modelos.Autor;
import ec.edu.ups.modelos.Capitulo;


public class JPACapituloDAO  extends JPAGenericDAO<Capitulo, Integer> implements CapituloDAO {

	public JPACapituloDAO() {
		super(Capitulo.class);
		// TODO Auto-generated constructor stub
	}

}
