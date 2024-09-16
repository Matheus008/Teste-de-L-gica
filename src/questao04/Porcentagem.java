package questao04;

public class Porcentagem {

	public static void main(String[] args) {
		
		double sP = 67836.43;
		double rJ = 36678.66;
		double mG = 29229.88;
		double eS = 27165.48;
		double outros = 19849.53;
		double total = sP + rJ + mG + eS + outros;
		
		
		System.out.println("Total: " + total);
		System.out.println("SP: " + (sP / total) * 100 + " %");
		System.out.println("RJ: " + (rJ / total) * 100 + " %");
		System.out.println("MG: " + (mG / total) * 100 + " %");
		System.out.println("ES: " + (eS / total) * 100 + " %");
		System.out.println("Outros: " + (outros / total) * 100 + " %");
	}

}
