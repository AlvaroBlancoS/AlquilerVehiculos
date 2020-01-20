package Vehiculos;

public class Coches extends Vehiculo {
	protected double base=1.5;

	int numPlazas;
	
	Coches(String matriculas, int numPlazas){
		super(matriculas);
		this.numPlazas= numPlazas;
		this.tipoDeVehiculo="Coche";
	}
	
	public double getPrecio(int numDias) {
		double total = super.alquiler* numDias + base*numPlazas*numDias;
		return total;
	}
	
	public void imprimirReserva(int numDias) {
		System.out.println("--------------------Lista de coche--------------------");
		System.out.println("");
		System.out.println("Matricula: "+super.getMatriculas());
		System.out.println("Numero de plazas: "+this.numPlazas);
		System.out.println("Precio de la reserva: "+getPrecio(numDias));
	}
}
