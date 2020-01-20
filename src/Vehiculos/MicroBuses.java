package Vehiculos;

public class MicroBuses extends Vehiculo {
	protected double base = 2;
	int numPlazas ;
	
	MicroBuses( String matriculas ,int numPlazas ){
		super(matriculas);
		this.numPlazas=numPlazas;
		this.tipoDeVehiculo="Microbus";
	}

	public double getPrecio(int numDias) {
		double total = super.alquiler* numDias + base*numPlazas;
		return total;
	}
	
	public void imprimirReserva(int numDias) {
		System.out.println("----------Lista de Micro-Bus----------");
		System.out.println("");
		System.out.println("Matricula: "+super.getMatriculas());
		System.out.println("Numero de plazas: "+this.numPlazas);
		System.out.println("Precio de la reserva: "+getPrecio(numDias));
	}

}

