package semana3;

/**
 * Abstraia dois objeto da vida real em um objeto Java
 * coloque ao menos 3 mÃ©todos e 3 atributos 
 * encapsule todos os metodos e atributos
 *
 */

public class TocaDisco {
	private boolean emFuncionamento=false;
	private String marca;
	private String modelo;
	private boolean suporta45rpm;
	//getters e setters dos atributos
	protected String getMarca() {
		return marca;
	}
	
	protected String getModelo() {
		return modelo;
	}

	protectedboolean getSuporta45rpm() {
		return suporta45rpm;
	}
	
	protected boolean getEmFuncionamento() {
		return emFuncionamento;
	}
	
	protected void setMarca(String marca) {
		this.marca=marca;
	}
	
	protected void setModelo(String modelo) {
		this.modelo=modelo;
	}
	
	protected void setSuporta45rpm(boolean suporta45rpm) {
		this.suporta45rpm=suporta45rpm;
	}
	
	protected boolean setEmFuncionamento(boolean emFuncionamento) {
		if(this.emFuncionamento==emFuncionamento) break; //pula se nada mudou (evitar erros se algo na implementação do onoff é alterado, por padrão isso não aconteceria)
		this.emFuncionamento=emFuncionamento;
	}
	

	//métodos
	protected static void onoff() {
		if(getEmFuncionamento()==false) {
			setEmFuncionamento (true);
		} else{
			Agulha.levanta();
		setEmFuncionamento (false);
		}
		System.out.println("Seu " + getMarca() + " " + getModelo() + " está agora " + (getEmFuncionamento() ? "ligado." : "desligado."));
	}
	
	protected static void insereDisco(int polegadas) {
		if((polegadas==7) && (getSuporta45rpm==false)) {
			System.out.println("Disco não pode ser tocado.");
			Agulha.levanta();
		}
		if(polegadas!=12) {
			System.out.println("Insira apenas discos.");
			Agulha.levanta();
		}
		Agulha.abaixa();
	}
}

public class Agulha {
	private String tipo;
	private int peso;
	private int precisao;
	boolean estaLevantada=true;

protected String getTipo() {
	return tipo;
}

protected boolean getEstaLevantada(){
	return estaLevantada;
}

protected void setTipo(String tipo) {
	this.tipo=tipo;
}

protected void setPeso(int peso) {
	this.peso=peso;
}

protected void setPrecisao(int precisao) {
	this.precisao=precisao;
}

protected void setEstaLevantada(boolean estaLevantada) {
	this.estaLevantada=estaLevantada;
}

protected static void levanta() {
	if(TocaDisco.getEmFuncionamento()==false) System.out.println("Sua caríssima agulha de tipo " + getTipo() + " se perde em meio aos fios dos eletrodomésticos. Boa sorte");
	if(getEstaLevantada()==true) System.out.println("A agulha aponta para o teto e reproduz a melodia que consegue capturar de uma lâmpada.");
	System.out.println("O pitch diminui até finalmente chegar em 0. A música para");
	setEstaLevantada(true);
}

protected static void abaixa() {
	if(agulha.getEstaLevantada()==false) System.out.println("Você se pergunta de onde a agulha está tirando músicas do Slayer");
	System.out.println("A agulha retorna ao seu habitat natural, junto com a música.");
	Agulha.setEstaLevantada(true);
}
}

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