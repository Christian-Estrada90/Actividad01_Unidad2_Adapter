package ec.edu.ups.adapter.model;

/**
 * 
 * @author Grupo 3
 *
 */
public class CelsiusAdaptee {

	private double temperatura;
	
	public void temperaturaCelsius(double tem) {
		this.temperatura = Math.round(tem * 100.0) / 100.0;
	}

	public double getTemperatura() {
		return temperatura;
	}	
	
}
