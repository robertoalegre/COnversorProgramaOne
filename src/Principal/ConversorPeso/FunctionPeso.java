package Principal.ConversorPeso;

import javax.swing.JOptionPane;

public class FunctionPeso {
    
    ConvertirPeso pesos = new ConvertirPeso();

    public void ConvertirPeso(double valorRecibido) {
		 
		String opcion = (JOptionPane.showInputDialog
				(null, "Elije la unidad de peso a la que quieres convertir tu peso", "Medidas de Peso", 
						JOptionPane.QUESTION_MESSAGE, null, new Object[]{"De Kilogramos a Libras", "De Kilogramos a Piedras", 
                        "De Onzas a Gramos", "De Onzas a Libras", "De Libras a Kilogramos", "De Piedras a Kilogramos", 
						"De Gramos a Onzas", "De Libras a Onzas"}, "Seleccion")).toString();

		    switch (opcion) {

				// MEDIDAS DE PESO

		        case  "De Kilogramos a Libras":
                    pesos.ConvertirKilogramosALibras(valorRecibido);
		        break;
		        case "De Kilogramos a Piedras": 
                    pesos.ConvertirKilogramosAPiedras(valorRecibido);
		        break;
				case  "De Onzas a Gramos":
                    pesos.ConvertirOnzasAGramos(valorRecibido);
		        break;
		        case "De Onzas a Libras": 
		            pesos.ConvertirOnzasaLibras(valorRecibido);
		        break;
				case  "De Libras a Kilogramos":
		            pesos.ConvertirLibrasAKilogramos(valorRecibido);
		        break;
		        case "De Piedras a Kilogramos": 
		            pesos.ConvertirPiedrasAKilogramos(valorRecibido);
		        break;
				case  "De Gramos a Onzas":
		            pesos.ConvertirGramosAOnzas(valorRecibido);
		        break;
				case  "De Libras a Onzas":
		            pesos.ConvertirLibrasAOnzas(valorRecibido);
		        break;
		    }
	}

}
