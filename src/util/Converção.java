package util;

public class Converção {
	
	public static final double DOLARVALOR = 4.10;
	
	public static final String IOF = "6%";
	
	public static double conver (double valor) {
		return DOLARVALOR * valor;
	}
	
	
	public static double taxa (double pagar) {
		return 0.06 * pagar;
	}
	public static double total (double pagar, double total) {
		return pagar + total;
	}
	
}
