package ConversorMonedas;
import javax.swing.JOptionPane;

public class FuncionActivadora {
	
	ConvertirMonedas monedas=new ConvertirMonedas();
	ConvertirMonedasInverso monedasInverso=new ConvertirMonedasInverso();
	
	
	public void ConvertirMonedas(double MiInput) {
		
		String opcion= (JOptionPane.showInputDialog(null, "Seleccione la opcion que desea convertir ","Monedas",
				JOptionPane.PLAIN_MESSAGE,null, new Object[] 
						{"De Pesos a Dolares", "De Pesos a Euros", "De Pesos a Libras", "De Pesos a Yen Japones","De Pesos a Wones sur-conreanos", "De Dolares a Pesos","De Euros a Pesos","De Libras a Pesos","De Yenes japoneses a Pesos", "De Wones sur-coreanos a Pesos"},"Seleccion")).toString();
		
		
		switch (opcion) {
		
			case "De Pesos a Dolares":
				monedas.PesosADolares(MiInput);
				break;
			case "De Pesos a Euros":
				monedas.PesosAEuros(MiInput);
				break;
			case "De Pesos a Libras":
				monedas.PesosALibras(MiInput);
				break;
			case "De Pesos a Yen Japones":
				monedas.PesosAYen(MiInput);
				break;
			case "De Pesos a Wones sur-conreanos":
				monedas.PesosAWon(MiInput);
				break;
			case "De Dolares a Pesos":
				monedasInverso.DolaresAPesos(MiInput);
				break;
			case "De Euros a Pesos":
				monedasInverso.EurosAPesos(MiInput);
				break;
			case "De Libras a Pesos":
				monedasInverso.LibrasAPeso(MiInput);
				break;
			case "De Yenes japoneses a Pesos":
				monedasInverso.YenAPeso(MiInput);
				break;
			case "De Wones sur-coreanos a Pesos":
				monedasInverso.WonAPeso(MiInput);
				break;
		}		
	}
}
