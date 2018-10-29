package semana3;

public class TocaDisco {
	private boolean ligado=false;
	private boolean emFuncionamento=false;
	private String marca;
	private String modelo;
	private boolean suporta45rpm;
	private String agulhaTipo;
	private int agulhaPeso;
	private int agulhaPrecisao;
	private boolean agulhaLevantada=true;
	
	//getters e setters dos atributos
	protected String getMarca() {
		return this.marca;
	}
	
	protected String getModelo() {
		return this.modelo;
	}

	protected boolean getSuporta45rpm() {
		return this.suporta45rpm;
	}

	protected boolean getLigado() {
		return this.ligado;
	}
	protected boolean getEmFuncionamento() {
		return this.emFuncionamento;
	}
	
	protected String getAgulhaTipo() {
		return this.agulhaTipo;
	}
	protected int getAgulhaPeso() {
		return this.agulhaPeso;
	}
	protected int getAgulhaPrecisao() {
		return this.agulhaPrecisao;
	}
	protected boolean getAgulhaLevantada() {
		return this.agulhaLevantada;
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
	
	protected void setEmFuncionamento(boolean emFuncionamento) {
		this.emFuncionamento=emFuncionamento;
	}
	protected void setAgulhaTipo (String tipo) {
		this.agulhaTipo=tipo;
	}
	
	protected void setAgulhaPrecisao(int precisao) {
		this.agulhaPrecisao=precisao;
	}
	
	protected void setAgulhaPeso(int peso) {
		this.agulhaPeso=peso;
	}
	protected void setLigado(boolean ligado) {
		this.ligado=ligado;
	}
	//setAgulhaLevantada vem aí

	//métodos
	protected void onoff() {
		if(this.getLigado()==false) {
			this.setLigado (true);
		} else{
			this.agulhaLevanta();
		this.setLigado (false);
		}
		System.out.println("Seu " + this.getMarca() + " " + this.getModelo() + " está agora " + (this.getLigado() ? "ligado." : "desligado.")); //essa linha é pura majestade sintática
	}
	
	protected void insereDisco(int polegadas) {
		if((polegadas==7) && (this.getSuporta45rpm()==false)) {
			System.out.println("Disco não pode ser tocado.");
			this.setEmFuncionamento(false);
			this.agulhaLevanta(); //se não houver esse double check redundante, uma mensagem redundante é printada
		}
		if((polegadas!=7) && (polegadas!=12)) {
			System.out.println("Insira apenas discos.");
			this.setEmFuncionamento(false);
			this.agulhaLevanta();
		}
		else {
			this.setEmFuncionamento(true); //Espero que isso não seja confiar demais, até esse ponto não deveria ter nenhum erro
			this.agulhaAbaixa(); //disco é reconhecido e começa a girar
		}
	}
	
	protected void agulhaLevanta() {
		if(this.getLigado()==false) System.out.println("Sua caríssima agulha de tipo " + this.getAgulhaTipo() + " se perde em meio aos fios dos eletrodomésticos. Boa sorte");
		if((this.getAgulhaLevantada()) && (this.getLigado()) && (this.getEmFuncionamento())) System.out.println("A agulha aponta para o teto e reproduz a melodia que consegue capturar de uma lâmpada.");
		if(this.getEmFuncionamento()) {
			System.out.println("O pitch diminui até finalmente chegar em 0. A música para");
			this.agulhaLevantada=true;
		}
		else {
			System.out.println("A agulha se ergue");
			this.agulhaLevantada=true;
	}
	}

	protected void agulhaAbaixa() {
		if(this.getAgulhaLevantada()==false) System.out.println("Você se pergunta de onde a agulha está tirando músicas do Slayer");
		System.out.println("A agulha retorna ao seu habitat natural, junto com a música.");
		this.agulhaLevantada=false;
		this.setEmFuncionamento(true);
	}
}
