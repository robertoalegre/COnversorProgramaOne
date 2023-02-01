package Principal.ConversorPeso;

import javax.swing.JOptionPane;

public class ConvertirPeso {

    public void ConvertirKilogramosALibras(double valorRecibido) {
		double pesoLibras = valorRecibido * 2.2046;
		pesoLibras = (double) Math.round(pesoLibras * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Pesa " + pesoLibras + " Libras");
	}

    public void ConvertirKilogramosAPiedras(double valorRecibido) {
		double pesoPiedras = valorRecibido * 0.15747;
		pesoPiedras = (double) Math.round(pesoPiedras * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Pesa " + pesoPiedras + " Piedras");
	}

    public void ConvertirOnzasAGramos(double valorRecibido) {
		double pesoOnzas = valorRecibido / 0.035274;
		pesoOnzas = (double) Math.round(pesoOnzas * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Pesa " + pesoOnzas + " Gramos");
	}

    
    public void ConvertirOnzasaLibras(double valorRecibido) {
		double pesoOnzas = valorRecibido *  0.062500;
		pesoOnzas = (double) Math.round(pesoOnzas * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Pesa " + pesoOnzas + " Libras");
	}

    public void ConvertirLibrasAKilogramos(double valorRecibido) {
		double pesoLibras = valorRecibido / 2.2046;
		pesoLibras = (double) Math.round(pesoLibras * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Pesa " + pesoLibras + " Kilogramos");
	}

    public void ConvertirPiedrasAKilogramos(double valorRecibido) {
		double pesoPiedras = valorRecibido / 0.15747;
		pesoPiedras = (double) Math.round(pesoPiedras * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Pesa " + pesoPiedras + " Kilogramos");
	}

    public void ConvertirGramosAOnzas(double valorRecibido) {
		double pesoGramos = valorRecibido * 0.035274;
		pesoGramos = (double) Math.round(pesoGramos * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Pesa " + pesoGramos + " Onzas");
	}

    public void ConvertirLibrasAOnzas(double valorRecibido) {
		double pesoLibras = valorRecibido * 16.000;
		pesoLibras = (double) Math.round(pesoLibras * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Pesa " + pesoLibras + " Onzas");
	}
    
}
