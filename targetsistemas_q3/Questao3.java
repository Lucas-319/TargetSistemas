/*

3) Descubra a lógica e complete o próximo elemento:

a) 1, 3, 5, 7, ___

b) 2, 4, 8, 16, 32, 64, ____

c) 0, 1, 4, 9, 16, 25, 36, ____

d) 4, 16, 36, 64, ____

e) 1, 1, 2, 3, 5, 8, ____

f) 2,10, 12, 16, 17, 18, 19, ____


*/

package targetsistemas_q3;

public class Questao3 {
	
	public static void main(String[] args) {
		
		System.out.print("Padrao A = ");
		padraoA();	
		
		System.out.println();
		
		System.out.print("Padrao B = ");
		padraoB();	
		
		System.out.println();
		
		System.out.print("Padrao C = ");
		padraoC();	
		
		System.out.println();
		
		System.out.print("Padrao D = ");
		padraoD();	
		
		System.out.println();
		
		System.out.print("Padrao E = ");
		padraoE();
	}	
	
	public static void padraoA(){		
		for (int i = 0; i < 10; i++){
			if(i%2 != 0)
			System.out.print(i + " ");
		}
	}
	
	public static void padraoB(){
		int aux = 2;
		for (int i = 1; i < 8; i++){
			System.out.print(aux + " ");
			aux = aux * 2;
		}
	}
	
	public static void padraoC() {
		for (int i = 0; i < 8; i++) {
            System.out.print(i * i + " ");
        }
	}
	
	public static void padraoD() {
		for (int i = 2; i <= 10 + 1; i += 2) {
            System.out.print(i * i + " ");
        }
	}
	
	public static void padraoE() {
		int a = 1, b = 1, c;
        for (int i = 0; i < 7; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;
        }
	}
	
	public static void padraoF() {
		
	}
}
