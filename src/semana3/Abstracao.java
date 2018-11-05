package semana3;

/**
 * Abstraia dois objeto da vida real em um objeto Java
 * coloque ao menos 3 m√©todos e 3 atributos 
 * encapsule todos os metodos e atributos
 */

public class Abstracao  {
	public static void main(String[] args) {
		
// Objetos vida real		
	
Carro carro = new Carro();
	carro.setMarca ("Honda ");
	carro.setModelo ("Civic ");
	carro.setAno ("2020 \n");
	carro.setComputador ("*Computador de bordo com piloto autom·tico; \n");
	carro.setFlex ("*Gasolina/Etanol; \n");
	carro.setVelocidade ("*Velocidade m·xima 279 Km/h \n");
	
	// 2∫ OBJETO 

	Carro c = new Carro();
c.setMarca ("Toyota ");
c.setModelo ("Corolla ");
c.setAno ("2020 \n");	
c.setComputador ("*Computador de bordo; \n");
c.setFlex ("*Gasolina/Etanol; \n"); 
c.setVelocidade ("*Velocidade m·xima 249 Km/h");

System.out.println ("CIVIC X COROLLA \n Carros rivais! \n \n" + carro.niu() + "\n"
+ c.niu());
	}
}

class Carro {
	private String marca;
	private String modelo;
	private String ano;
private String computador;
	private String flex;
	private String velocidade;

	public String getMarca() {
	return this.marca;}
public void setMarca(String marca) {
this.marca=marca;}
	public String getModelo() {
return this.modelo;}
	public void setModelo(String modelo) {
this.modelo=modelo;}
	public String getAno() {
		return this.ano;}
	public void setAno(String ano) {
		this.ano=ano;}
		public String getComputador() {
	return this.computador;}
	public void setComputador(String computador) {
		this.computador=computador;}
	public String getFlex() {
		return this.flex;}
	public void setFlex(String flex) {
this.flex=flex;}
	public String getVelocidade() {
		return this.velocidade;}
	public void setVelocidade(String velocidade) {
	this.velocidade=velocidade;}
	String niu()
{
	 	return this.getMarca() + this.getModelo() + this.getAno() + this.getComputador() + this.getFlex() + this.getVelocidade(); 		
}

}