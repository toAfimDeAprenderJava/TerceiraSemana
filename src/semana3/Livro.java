package semana3;

//Classe abstrata Livro
public abstract class Livro {

	//Delcaração atributos do livro.
	private String titulo;
	private int qtdePagina;
	private String genero;
	private int paginaAtual;
	
	//Get e Set para outras classes utilizarem os atributos declarados para o livro.
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getQtdePagina() {
		return qtdePagina;
	}
	public void setQtdePagina(int qtdePagina) {
		this.qtdePagina = qtdePagina;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	//Criação metodos para classe Livro e todas possuem encapsulamento publico.
	public void abrirLivro (int pagina) {
		paginaAtual = pagina;
	}
	
	public void virarPagina() {
		paginaAtual = paginaAtual + 1;
	}
	
	public void fecharLivro() {
		paginaAtual = 0;
	}
	
}
