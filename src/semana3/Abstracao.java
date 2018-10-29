package semana3;

/**
 * Abstraia dois objeto da vida real em um objeto Java
 * coloque ao menos 3 mÃ©todos e 3 atributos 
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
		
		System.out.println("Aqui temos um " + principal.getMarca() + " " + principal.getModelo() + ", equipado com uma " + principal.getAgulhaTipo() + " de peso " + principal.getAgulhaPeso() + " e precisão " + principal.getAgulhaPrecisao() + ".");
		principal.onoff();
		System.out.println("E não poderia faltar um " + apoio.getMarca() + " " + apoio.getModelo() + " equipado com uma " + apoio.getAgulhaTipo() + " de peso " + apoio.getAgulhaPeso() + " e precisão " + apoio.getAgulhaPrecisao() + " conectado.");
		apoio.onoff();
		System.out.println("Vamos por o primeiro tt a teste inserindo um 12 polegadas.");
		principal.insereDisco(12);
		System.out.println("Como não sobrou dinheiro para comprar mais discos, vamos ter de testar com um ep do João e Maria, que é um disco menor que deve ser rodado a um tal de 45 rpm.");
		apoio.insereDisco(7); //opa!
		System.out.println("No Spotify tem anúncios, e em LP tem esses barulhos que me distraem. Estou desiludido com o mercado fonográfico, vou fazer o próximo exercício do desafio java");
		principal.onoff();
		apoio.onoff();
	}
}