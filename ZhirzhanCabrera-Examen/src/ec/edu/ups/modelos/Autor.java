package ec.edu.ups.modelos;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Autor
 *
 */
@Entity

public class Autor implements Serializable {

	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int codigoAutor;
	private String nombre;
	private String nacionalidad;
	
	@OneToOne
	@JoinColumn
	private Capitulo capitulo;
	
	public Autor() {
		super();
	}
	
	public Autor( String nombre, String nacionalidad) {
		super();
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
	}

	public Autor(int codigoAutor, String nombre, String nacionalidad, Capitulo capitulo) {
		super();
		this.codigoAutor = codigoAutor;
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.capitulo = capitulo;
	}
	
	



	public int getCodigoAutor() {
		return codigoAutor;
	}

	public void setCodigoAutor(int codigoAutor) {
		this.codigoAutor = codigoAutor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public Capitulo getCapitulo() {
		return capitulo;
	}

	public void setCapitulo(Capitulo capitulo) {
		this.capitulo = capitulo;
	}


	
	
   
}
