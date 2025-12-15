package Strings;

public class IntroduccionString {

	public static void main(String[] args) {
		String Nombre="Jose Padilla";
		String Nombre2="Jose Padilla";
		String Nombre3="jose padilla";
		String Pais=new String("Colombia");
		String Pais2=new String("Colombia");
		System.out.println(Nombre.equals(Nombre2));
		System.out.println(Nombre.equals(Nombre3));
		System.out.println(Nombre.equalsIgnoreCase(Nombre3));
		//--------------------------//
		System.out.println("");
		System.out.println(Nombre==Nombre2);
		System.out.println(Pais==Pais2);
		String finalString=Nombre+Nombre2+Nombre3;
		System.out.println(finalString);
		String SegundoString=Nombre.concat(Nombre2).concat(Nombre3);
		System.out.println(SegundoString);
		
		
		
		
		
		
	}

}
