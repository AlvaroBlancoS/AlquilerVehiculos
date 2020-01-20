package Vehiculos;

public class Vehiculo {
	protected int dias;
	protected String matriculas;
	protected double alquiler= 50;
	protected String tipoDeVehiculo;

	Vehiculo(String matriculas){
		 this.matriculas=matriculas;
	 }
	
	public int getDias() {
		return dias;
	}

	public void setDias(int dias) {
		this.dias = dias;
	}


	public String getMatriculas() {
		return matriculas;
	}


	
	

}

 
