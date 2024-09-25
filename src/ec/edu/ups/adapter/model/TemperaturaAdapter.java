package ec.edu.ups.adapter.model;

/**
 * 
 * @author Grupo 3
 *
 */
public class TemperaturaAdapter implements IGestionarTemperatura {

	CelsiusAdaptee celsius = new CelsiusAdaptee();
	FahrenheitAdaptee fahrenhei = new FahrenheitAdaptee();

	@Override
	public double registrarTemperatura(String tipoDispositivo, double temperatura) {
		double respuesta = 0;
		switch (tipoDispositivo) {
		case "Celsius":
			celsius.temperaturaCelsius(temperatura);
			respuesta = celsius.getTemperatura();
			break;

		case "Fahrenhei":
			fahrenhei.temperaturaCelsius(temperatura);
			respuesta = fahrenhei.getTemperatura();
			break;
		}
		return respuesta;
	}

}
