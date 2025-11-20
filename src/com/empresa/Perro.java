package com.empresa;

public class Perro {
	String Nombre="Principe";
	String Raza="Criollo";
	int Altura=4;

	public void ladrar() {
		System.out.println(Nombre + " esta ladrando");
	}
	
	public static void main(String[] args) {
		Perro perro = new Perro();
		System.out.println(perro.Altura);
		perro.ladrar();
	}

}
