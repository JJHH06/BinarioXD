import java.util.Scanner;

public class PrincipalBinario {

	public PrincipalBinario() {
		// TODO Auto-generated constructor stub
		
	}
	public static double convertirBinario(String input) {
		String[] binario = input.split("");
		String exponente = "";
		String fraccion = "";
		double resultadoExponente = 0;
		double resultadoFraccion = 0;
		double resultado = 0;
		for (int i = 1; i < 9; i++) {
			exponente +=binario[i];
		}
		for (int i = 9; i < binario.length; i++) {
			fraccion += binario[i];
		}
		int contador = exponente.length()-1;
		for (int i = 0 ; i < exponente.length(); i++) {
			resultadoExponente += (Character.getNumericValue(exponente.charAt(contador)))*Math.pow(2, i);
			contador--;
		}
		contador = 0;
		resultadoExponente -=127;
		resultadoExponente = Math.pow(2, (resultadoExponente));
		//System.out.println(resultadoExponente);
		
		for (int i = 0 ; i < fraccion.length(); i++) {
			if(Character.getNumericValue(fraccion.charAt(i)) == 1)
				resultadoFraccion += Character.getNumericValue(fraccion.charAt(i))*Math.pow(2, -(i+1));
			
		}
		
		resultado = (resultadoFraccion +1)*resultadoExponente;
		if(binario[0].equals("1"))
			resultado = -resultado;
		
		
		
		
		
		
		return resultado;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner linea = new Scanner(System.in);
		String input = "";
		System.out.println("Ingrese el binario xd");
		input = linea.nextLine();
		
		
		System.out.println("El numero es:");
		System.out.println(convertirBinario(input));

	}

}
