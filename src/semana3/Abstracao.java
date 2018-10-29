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
		
		principal.onoff();
		apoio.onoff();
		principal.insereDisco(12);
		apoio.insereDisco(7); //opa!
		principal.onoff();
		apoio.onoff();
	}
}