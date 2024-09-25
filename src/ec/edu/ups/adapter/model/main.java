package ec.edu.ups.adapter.model;

public class main {

	
	public static void main(String[] args) {
		TemperaturaAdapter tem = new TemperaturaAdapter();
		double resultado = 0;
		resultado = tem.registrarTemperatura("Fahrenhei", 102.5);
		System.out.println("Fahrenhei: " + resultado);
		resultado = tem.registrarTemperatura("Celsius", 102.5);
		System.out.println("Celsius: " + resultado);
	}
	
}
