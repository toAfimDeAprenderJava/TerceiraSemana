package semana3;

/**
 * Abstraia dois objeto da vida real em um objeto Java
 * coloque ao menos 3 métodos e 3 atributos 
 * encapsule todos os metodos e atributos
 *
 */

public class Abstracao {
	public static void main(String[] args) {
		TocaDisco principal=new TocaDisco();
		principal.setMarca("Rega");
		principal.setModelo("Planar P1");
		principal.setSuporta45rpm(true);
		principal.setAgulhaTipo("Shibata");
		principal.setAgulhaPeso(3);
		principal.setAgulhaPrecisao(6);
		
		TocaDisco apoio=new TocaDisco();
		apoio.setMarca("Technics");
		apoio.setModelo("1200 MK2");
		apoio.setSuporta45rpm(false);
		apoio.setAgulhaTipo("Diamante");
		apoio.setAgulhaPeso(5);
		apoio.setAgulhaPrecisao(9);
		
		System.out.println("Aqui temos um " + principal.getMarca() + " " + principal.getModelo() + ", equipado com uma " + principal.getAgulhaTipo() + " de peso " + principal.getAgulhaPeso() + " e precis�o " + principal.getAgulhaPrecisao() + ".");
		principal.onoff();
		System.out.println("E n�o poderia faltar um " + apoio.getMarca() + " " + apoio.getModelo() + " equipado com uma " + apoio.getAgulhaTipo() + " de peso " + apoio.getAgulhaPeso() + " e precis�o " + apoio.getAgulhaPrecisao() + " conectado.");
		apoio.onoff();
		System.out.println("Vamos por o primeiro tt a teste inserindo um 12 polegadas.");
		principal.insereDisco(12);
		System.out.println("Como n�o sobrou dinheiro para comprar mais discos, vamos ter de testar com um ep velho do Jo�o e Maria achado na gaveta, que � um disco menor que deve ser rodado a um tal de 45 rpm.");
		apoio.insereDisco(7); //opa!
		System.out.println("Vamos aproveitar que estamos nesse clima de velharia e tentar inserir um disquete no toca disco 1, j� que parece que � s� ele que reproduz velharias menores.");
		principal.agulhaLevanta();
		principal.insereDisco(3); //was?
		System.out.println("No Spotify tem an�ncios, e em LP tem esses barulhos que me distraem. Estou desiludido com o mercado fonogr�fico, vou fazer o pr�ximo exerc�cio do desafio java");
		principal.onoff();
		apoio.onoff();
	}
}