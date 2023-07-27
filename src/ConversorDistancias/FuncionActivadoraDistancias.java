package ConversorDistancias;

import javax.swing.JOptionPane;

public class FuncionActivadoraDistancias {
	
	ConvertirDistancias distancias=new ConvertirDistancias();
	
	
	public void ConvertirDistancias(double MiInput) {
		
		String opcion= (JOptionPane.showInputDialog(null, "Seleccione la opcion que desea convertir ","Distancias",
				JOptionPane.PLAIN_MESSAGE,null, new Object[] 
						{"De Centimetros a Metros", "De Metros a Centimetros", "De Metros a Pulgadas", "De Centimetros a Pulgadas","De Pulgadas a Metros", "De Pulgadas a Centimetros"},"Seleccion")).toString();
		
		
		switch (opcion) {
		
			case "De Centimetros a Metros":
				distancias.CentimetrosAMetros(MiInput);
				break;
			case "De Metros a Centimetros":
				distancias.MetrosACentimetros(MiInput);
				break;
			case "De Metros a Pulgadas":
				distancias.MetrosAPulgadas(MiInput);
				break;
			case "De Centimetros a Pulgadas":
				distancias.CentimetrosAPulgadas(MiInput);
				break;
			case "De Pulgadas a Metros":
				distancias.PulgadasAMetros(MiInput);
				break;
			case "De Pulgadas a Centimetros":
				distancias.PulgadasACentimetros(MiInput);
				break;
		}
	}
}
