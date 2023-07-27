package ConversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedasInverso {
	

	public void DolaresAPesos(double valor) {
		double monedaPeso = valor*16.91;
		monedaPeso=(double) Math.round(monedaPeso);
		JOptionPane.showMessageDialog(null, "tienes $"+monedaPeso+ " Pesos");
	}
	
	public void EurosAPesos(double valor) {
		double monedaPeso=  valor*18.72;
		monedaPeso=(double) Math.round(monedaPeso);
		JOptionPane.showMessageDialog(null, "tienes $"+monedaPeso+ " Pesos");
	}
	
	public void LibrasAPeso(double valor) {
		double monedaPeso = valor*21.83;
		monedaPeso=(double) Math.round(monedaPeso);
		JOptionPane.showMessageDialog(null, "tienes $"+monedaPeso+ " Pesos");
	}
	
	public void YenAPeso(double valor) {
		double monedaPeso = valor*0.12;
		monedaPeso=(double) Math.round(monedaPeso);
		JOptionPane.showMessageDialog(null, "tienes $"+monedaPeso+ " Pesos");	
	}
	
	public void WonAPeso(double valor) {
		double monedaPeso = valor*0.013;
		monedaPeso=(double) Math.round(monedaPeso);
		JOptionPane.showMessageDialog(null, "tienes $"+monedaPeso+ " Pesos");
	}	
}
