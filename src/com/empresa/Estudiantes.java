package com.empresa;

public class Estudiantes {
	
	public Estudiantes() {
		
		System.out.println("Hola, estoy en el constructor");
		
	}
	
	int Numero=20;
	String Nombre="";
	
public Estudiantes(int i, String n) {
	
		Numero=i;
		Nombre=n;
	}

public void desplegar() {
	System.out.println("Número es " + Numero + " y Nombre es " + Nombre);
}
		
	public static void main(String[] args) {
	
		Estudiantes est=new Estudiantes();
		Estudiantes est2=new Estudiantes(3,"Jose");
		est2.desplegar();
		
		
	}

}
