package ec.edu.ups.modelos;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;



/**
 * Entity implementation class for Entity: Libro
 *
 */
@Entity

public class Libro implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private int codigo;
	private String nombre;
	private String ISBN;
	private int numPaginas;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "libro")
	private Set<Capitulo> capitulos = new HashSet<Capitulo>();
	
	public Libro() {
		super();
	}
	
	

	public Libro(int codigo, String nombre, String iSBN, int numPaginas, Set<Capitulo> capitulos) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		ISBN = iSBN;
		this.numPaginas = numPaginas;
		this.capitulos = capitulos;
	}



	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
	}

	public Set<Capitulo> getCapitulos() {
		return capitulos;
	}

	public void setCapitulos(Set<Capitulo> capitulos) {
		this.capitulos = capitulos;
	}



	
	
	
	
   
}
