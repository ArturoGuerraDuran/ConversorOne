package ConversorTemperatura;
import javax.swing.JOptionPane;

public class FuncionActivadoraTemperatura {
	
	
	ConvertirTemperatura temperatura=new ConvertirTemperatura();
	
	public void ConvertirTemperatura(double MiInput) {
		
		String opcion= (JOptionPane.showInputDialog(null, "Seleccione la opcion que desea convertir ","Temperatura",
				JOptionPane.PLAIN_MESSAGE,null, new Object[] 
						{"De Celcius a Fahrenheit", "De Celcius a Kelvin", "De Fahrenheit a Celcius", "De Kelvin a Celcius","De Kelvin a Fahrenheit" },"Seleccion")).toString();
		
		switch (opcion) {
		
		case "De Celcius a Fahrenheit":
			temperatura.CelsiusAFahrenheit(MiInput);
			break;
		case "De Celcius a Kelvin":
			temperatura.CelciusAKelvin(MiInput);
			break;
		case "De Fahrenheit a Celcius":
			temperatura.FarhenheitACelcius(MiInput);
			break;
		case "De Kelvin a Celcius":
			temperatura.KelvinACelcius(MiInput);
			break;
		case "De Kelvin a Fahrenheit":
			temperatura.ConvertirKelvinAFarenheit(MiInput);
			break;
		}
	}
}