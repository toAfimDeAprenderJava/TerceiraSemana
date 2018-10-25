package semana3;

/**
 * Abstraia dois objeto da vida real em um objeto Java
 * coloque ao menos 3 métodos e 3 atributos 
 * encapsule todos os metodos e atributos
 *
 */

public class Abstracao {
	public static void main(String[] args) {
		Agulha at=new Agulha();
		at.setTipo("Shibata");
		at.setPeso(3);
		at.setPrecisao(6);
		TocaDisco principal=new TocaDisco();
		principal.setMarca("Rega");
		principal.setModelo("Planar P1");
		principal.setSuporta45rpm(true);
		
		TocaDisco apoio=new TocaDisco();
		apoio.setMarca("Technics");
		apoio.setModelo("1200 MK2");
		apoio.setSuporta45rpm(false);
		
		principal.onoff();
		apoio.onoff();
		at.levanta();
	}
}