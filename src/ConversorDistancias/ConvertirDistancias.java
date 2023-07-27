package ConversorDistancias;

import javax.swing.JOptionPane;

public class ConvertirDistancias {

	public void CentimetrosAMetros(double valor) {
		double Metros = valor*0.01;
		JOptionPane.showMessageDialog(null, valor+" centimetros son: "+Metros+ " Metros");
	}
	
	public void MetrosACentimetros(double valor) {
		double Centimetros = valor*100;
		JOptionPane.showMessageDialog(null, valor+" metros son: "+Centimetros+ " Centimetros");
	}
	public void MetrosAPulgadas(double valor) {
		double Pulgadas = valor*39.3701;
		JOptionPane.showMessageDialog(null, valor+" metros son: "+Pulgadas+ " Pulgadas");
	}
	public void CentimetrosAPulgadas(double valor) {
		double Pulgadas = valor*0.393701;
		JOptionPane.showMessageDialog(null, valor+" centimetros son: "+Pulgadas+ " Pulgadas");
	}
	public void PulgadasAMetros(double valor) {
		double Pulgadas = valor*0.0254;
		JOptionPane.showMessageDialog(null, valor+" Pulgadas son: "+Pulgadas+ " Metros");
	}	
	public void PulgadasACentimetros(double valor) {
		double Centimetros = valor*2.54;
		JOptionPane.showMessageDialog(null, valor+" Pulgadas son: "+Centimetros+ " Centimetros");
	}
}
