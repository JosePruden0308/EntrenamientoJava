package Strings;

public class StringMetodos {

	public static void main(String[] args) {
		String Saludo ="Hola Mundo";
		System.out.println(Saludo);
		System.out.println("Longitud "+Saludo.length());
		System.out.println("En mayusculas: "+Saludo.toUpperCase());
		System.out.println("¿Contiene 'Mun'? "+ Saludo.contains("Mun"));
		System.out.println("Reemplazo: "+ Saludo.replace("Mundo", "Java"));
		System.out.println(Saludo.concat(" Bello"));
		System.out.println("¿Termina en 'Hola'? "+Saludo.endsWith("Mundo"));
	}

}
