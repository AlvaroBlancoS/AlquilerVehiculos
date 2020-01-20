package Vehiculos;

/*
 * Son para vehiculos de cargas pesadas de 3.500 Kg y 
 * superior a 3500 kg y hasta 12.000kg
 */
public class VehiculosCargas extends Vehiculo {
	protected int pma;
	
	
	VehiculosCargas(String matriculas, int pma) {
		super(matriculas);
		this.pma=pma;
		this.tipoDeVehiculo="Vehiculo de carga";
	}
	
	
	public double getPrecio(int numDias) {
		double total = super.alquiler* numDias + 20 *pma;
		return total;
	}
	
	public void imprimirReserva(int numDias) {
		System.out.println("----------Lista de Vehiculo de carga----------");
		System.out.println("");
		System.out.println("Matricula: "+super.getMatriculas());
		System.out.println("PMA: "+this.pma);
		System.out.println("Precio de la reserva: "+getPrecio(numDias));
	}

	
	
	

}
