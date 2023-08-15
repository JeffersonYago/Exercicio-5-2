package view;
import javax.swing.*;
import controller.MDCController;

public class Principal {

	public static void main(String[] args) {
		MDCController pc = new MDCController ();
		int a = Integer.parseInt(JOptionPane.showInputDialog("insira um valor!"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("insira outro valor!"));
		int resultado = pc.Mdc(a , b);
		System.out.println("Máximo Divisor Comum entre os dois valores = "+resultado);
	}
}
