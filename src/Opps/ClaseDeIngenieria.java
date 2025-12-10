package Opps;

public class ClaseDeIngenieria implements Estudiante{

	public static void main(String[] args) {
		ClaseDeIngenieria cdi= new ClaseDeIngenieria();
		ClaseDeMedicina cdm = new ClaseDeMedicina();
		cdi.MostrarNombre();
		cdi.ObtenerGrado();
		cdi.ObtenerNumeroDeEstudiantes();
		cdi.ObtenerUniversidad();
		cdi.ObtenerNombreInterface();
		System.out.println("*************************************************");
		cdm.MostrarNombre();
		cdm.ObtenerGrado();
		cdm.ObtenerNumeroDeEstudiantes();
		cdm.ObtenerUniversidad();
		cdm.ObtenerNombreInterface();
		
	}

	
	public void MostrarNombre() {
		System.out.println("Hola, somos estudiantes de ingeniería");
	}

	
	public void ObtenerNumeroDeEstudiantes() {
		System.out.println("Somos 50 estudiantes");
	}

	
	public void ObtenerGrado() {
		System.out.println("Somos de quinto semestre");
	}
	
	public void ObtenerUniversidad() {
		System.out.println("La universidad es: " + Universidad);
	}


	
	public void ObtenerNombreInterface() {
		
		
	}
	
}
