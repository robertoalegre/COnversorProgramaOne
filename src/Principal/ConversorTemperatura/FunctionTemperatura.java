package Principal.ConversorTemperatura;

import javax.swing.JOptionPane;

public class FunctionTemperatura {
	
	ConvertirTemperatura temperaturas = new ConvertirTemperatura();

	public void ConvertirTemperatura(double valorRecibido) {
		 
		String opcion = (JOptionPane.showInputDialog
				(null, "Elije la unidad de medicion de temperaturas", "Temperaturas", 
						JOptionPane.QUESTION_MESSAGE, null, new Object[]{"De Grados Celsius a Grados Fahrenheit", 
						"De Grados Celsius a Grados Kelvin", "De Grados Celsius a Grados Rankine", "De Grados Fahrenheit a Grados Celsius", 
						"De Grados Kelvin a Grados Celsius", "De Grados Rankine a Grados Celsius"}, "Seleccion")).toString();

		    switch (opcion) {

				// GRADOS CELSIUS A OTRAS UNIDADES

		        case  "De Grados Celsius a Grados Fahrenheit":
					temperaturas.ConvertirGradosCelsiusAGradosFahrenheit(valorRecibido);
		        break;
		        case "De Grados Celsius a Grados Kelvin": 
					temperaturas.ConvertirGradosCelsiusAGradosKelvin(valorRecibido);
		        break;
				case  "De Grados Celsius a Grados Rankine":
					temperaturas.ConvertirGradosCelsiusAGradosRankine(valorRecibido);
		        break;

				// DE OTRAS UNIDADES A GRADOS CELCIUS

				case  "De Grados Fahrenheit a Grados Celsius":
					temperaturas.ConvertirGradosFahrenheitAGradosCelsius(valorRecibido);
		        break;
		        case "De Grados Kelvin a Grados Celsius": 
					temperaturas.ConvertirGradosKelvinAGradosCelsius(valorRecibido);
		        break;
				case  "De Grados Rankine a Grados Celsius":
					temperaturas.ConvertirGradosRankineAGradosCelsius(valorRecibido);
		        break;
		    }
	}



}