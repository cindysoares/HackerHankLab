
import java.util.Scanner;


public class NumeraisRomanos {

	private static enum RomanoBase {
		I(1), V(5, I), X(10, I), L(50, X), C(100, X), D(500, C), M(1000, C);
		
		int valor;
		RomanoBase diferenca;
		private RomanoBase(int valor) {
			this.valor = valor;
		}
		private RomanoBase(int valor, RomanoBase diferenca) {
			this(valor);
			this.diferenca = diferenca;
		}
		public boolean igualOuMaiorDiferenca(int n) {
			return n >= valor - diferenca.valor ;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		System.out.println(integerToRoman(n));
	}

	static String integerToRoman(int num){
		String romano = "";
		RomanoBase romanoBase = null;
		if(num>=RomanoBase.M.valor || RomanoBase.M.igualOuMaiorDiferenca(num)) {
			romanoBase = RomanoBase.M;
		} else if (num>=RomanoBase.D.valor || RomanoBase.D.igualOuMaiorDiferenca(num)) {
			romanoBase = RomanoBase.D;
		} else if (num>=RomanoBase.C.valor || RomanoBase.C.igualOuMaiorDiferenca(num)) {
			romanoBase = RomanoBase.C;
		} else if (num>=RomanoBase.L.valor || RomanoBase.L.igualOuMaiorDiferenca(num)) {
			romanoBase = RomanoBase.L;
		} else if (num>=RomanoBase.X.valor || RomanoBase.X.igualOuMaiorDiferenca(num)) {
			romanoBase = RomanoBase.X;
		} else if (num>=RomanoBase.V.valor || RomanoBase.V.igualOuMaiorDiferenca(num)) {
			romanoBase = RomanoBase.V;
		} else {
			romanoBase = RomanoBase.I;
		}
		
		int quociente = num/romanoBase.valor;		
		
		if(quociente==0) {
			romano += romanoBase.diferenca.name() + romanoBase.name();
			int resto = num - (romanoBase.valor-romanoBase.diferenca.valor);
			if(resto>0){
				romano+=integerToRoman(resto);
			}
		} else {
			for (int i = 0; i < quociente; i++) {
				romano += romanoBase.name();			
			}
			int resto = num%romanoBase.valor;
			if(resto>0){
				romano+=integerToRoman(resto);
			}
		}		
		
		return romano;
	}
}
