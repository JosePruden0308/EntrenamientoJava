package ManejoExcepciones;

import java.io.*;

public class EjemploMultiCatch {

	public static void main(String[] args) {
		
		try {
			int resultado=10/0;//Esto arrojaría error aritmetico
			FileReader file=new FileReader("archivo.txt");
			
		}
		catch (ArithmeticException | IOException e ) {
			System.out.println("Ocurrió una excepción, la excepción es: "+e.getClass().getSimpleName());
		}
		
	}

}
