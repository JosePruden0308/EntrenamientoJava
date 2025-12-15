package ManejoExcepciones;


public class FinalyBlock {

	public static void main(String[] args) {
		Integer Resultado=null;
		try {
			System.out.println("Intentando dividir ...");
			Resultado = 10/0;
			System.out.println("Resultado: "+ Resultado);
			System.out.println("Guardando resultado en la base de datos");
		}
		catch(ArithmeticException e) {
			System.out.println("Error: División por cero");
		}
		finally {
			System.out.println("Cerrando conexión a la BD");
		}
	}

}
