package Principal;


import javax.swing.JOptionPane;

import Principal.ConversorMonedas.FunctionMoneda;
import Principal.ConversorTemperatura.FunctionTemperatura;
import Principal.ConversorPeso.FunctionPeso;


public class Principal {
	
    public static void main(String[] args ){

    	FunctionMoneda monedas = new FunctionMoneda();
        FunctionTemperatura temperaturas = new FunctionTemperatura();
        FunctionPeso pesos = new FunctionPeso();

        while(true){
            String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Conversor de Monedas", "Conversor de Temperatura", "Conversor de Peso"}, "Seleccion")).toString();
        
            switch (opciones) {
                case  "Conversor de Monedas": {       
                    String input = JOptionPane.showInputDialog("Ingrese un valor para convertir");
                        
                    if(verificarNum(input)){
                        Double valorRecibido= Double.parseDouble(input);
                        monedas.ConvertirMonedas(valorRecibido);
                        int seleccion = JOptionPane.showConfirmDialog(null, "Desea realizar otra conversion?");
                        
                        if(JOptionPane.OK_OPTION == seleccion) {
                            System.out.println("Selecciona opción Afirmativa");
                        } else{
                            JOptionPane.showConfirmDialog(null, "PROGRAMA TERMINADO");
                            break;
                        } 
                        
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido. Recuerde ingresar SOLO números");
                    }
                break;    
                }
        
                case  "Conversor de Temperatura": {
                    
                    String input = JOptionPane.showInputDialog("Ingrese un valor para convertir");
                        
                    if(verificarNum(input)){
                        Double valorRecibido= Double.parseDouble(input);
                        temperaturas.ConvertirTemperatura(valorRecibido);
                        int seleccion = JOptionPane.showConfirmDialog(null, "Desea realizar otra conversion?");
                        
                        if(JOptionPane.OK_OPTION == seleccion) {
                            System.out.println("Selecciona opción Afirmativa");
                        } else{
                            JOptionPane.showConfirmDialog(null, "PROGRAMA TERMINADO");
                            break;
                        } 
                        
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido. Recuerde ingresar SOLO números");
                    }
                break;
                }
        
                case  "Conversor de Peso": {
                    String input = JOptionPane.showInputDialog("Ingrese un valor para convertir");
                        
                    if(verificarNum(input)){
                        Double valorRecibido= Double.parseDouble(input);
                        pesos.ConvertirPeso(valorRecibido);
                        int seleccion = JOptionPane.showConfirmDialog(null, "Desea realizar otra conversion?");
                        
                        if(JOptionPane.OK_OPTION == seleccion) {
                            System.out.println("Selecciona opción Afirmativa");
                        } else{
                            JOptionPane.showConfirmDialog(null, "PROGRAMA TERMINADO");
                            break;
                        } 
                        
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor inválido. Recuerde ingresar SOLO números");
                    }
                break;
                }       
        }
        
        }
    }
    	
        

        
    

public static boolean verificarNum(String input) {
    try {
        Double.parseDouble(input);
        return true;
    }catch (NumberFormatException e) {
        return false;
    }
}

} 



