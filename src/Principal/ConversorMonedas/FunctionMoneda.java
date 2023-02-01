package Principal.ConversorMonedas;

import javax.swing.JOptionPane;

public class FunctionMoneda {
	
	ConvertirMonedas monedas = new ConvertirMonedas();

	public void ConvertirMonedas(double valorRecibido) {
		 
		String opcion = (JOptionPane.showInputDialog
				(null, "Elije la moneda a la que desea convertir tu dinero", "Monedas", 
						JOptionPane.QUESTION_MESSAGE, null, new Object[]{"De Peso Argentino a Dólar", 
						"De Peso Argentino a Euro", "De Peso Argentino a Bolivano", "De Peso Argentino a Real", 
						"De Peso Argentino a Peso Chileno", "De Peso Argentino a Peso Uruguayo", 
						"De Peso Argentino a Peso Colombiano", "De Dólar a Peso Argentino", 
						"De Euro a Peso Argentino", "De Bolivano a Peso Argentino", "De Real Peso Argentino", 
						"De Peso Chileno a Peso Argentino", "De Peso Uruguayo a Peso Argentino", 
						"De Peso Colombiano a Peso Argentino"}, "Seleccion")).toString();

		    switch (opcion) {

				// PESOS ARGENTINOS A OTRA MONEDA

		        case  "De Peso Argentino a Dólar":
		             monedas.ConvertirPesosArgentinosADolar(valorRecibido);
		        break;
		        case "De Peso Argentino a Euro": 
		             monedas.ConvertirPesosArgentinosAEuro(valorRecibido);
		        break;
				case  "De Peso Argentino a Bolivano":
		             monedas.ConvertirPesosArgentinosABolivano(valorRecibido);
		        break;
		        case "De Peso Argentino a Real": 
		             monedas.ConvertirPesosArgentinosAReal(valorRecibido);
		        break;
				case  "De Peso Argentino a Peso Chileno":
		             monedas.ConvertirPesosArgentinosAChileno(valorRecibido);
		        break;
		        case "De Peso Argentino a Peso Uruguayo": 
		             monedas.ConvertirPesosArgentinosAUruguayo(valorRecibido);
		        break;
				case  "De Peso Argentinos a Peso Colombiano":
		             monedas.ConvertirPesosArgentinosAColombiano(valorRecibido);
		        break;

				// DE OTRA MONEDA A PESO ARGENTINO

				case  "De Dólar a Peso Argentino":
		             monedas.ConvertirDolarAPesoArgentino(valorRecibido);
		        break;
		        case "De Euro a Peso Argentino": 
		             monedas.ConvertirEuroAPesoArgentino(valorRecibido);
		        break;
				case  "De Bolivano a Peso Argentino":
		             monedas.ConvertirBolivanoAPesoArgentino(valorRecibido);
		        break;
		        case "De Real a Peso Argentino": 
		             monedas.ConvertirRealAPesoArgentino(valorRecibido);
		        break;
				case  "De Peso Chileno a Peso Argentino":
		             monedas.ConvertirAChilenoAPesoArgentino(valorRecibido);
		        break;
		        case "De Peso Uruguayo a Peso Argentino": 
		             monedas.ConvertirUruguayoAPesoArgentino(valorRecibido);
		        break;
				case  "De Peso Colombiano a Peso Argentino":
		             monedas.ConvertirColombianoAPesoArgentino(valorRecibido);
		        break;
		    }
	}



}
