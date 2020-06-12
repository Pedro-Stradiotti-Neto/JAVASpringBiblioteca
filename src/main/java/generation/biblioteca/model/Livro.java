package generation.biblioteca.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

@Entity
@Table(name = "TB_LIVRO")
public class Livro {

	@Column(name = "CD_ISBN", nullable = false)
	@Id
	private long isbn;
	
	@Column(name = "NM_LIVRO", nullable = false, length = 50)
	private String livro;
	
	@Column(name = "NM_AUTOR", nullable = false, length = 50)
	private String autor;
	
	@Column(name = "NM_EDITORA", nullable = false, length = 50)
	private String editora;
	
	@Column(name = "NM_GENERO", nullable = false, length = 50)
	private String genero;
	
	@Column(name = "NM_QUANTIDADE_PAGINAS", nullable = false)
	private long qtdPaginas;
	
	public long getIsbn() {
		return isbn;
	}
	
	public void setIsbn(long isbn) {
		this.isbn = isbn;
	}
	
	public String getLivro() {
		return livro;
	}
	
	@NotNull
	@Size(min = 2, max = 50)
	public void setLivro(String livro) {
		this.livro = livro;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public String getEditora() {
		return editora;
	}
	
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	public String getGenero() {
		return genero;
	}
	
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public long getQtdPaginas() {
		return qtdPaginas;
	}
	
	public void setQtdPaginas(long qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}
}
