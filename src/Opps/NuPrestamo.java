package Opps;

public class NuPrestamo extends BancoPrestamo{

	public static void main(String[] args) {
		
		NuPrestamo prestamo= new NuPrestamo();
		prestamo.SetEdad(25);
		prestamo.SetNombre("Jose");
		prestamo.SetCantidad(300000);
		System.out.println("El nombre es: "+prestamo.GetNombre());
		System.out.println("La edad es: " + prestamo.GetEdad());
		System.out.println("La cantidad es: $"+prestamo.GetCantidad());
    }
	
}
