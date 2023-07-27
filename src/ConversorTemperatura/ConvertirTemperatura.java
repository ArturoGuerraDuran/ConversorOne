package ConversorTemperatura;

import javax.swing.JOptionPane;

public class ConvertirTemperatura {
	
	
	public double CelsiusAFahrenheit(double valor) {
		double Fahrenheit = valor* 1.8 + 32;
		Fahrenheit=(double) Math.round(Fahrenheit);
		JOptionPane.showMessageDialog(null, "Son: "+Fahrenheit+ " Grados Fahrenheit");
		return Fahrenheit;
	}
	
	public void CelciusAKelvin(double valor) {
		double Kelvin=  valor + 273.15;
		Kelvin=(double) Math.round(Kelvin);
		JOptionPane.showMessageDialog(null, "Son: "+Kelvin+ " Grados Kelvin");	
	}
	
	public void FarhenheitACelcius(double valor) {
		double Celcius= (valor - 32) / 1.8;
		Celcius=(double) Math.round(Celcius);
		JOptionPane.showMessageDialog(null, "Son: "+Celcius+ " Grados Celcius");
	}
	
	public double KelvinACelcius(double valor) {
		double Celcius=  valor - 273.15;
		Celcius=(double) Math.round(Celcius);
		JOptionPane.showMessageDialog(null, "Son: "+Celcius+ " Grados Celcius");
		return Celcius;
	}
	
	public void ConvertirKelvinAFarenheit(double valor) {
		double kelvinFarenheit = KelvinACelcius(valor);
		kelvinFarenheit = CelsiusAFahrenheit(kelvinFarenheit);
	}
}