package semana3;

/**
 * Abstraia dois objeto da vida real em um objeto Java coloque ao menos 3
 * métodos e 3 atributos encapsule todos os metodos e atributos
 *
 */
public class Abstracao {

	public abstract class ControleRemoto {

		private boolean ligada;;
		private int mudarcanal;
		private String volume;
		private boolean desligartv;

		public void ligar() {
			ligada = true;
		}
		public void setligada(boolean ligada) { 
 
			this.ligada = ligada; 
		}

		public boolean getliga() {
			return ligada;

		}

		public void mudarcanal(int canal) {
			if (canal < 1 || canal > 60)
				throw new RuntimeException();
			this.mudarcanal = canal;
		}
		public void set(int mudarcanal) { 

			this.mudarcanal = mudarcanal; 
		}
		public int getmudarcanal() {

			return mudarcanal;

		}

		public void volume(double quantidade) {
			this.volume = this.volume += quantidade;
		}
		public void volume(String volume) { 
			this.volume = volume; 

		}
		public String getvolume() {

			return volume;
		}

		public void desligartv() {
			desligartv = true;
		}
		public void setTitulo(boolean desligartv) {  
			this.desligartv = desligartv; 
		}
		public boolean getdesligartv() {
			return desligartv;
		}

	}
}
