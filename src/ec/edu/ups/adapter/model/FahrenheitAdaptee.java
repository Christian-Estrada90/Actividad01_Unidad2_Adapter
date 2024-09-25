package ec.edu.ups.adapter.model;

/**
 * 
 * @author Grupo 3
 *
 */
public class FahrenheitAdaptee {

	private double temperatura;
	
	public void temperaturaCelsius(double tem) {
		double resultado = (tem - 32) / 1.59;
		this.temperatura = Math.round(resultado * 100.0) / 100.0;
	}

	public double getTemperatura() {
		return temperatura;
	}	
	
}
