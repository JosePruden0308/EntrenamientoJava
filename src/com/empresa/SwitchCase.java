package com.empresa;

public class SwitchCase {

	public static void main(String[] args) {
		int dia=7;
		String modulo="Contabilidad";
		
		switch(modulo)
		{
		case "Contabilidad": System.out.println("Ingreso al modulo de contabilidad");
		break;
		
		case "Presupuesto": System.out.println("Ingreso al modulo de presupuesto");
		break;
		
		case "Tesoreria": System.out.println("Ingreso al modulo de tesoreria");
		break;
		
		case "Nomina": System.out.println("Ingreso al modulo de nomina");
		break;
		
		case "Inventario":System.out.println("Ingreso al modulo de inventario");
		break;
		
		case "Indycom": System.out.println("Ingreso al modulo de industria y comercio");
		break;
		
		case "Predial": System.out.println("Ingreso al modulo de predial");
		break;
		
		default:
		System.out.println("Regrese a la pagina y escoja un modulo");
		}

	}

}
