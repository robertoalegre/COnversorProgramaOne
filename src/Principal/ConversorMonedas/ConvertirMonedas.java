package Principal.ConversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {

	// PESOS ARGENTINOS A OTRA MONEDA
	
	public void ConvertirPesosArgentinosADolar(double valorRecibido) {
		double monedaDolar = valorRecibido / 172.70;
		monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tiene $" + monedaDolar + " Dolares");
	}
	
	public void ConvertirPesosArgentinosAEuro(double valorRecibido) {
		double monedaEuro = valorRecibido / 182.78;
		monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tiene $" + monedaEuro + " Euro");
	}

	public void ConvertirPesosArgentinosABolivano(double valorRecibido) {
		double monedaBolivano = valorRecibido / 24.90;
		monedaBolivano = (double) Math.round(monedaBolivano * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tiene $" + monedaBolivano + " Bolivano");
	}

	public void ConvertirPesosArgentinosAReal(double valorRecibido) {
		double monedaReal = valorRecibido / 32.49;
		monedaReal = (double) Math.round(monedaReal * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tiene $" + monedaReal + " Real");
	}

	public void ConvertirPesosArgentinosAChileno(double valorRecibido) {
		double monedaChileno = valorRecibido / 0.19;
		monedaChileno = (double) Math.round(monedaChileno * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tiene $" + monedaChileno + " Peso Chileno");
	}

	public void ConvertirPesosArgentinosAUruguayo(double valorRecibido) {
		double monedaUruguayo = valorRecibido / 4.45;
		monedaUruguayo = (double) Math.round(monedaUruguayo * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tiene $" + monedaUruguayo + " Peso Uruguayo");
	}

	public void ConvertirPesosArgentinosAColombiano(double valorRecibido) {
		double monedaColombiano = valorRecibido / 0.036;
		monedaColombiano = (double) Math.round(monedaColombiano * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tiene $" + monedaColombiano + " Peso Colombiano");
	}

	// DE OTRA MONEDA A PESO ARGENTINO

	public void ConvertirDolarAPesoArgentino(double valorRecibido) {
		double monedaArgentino = valorRecibido * 172.70;
		monedaArgentino = (double) Math.round(monedaArgentino * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tiene $" + monedaArgentino + " Peso Argentino");
	}
	
	public void ConvertirEuroAPesoArgentino(double valorRecibido) {
		double monedaArgentino = valorRecibido * 182.78;
		monedaArgentino = (double) Math.round(monedaArgentino * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tiene $" + monedaArgentino + " Peso Argentino");
	}

	public void ConvertirBolivanoAPesoArgentino(double valorRecibido) {
		double monedaArgentino = valorRecibido * 24.90;
		monedaArgentino = (double) Math.round(monedaArgentino * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tiene $" + monedaArgentino + " Peso Argentino");
	}

	public void ConvertirRealAPesoArgentino(double valorRecibido) {
		double monedaArgentino = valorRecibido * 32.49;
		monedaArgentino = (double) Math.round(monedaArgentino * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tiene $" + monedaArgentino + " Peso Argentino");
	}

	public void ConvertirAChilenoAPesoArgentino(double valorRecibido) {
		double monedaArgentino = valorRecibido * 0.19;
		monedaArgentino = (double) Math.round(monedaArgentino * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tiene $" + monedaArgentino + " Peso Argentino");
	}

	public void ConvertirUruguayoAPesoArgentino(double valorRecibido) {
		double monedaArgentino = valorRecibido * 4.45;
		monedaArgentino = (double) Math.round(monedaArgentino * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tiene $" + monedaArgentino + " Peso Argentino");
	}

	public void ConvertirColombianoAPesoArgentino(double valorRecibido) {
		double monedaArgentino = valorRecibido * 0.036;
		monedaArgentino = (double) Math.round(monedaArgentino * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tiene $" + monedaArgentino + " Peso Argentino");
	}
}
