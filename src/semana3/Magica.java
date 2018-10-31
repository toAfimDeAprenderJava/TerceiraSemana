package semana3;

import javax.swing.JOptionPane;

public class Magica {

	public static String texto(String msg) {
		return JOptionPane.showInputDialog(msg);
	}
	
	public static int inteiro (String msg) {
		return Integer.parseInt(texto(msg));
	}
	
	public static double decimal(String msg) {
		return Double.parseDouble(texto(msg));
	}
}
