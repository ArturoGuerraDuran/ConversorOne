package com.ConversorOne.Main;
import javax.swing.JOptionPane;  
import ConversorMonedas.FuncionActivadora;
import ConversorTemperatura.FuncionActivadoraTemperatura;
import ConversorDistancias.FuncionActivadoraDistancias;

public class MainClass {
	
	public static void main(String[] args) {
		
	
	FuncionActivadora monedas=new FuncionActivadora();
	FuncionActivadoraTemperatura temperatura=new FuncionActivadoraTemperatura();
	FuncionActivadoraDistancias distancias=new FuncionActivadoraDistancias();
	
	
	while(true) {
		
		String opciones= (JOptionPane.showInputDialog(null, "Seleccione una opción para convertir ", "ConversorWar", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de Moneda", "Conversor de Temperatura","Conversor de Distancias"}, "Seleccion")).toString();
		
		switch(opciones) {
		
		case "Conversor de Moneda":
			String input= JOptionPane.showInputDialog("Introduzca la cantidad que quiere convertir: ");
			if(ValidarNumero(input)== true) {
				double Minput = Double.parseDouble(input);
                monedas.ConvertirMonedas(Minput);

                int respuesta=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");
                if (JOptionPane.OK_OPTION == respuesta){
                	System.out.println("Selecciona opción Afirmativa");
                }else{
                   	JOptionPane.showMessageDialog(null, "Cerrando Programa");
                   	System.exit(0);
                }

               } else {
                   JOptionPane.showMessageDialog(null, "Valor inválido solo se aceptan valores numericos");                
               }
                	break;
				
					
		case "Conversor de Temperatura":
			
			String input2= JOptionPane.showInputDialog("Introduzca la cantidad que quiere convertir: ");
			if(ValidarNumero(input2)== true) {
				double Minput = Double.parseDouble(input2);
                temperatura.ConvertirTemperatura(Minput);

                int respuesta=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");
                if (JOptionPane.OK_OPTION == respuesta){
                	System.out.println("Selecciona opción Afirmativa");
                }else{
                   	JOptionPane.showMessageDialog(null, "Cerrando Programa");
                   	System.exit(0);
                }

               } else {
                   JOptionPane.showMessageDialog(null, "Valor inválido solo se aceptan valores numericos");                
               }
                	break;
			
				
		case "Conversor de Distancias":
			String input3= JOptionPane.showInputDialog("Introduzca la cantidad que quiere convertir: ");
			if(ValidarNumero(input3)== true) {
				double Minput = Double.parseDouble(input3);
                distancias.ConvertirDistancias(Minput);

                int respuesta=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");
                if (JOptionPane.OK_OPTION == respuesta){
                	System.out.println("Selecciona opción Afirmativa");
                }else{
                   	JOptionPane.showMessageDialog(null, "Cerrando Programa");
                   	System.exit(0);
                }

               } else {
                   JOptionPane.showMessageDialog(null, "Valor inválido solo se aceptan valores numericos");                
               }
                	break;       	
			}	
		}		
	}
	 public static boolean ValidarNumero(String input) {
	        try {
	            double x = Double.parseDouble(input);
	            if(x >= 0 || x < 0);
	                return true;
	            } catch (NumberFormatException e) {
	                return false;
	            }
	    }
}
