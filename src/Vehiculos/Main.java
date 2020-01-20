package Vehiculos;

import java.util.ArrayList;

public class Main {
	/*
	 * Voy a crear de modo sencillo que sólo trae la información con ArrayList y por
	 * supuesto utilizar el bucle for para recorrer la lista que acabamos de crear
	 */

	public static void main(String[] args) {

		ArrayList<Vehiculo> lista = new ArrayList<>();

		// Son los tres coches
		Coches coche1 = new Coches("12345TLF", 5);
		lista.add(coche1);
		Coches coche2 = new Coches("54321FRL", 2);
		lista.add(coche2);
		Coches coche3 = new Coches("98765FEO", 4);
		lista.add(coche3);

		// es un micro-bus
		MicroBuses miniBus1 = new MicroBuses("6789053trtr", 30);
		lista.add(miniBus1);

		// tenemos dos vehiculos de cargas
		VehiculosCargas VehiculoCraga1 = new VehiculosCargas("926344812gft", 3500);
		lista.add(VehiculoCraga1);
		VehiculosCargas VehiculoCraga2 = new VehiculosCargas("65426342gft", 4000);
		lista.add(VehiculoCraga2);

		// y tenemos un camion que ha superado más de 12000 KG
		Camiones camion1 = new Camiones("38752837lwoç", 12100);
		lista.add(camion1);

		// Recorremos toda la informacion que hay en la lista
		for (int i = 0; i < lista.size(); ++i) {
			Vehiculo ejemplo = lista.get(i);
			System.out.println("");
			System.out.println("Matricula: " + ejemplo.getMatriculas() + " Tipo de vehiculo: " + ejemplo.tipoDeVehiculo);
		}

	}

}
