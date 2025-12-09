package Opps;

public class Kia extends Mazda{
	static String Modelo="x";

	public static void main(String[] args) {
	Mazda mz =new Mazda();
	Carro car =new Carro();
	System.out.println("El modelo es: " + Modelo);
	System.out.println("La marca es: " + mz.Nombre);
	System.out.println("El comportamiento es: ");
	mz.Run();
	car.Run();
	}

}
