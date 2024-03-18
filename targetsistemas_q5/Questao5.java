package targetsistemas_q5;

public class Questao5 {
	
	public static void main(String[] args) {
		
		String string = "Target";
		
		char[] caracteres = string.toCharArray();
        int tamanho = caracteres.length;
        char[] invertida = new char[tamanho];
        
        for (int i = tamanho - 1, j = 0; i >= 0; i--, j++) {
            invertida[j] = caracteres[i];
        }
        
        System.out.println("String original = "+string+"\n"+"invertida = "+new String(invertida));
	}
}
