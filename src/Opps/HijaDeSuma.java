package Opps;

public class HijaDeSuma extends Suma{

	public static void main(String[] args) {
	Suma sum= new Suma();
	sum.Sumar(12, 26);
	sum.Sumar(18,190, 97);
	double d=sum.Sumar(0.7, 1.9, 2.1);
	System.out.println("La suma es: "+d);
	}

}
