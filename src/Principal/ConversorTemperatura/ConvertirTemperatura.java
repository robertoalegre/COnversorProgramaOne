package Principal.ConversorTemperatura;

import javax.swing.JOptionPane;

public class ConvertirTemperatura {

    // GRADOS CELSIUS A OTRAS UNIDADES
	
	public void ConvertirGradosCelsiusAGradosFahrenheit(double valorRecibido) {
		double gradosFahrenheit = valorRecibido * 1.8 + 32;
		gradosFahrenheit = (double) Math.round(gradosFahrenheit * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + gradosFahrenheit + " grados Fahrenheit");
	}
	
	public void ConvertirGradosCelsiusAGradosKelvin(double valorRecibido) {
		double gradosKelvin = valorRecibido + 273.15;
		gradosKelvin = (double) Math.round(gradosKelvin * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + gradosKelvin + " grados Kelvin");
	}

	public void ConvertirGradosCelsiusAGradosRankine(double valorRecibido) {
		double gradosRankine = valorRecibido * 1.8 + 491.67;
		gradosRankine = (double) Math.round(gradosRankine * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + gradosRankine + " grados Rankine");
	}

	// DE OTRA MONEDA A PESO ARGENTINO

	public void ConvertirGradosFahrenheitAGradosCelsius(double valorRecibido) {
		double gradosCelsius = (valorRecibido - 32) * 0.56;
		gradosCelsius = (double) Math.round(gradosCelsius * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + gradosCelsius + " grados Celsius");
	}
	
	public void ConvertirGradosKelvinAGradosCelsius(double valorRecibido) {
		double gradosCelsius = valorRecibido - 273.15;
		gradosCelsius = (double) Math.round(gradosCelsius * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + gradosCelsius + " grados Celsius");
	}

	public void ConvertirGradosRankineAGradosCelsius(double valorRecibido) {
		double gradosCelsius = (valorRecibido - 491.67) * 5/9;
		gradosCelsius = (double) Math.round(gradosCelsius * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Son " + gradosCelsius + " grados Celsius");
	}
}
