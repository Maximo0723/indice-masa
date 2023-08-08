package Main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String [] nombres= new String[4];
		float [] alturas= new float[4];
		int [] pesos= new int[4];
		float imc= 0;
		float alturaCuadrado= 0;
		String clasificacionImc= "";
		for(int i= 0; i< 4; i++) {
			System.out.println("Ingrese el nombre de la persona " + i + ":");
			String nombrePersonas= scanner.next();
			nombres[i]= nombrePersonas;
			System.out.println("Ingrese la altura de la persona " + i + " en metros:");
			float alturaPersonas= scanner.nextFloat();
			alturas[i]= alturaPersonas;
			System.out.println("Ingrese el peso de la persona " + i + " en Kilogramos:");
			int pesoPersonas= scanner.nextInt();
			pesos[i]= pesoPersonas;
		}
		scanner.close();
		for(int i= 0; i< 4; i++) {
			alturaCuadrado= alturas[i] *  alturas[i];
			imc= pesos[i] / alturaCuadrado;
			if(imc < 18.5) {
				clasificacionImc= "BAJO PESO";
			}
			else if(imc > 18.5 && imc < 24.9) {
				clasificacionImc= "NORMAL";
			} else if(imc > 25 && imc < 29.9) {
				clasificacionImc= "SOBREPESO";
			} else if(imc > 30 && imc < 34.9) {
				clasificacionImc= "OBESIDAD GRADO I";
			} else if(imc > 35 && imc < 39.9) {
				clasificacionImc= "OBESIDAD GRADO II";
			} else if(imc > 40) {
				clasificacionImc= "OBESIDAD GRADO III";
			}
			System.out.println(nombres[i] + " IMC: " + imc + " Clasificación: " + clasificacionImc);
		}
	}

}
