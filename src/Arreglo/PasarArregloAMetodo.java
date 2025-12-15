package Arreglo;

public class PasarArregloAMetodo {
	
	public static void Encontrar(int Arreglo3[]){

		int min =Arreglo3[0];
		for(int i=0;i<Arreglo3.length;i++) {
			if (min > Arreglo3[i]) {
				min=Arreglo3[i];
			}
		}
		System.out.println("El elemento menor es: "+min);
	}
	
	public static int[] getArreglo() {
		return new int[] {2,5,76,1,21,87,9};
	}
	
	

	public static void main(String[] args) {
		
		PasarArregloAMetodo arr = new PasarArregloAMetodo();
		int ArregloPrueba[]= {87,29,23,54,18,17};
		arr.Encontrar(ArregloPrueba);
		
		//-------------------------------------------//
		
		int ArregloCuarto[]=arr.getArreglo();
		System.out.println(ArregloCuarto[1]);
		
	}

}
