package Opps;

public class Mazda extends Carro {
	
	String Nombre="Mazda";
	
	public void getNombre() {
		System.out.println(Nombre);
		System.out.println(super.Nombre);
	}
	
	public void Run() {
		System.out.println("El mazda está transitando");
		super.Run();
	}
	
	Mazda() {
		//super();
		System.out.println("Llamando al constructor de Mazda");
	}
	
	public static void main(String[] args) {
		
		//Carro carr = new Carro();
		//System.out.println(Nombre);
		//carr.Run();
		
		//Primer uso de palabra reservada super
		Mazda mz=new Mazda();
		mz.getNombre();
		
		//Segundo uso de palabra reservada super
		mz.Run();
		
	}
	
	
	

}
