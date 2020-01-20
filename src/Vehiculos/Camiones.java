package Vehiculos;
/*
 * Solo son exclusivamente para caminones que mas cargan de superior a 12.000 KG
 * por eso es una clase hija que va directamente a la clase padre "VehiculosCargas"
 */
public class Camiones extends VehiculosCargas {

	Camiones(String matriculas, int pma) {
		super(matriculas, pma);
		this.tipoDeVehiculo="Camion";
	}
	
	
	public double getPrecio(int numDias) {
		double total = super.alquiler* numDias + 20 *pma+40;
		return total;
	}
	
	public void imprimirReserva(int numDias) {
		System.out.println("----------Lista de camion----------");
		System.out.println("");
		System.out.println("Matricula: "+super.getMatriculas());
		System.out.println("PMA: "+this.pma);
		System.out.println("Precio de la reserva: "+getPrecio(numDias));
	}

	
	
	
}
