package Vehiculos;

import java.util.ArrayList;
import java.util.Scanner;
/*
 * Ha sido un poco más complicado de lo que parece. 
 * He creado un menu si el usuario decide alquilar o salir
 * Ademas tenemos un método que permita mostrar toda informacion posible durante la
 * ejecución del menú
 * Al escoger numero de matricula y dias, aparece el resultado de un precio total gracias al
 * metodo de mostrarPrecio 
 * 
 */


public class Main3 {

	public static void main(String[] args) {
		
	//Hemos creado un arrayList para todo tipo de vehiculos	
	ArrayList<Vehiculo> lista = new ArrayList<>();

	//Hacemos una lista para poder alquilar, meter nuevos coches, etc
	Coches coche1 = new Coches("12345TLF", 5);
	lista.add(coche1);
	Coches coche2 = new Coches("54321FRL", 2);
	lista.add(coche2);
	Coches coche3 = new Coches("98765FEO", 4);
	lista.add(coche3);
	
	MicroBuses miniBus1 = new MicroBuses("6789053trtr", 30);
	lista.add(miniBus1);
	
	VehiculosCargas VehiculoCraga1 = new VehiculosCargas("926344812gft", 3500);
	lista.add(VehiculoCraga1);
	VehiculosCargas VehiculoCraga2 = new VehiculosCargas("65426342gft", 4000);
	lista.add(VehiculoCraga2);
	
	Camiones camion1 = new Camiones("38752837lwoç", 12000);
	lista.add(camion1);
	//-----------------------------------------------------------
	
	Boolean salir = false;
	//Cuando devuelve el verdadero de salir introduciendo un cero, el bucle termina de ejecutar 
	while (salir==false) {
		System.out.println("Que quieres hacer?");
		System.out.println("");
		System.out.println("1- Alquilar un vehiculo");
		System.out.println("0- Salir");
		System.out.println("");
		System.out.println("Introduce una opcion:");
		Scanner en = new Scanner(System.in);
		int opcion = en.nextInt();
		if (opcion==1) {
			//Aparece toda la informacion posible
			mostrarVehiculosAlquiler(lista);
			
			System.out.println("Indica la matricula del vehiculo que quieres alquilar: ");
			Scanner in = new Scanner(System.in);
			String matricula = in.nextLine();
			
			System.out.println("Cuantos dias quieres alquilar?");
			int dias = in.nextInt();
			
			//Aparece la informacion de los precios
			mostrarPrecio(matricula, dias, lista);
		}
		if (opcion==0) salir = true;//Se acaba el bucle
		
	}
	
	
	}
	//Metodo para mostrar los precios de cualquier tipo de vehiculos
	public static void mostrarPrecio(String matricula, int dias, ArrayList<Vehiculo> lista) {
		java.util.Iterator<Vehiculo> recorrerLista = lista.iterator();
		
		//Se irá recorriendo toda la lista cuando el usuario ha insertado matricula y dias
		while (recorrerLista.hasNext()) {
			
			Vehiculo ejemplo = recorrerLista.next();
			
			if (matricula.equalsIgnoreCase(ejemplo.matriculas)) {
				
				if (ejemplo.tipoDeVehiculo.equals("Coche")) {
					Coches ejemplo1 = (Coches) ejemplo;
					ejemplo1.imprimirReserva(dias);
				}
				if (ejemplo.tipoDeVehiculo.equals("Vehiculo de carga")) {
					VehiculosCargas ejemplo2 = (VehiculosCargas) ejemplo;
					ejemplo2.imprimirReserva(dias);
					
				}
				if (ejemplo.tipoDeVehiculo.equals("Microbus")) {
					MicroBuses ejemplo3 = (MicroBuses) ejemplo;
					ejemplo3.imprimirReserva(dias);
					
				}
				if (ejemplo.tipoDeVehiculo.equals("Camion")) {
					Camiones ejemplo4 = (Camiones) ejemplo;
					ejemplo4.imprimirReserva(dias);
					
				}
			}
			
		}
		
	}
	//Mostrar todo tipo de vehiculos cuando el usuario ejecuta
	public static void mostrarVehiculosAlquiler(ArrayList<Vehiculo> lista) {
		//Se irá recorriendo toda informacion de los vehiculos como menu cuando iniciamos
		//un programa
		java.util.Iterator<Vehiculo> recorrerLista = lista.iterator();
		System.out.println("Estos son los vehiculos disponibles para alquilar: ");
		
		while (recorrerLista.hasNext()) {
			Vehiculo ejemplo = recorrerLista.next();
			System.out.println("");
			System.out.println("Matricula: "+ejemplo.getMatriculas()+" Tipo de vehiculo: "+ejemplo.tipoDeVehiculo);
			
		}
		//Tambien se puede hacer la implementacion con un bucle for
		/*
		for (int i=0; i<lista.size();++i) {
			Vehiculo ejemplo = lista.get(i);
			System.out.println("");
			System.out.println("Matricula: "+ejemplo.getMatriculas()+" Tipo de vehiculo: "+ejemplo.tipoDeVehiculo);
		}
		*/
		
	}
	


}
