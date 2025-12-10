package Opps;

public class BancoPrestamo {

	
	private String Nombre ="";
	private int Edad;
	private int Cantidad;
	
	public void SetNombre(String Nombre) {
		this.Nombre=Nombre;
	}
	
	public void SetEdad(int Edad) {
		if (Edad >=18 && Edad <=50) {
			this.Edad=Edad;
		}
		
		else {
			System.out.println("Ingrese una edad valida");
		}
			
		
	}
	
	public void SetCantidad(int Cantidad) {
		
		if (Cantidad>=10000 && Cantidad<=50000) {
			this.Cantidad=Cantidad;	
		}
		else {
			System.out.println("Ingrese una cantidad valida");
		}
		
	}
	
	
	public String GetNombre() {
		return Nombre;
	}
	
	public int GetEdad() {
		return Edad;
	}
	
	public int GetCantidad() {
		return Cantidad;
	}
	
	
}
