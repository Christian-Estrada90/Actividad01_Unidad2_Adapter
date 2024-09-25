package ec.edu.ups.adapter.controller;

import ec.edu.ups.adapter.model.TemperaturaAdapter;

/**
 * 
 * @author Grupo 3
 *
 */
public class TemperaturaController {
	private String[] arraytemperatura;

	public TemperaturaController() {
		arraytemperatura = new String[3];
	}

	public void registrarTemperatura(String tipoDispositivo, double temperatura) {
		var temperaturaAdapter = new TemperaturaAdapter();
		var temperaturaCelsius = temperaturaAdapter.registrarTemperatura(tipoDispositivo, temperatura);
		arraytemperatura[0] = tipoDispositivo;
		arraytemperatura[1] = Double.toString(temperatura);
		arraytemperatura[2] = Double.toString(temperaturaCelsius);
	}

	public String[] getArraytemperatura() {
		return arraytemperatura;
	}

}
