package ec.edu.ups.modelos;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Capitulo
 *
 */
@Entity

public class Capitulo implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private int codigoCapitulo;
	private int numero;
	private String titulo;
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "capitulo")
	private Autor autor;
	
	@ManyToOne
	@JoinColumn
	private Libro libro;
	

	

	public Capitulo() {
		super();
	}


	public Capitulo(int codigoCapitulo, int numero, String titulo, Libro libro, Autor autor) {
		super();
		this.codigoCapitulo = codigoCapitulo;
		this.numero = numero;
		this.titulo = titulo;
		this.libro = libro;
		this.autor = autor;
	}
	
	


	public Capitulo(int numero, String titulo, Autor autor) {
		super();
		this.numero = numero;
		this.titulo = titulo;
		this.autor = autor;
	}


	public int getCodigoCapitulo() {
		return codigoCapitulo;
	}


	public void setCodigoCapitulo(int codigoCapitulo) {
		this.codigoCapitulo = codigoCapitulo;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public Libro getLibro() {
		return libro;
	}


	public void setLibro(Libro libro) {
		this.libro = libro;
	}


	public Autor getAutor() {
		return autor;
	}


	public void setAutor(Autor autor) {
		this.autor = autor;
	}


	@Override
	public String toString() {
		return "Capitulo [codigoCapitulo=" + codigoCapitulo + ", numero=" + numero + ", titulo=" + titulo + ", libro="
				+ libro + ", autor=" + autor + "]";
	}
	
	
   
}
