package eval2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MainPersona {
	static ArrayList<Persona> personas = new ArrayList<Persona>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		int numero;
		do {
			System.out.println("1. Añadir personas");
			System.out.println("2. Mostrar personas");
			System.out.println("3. ¿Cuantas personas viven en...?");
			System.out.println("4. Codigo postal");
			System.out.println("5. Salir");
			
			numero=teclado.nextInt();
			switch (numero){
			case 1: {
				System.out.println("1. Añadir personas");
				leerPersona();
				System.out.println("");break;
			}
			case 2: {
				System.out.println("2. Mostrar personas");
				mostrar(); //Esto sirve para mostrar
				System.out.println("");break;
			}
			case 3: {
				System.out.println("3. ¿Cuantas personas viven en...?");
				cuantasPersonasVivenEn();
				System.out.println("");break;
			}
			case 4: {
				System.out.println("4. Codigo postal");
				System.out.println("");break;
				
			}
			case 5: {
				System.out.print("Agur");
				System.out.println("");
			}break;
			default: {
				System.out.println("Solo numeros del 1 al 5");
				System.out.println("");
			}
			
			}
		}
		while(numero!=5);

	}
	
	
	public static void leerPersona() {
		Scanner scanpersst = new Scanner(System.in); //si pongo todo con un mismo scanner me da fallo porque "escribe" en blanco en algún campo
		Scanner scanpersin = new Scanner(System.in);
		System.out.println("introduce nombre");
		String nombre = scanpersst.nextLine();
		System.out.println("introduce direccion");
		String direccion = scanpersst.nextLine();
		System.out.println("introduce codigo postal");
		int codigoPostal = scanpersin.nextInt();
		System.out.println("introduce ciudad");
		String ciudad = scanpersst.nextLine();
		System.out.println("introduce edad");
		int edad = scanpersin.nextInt();
		
		Persona gente = new Persona(nombre, direccion, codigoPostal, ciudad, edad);
		gente.setNombre(nombre);
		gente.setDireccion(direccion);
		gente.setcod_pos(codigoPostal);
		gente.setCiudad(ciudad);
		gente.setEdad(edad);
		personas.add(gente);
	}
	public static void mostrar() {
		Iterator it = personas.iterator();
		while (it.hasNext()) {
			Persona pers = (Persona) it.next();
			System.out.println(pers);
		}
	}
	public static void cuantasPersonasVivenEn() {
		Scanner viven=new Scanner(System.in);
		int contador =0;
		System.out.println("introduce nombre de la ciudad");
		String city=viven.nextLine();
		for (Persona mostrar : personas) {
			if (mostrar.getCiudad().equalsIgnoreCase(city)) {
				contador++;
			}
		}
		if (contador == 1) {
		System.out.println("hay "+contador+" persona viviendo en "+ city);
		} else {
			System.out.println("hay "+contador+" personas viviendo en "+ city);
		}
	}
	
}
