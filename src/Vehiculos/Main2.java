package Vehiculos;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * A partir de entonces, ya no solo queremos informacion.
 * Ahora queremos que cuanto costaría el alquiler de cada vehiculo
 */

public class Main2 {

	public static void main(String[] args) {
		//Hemos creado un arrayList para coches
		ArrayList<Coches> lista = new ArrayList<>();
		Coches coche1 = new Coches("12345TLF", 5);
		lista.add(coche1);
		Coches coche2 = new Coches("54321FRL", 2);
		lista.add(coche2);
		Coches coche3 = new Coches("98765FEO", 4);
		lista.add(coche3);
		//Hemos creado un arrayList para microBuses
		ArrayList<MicroBuses> lista2 = new ArrayList<>();
		MicroBuses miniBus1 = new MicroBuses("6789053trtr", 30);
		lista2.add(miniBus1);
		
		//Hemos creado un arrayList para vehiculos Cargas 
		ArrayList<VehiculosCargas> lista3 = new ArrayList<>();
		
		VehiculosCargas VehiculosCarga = new VehiculosCargas("926344812gft", 3500);
		lista3.add(VehiculosCarga);
		VehiculosCargas VehiculosCarga2 = new VehiculosCargas("65426342gft", 4000);
		lista3.add(VehiculosCarga2);
		
		//Hemos creao un arrayList para camiones 
		ArrayList<Camiones> lista4 = new ArrayList<>();
		Camiones camion1 = new Camiones("38752837lwoç", 12000);
		lista4.add(camion1);
		
		//El usuario tendrá que escribir números de dias
		Scanner in = new Scanner(System.in);
		System.out.println("Cuandos dias quieres alquilar cada vehiculo?");
		int dias = in.nextInt();
		
		//Implementa toda la informacion de los coches
		for (Coches c : lista) {
			System.out.println("");
			c.imprimirReserva(dias);
		}
		
		//Implementa toda la informacion de los micro Buses
		for (MicroBuses m: lista2) {
			System.out.println("");
			m.imprimirReserva(dias);
		}
		
		//Implementa toda la informacion de los vehiculos de cargas
		for (VehiculosCargas v : lista4) {
			System.out.println("");
			v.imprimirReserva(dias);
		}
		
		//Implementa toda la informacion de los camiones 
		for (Camiones cm : lista4) {
			System.out.println("");
			cm.imprimirReserva(dias);
			
		}
		
		
		
		
		
		
	}

}
