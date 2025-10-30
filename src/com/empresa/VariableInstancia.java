package com.empresa;

public class VariableInstancia {
	String nombre;
	void mostrarNombre() {
	System.out.println("Nombre: " + nombre);	
	}
	
	public static void main(String[] args) {
		VariableInstancia p1 = new VariableInstancia();
		p1.nombre="Jose";
		p1.mostrarNombre();

	}

}
