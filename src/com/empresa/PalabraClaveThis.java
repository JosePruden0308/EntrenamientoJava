package com.empresa;

public class PalabraClaveThis {
	
	int Numero_Matricula;
	String Nombre;
	String Grado;
	
		public PalabraClaveThis(int i, String n, String s){
			Numero_Matricula=i;
			Nombre=n;
			Grado=s;
			
			
		}
		
		public void display(){
			System.out.println("Numero matricula: " + Numero_Matricula + ", Nombre es: " + Nombre + ", Clase: " + Grado);
			
		}

		
	
	public static void main(String[] args) {
		PalabraClaveThis est = new PalabraClaveThis(10, "Jorge", "Segundo");
		est.display();
	}

}
