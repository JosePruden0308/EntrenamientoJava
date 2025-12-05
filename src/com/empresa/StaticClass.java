package com.empresa;

public class StaticClass {
	
int i=0;
static int j=199; 

	public static void main(String[] args) {
		
System.out.println(StaticClass.j);

StaticClass a = new StaticClass();

System.out.println(a.i);

int Resultado = StaticClass.sumar(7, 16);
System.out.println("El rsultado de 7 + 16 es: " + Resultado);
	}

	public static int sumar(int a,int b) {
		return a+b;
	}

}
