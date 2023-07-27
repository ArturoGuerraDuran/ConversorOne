package ConversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {
	
	
	public void PesosADolares(double valor) {
		double monedaDolar = valor*0.059;
		monedaDolar=(double) Math.round(monedaDolar);
		JOptionPane.showMessageDialog(null, "tienes $"+monedaDolar+ " Dolares");	
	}

	public void PesosAEuros(double valor) {
		double monedaEuro=  valor*0.053;
		monedaEuro=(double) Math.round(monedaEuro);
		JOptionPane.showMessageDialog(null, "tienes $"+monedaEuro+ " Euros");	
	}
	
	public void PesosALibras(double valor) {
		double monedaLibra = valor*0.046;
		monedaLibra=(double) Math.round(monedaLibra);
		JOptionPane.showMessageDialog(null, "tienes $"+monedaLibra+ " Libras");	
	}
	
	public void PesosAYen(double valor) {
		double monedaYen = valor*8.34;
		monedaYen=(double) Math.round(monedaYen);
		JOptionPane.showMessageDialog(null, "tienes $"+monedaYen+ " Yenes");	
	}
	
	public void PesosAWon(double valor) {
		double monedaWon = valor*75.73;
		monedaWon=(double) Math.round(monedaWon);
		JOptionPane.showMessageDialog(null, "tienes $"+monedaWon+ " Wones");
	}	
}
