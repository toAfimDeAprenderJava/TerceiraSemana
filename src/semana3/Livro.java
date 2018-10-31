package semana3;

public class Livro {
	private int totalPaginas;
	private String autor;
	private String editora;
	
	public String getAll() {
		return totalPaginas + "\n" + autor + "\n" + editora;
	}
	
	public void setAll(int t, String a, String e) {
		totalPaginas = t;
		autor = a;
		editora = e;
	}
	
	public Livro() {
		super();
	}
	
	public Livro(int totalPaginas, String autor, String editora) {
		super();
		this.totalPaginas = totalPaginas;
		this.autor = autor;
		this.editora = editora;
	}
	public int getTotalPaginas() {
		return totalPaginas;
	}
	public void setTotalPaginas(int totalPaginas) {
		this.totalPaginas = totalPaginas;
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
	
	
	
}
