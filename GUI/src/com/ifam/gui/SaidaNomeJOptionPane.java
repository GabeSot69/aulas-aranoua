package com.ifam.gui;

import javax.swing.JOptionPane;

public class SaidaNomeJOptionPane {
	public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Digite o nome: ");
		String sobrenome = JOptionPane.showInputDialog("Digite o sobrenome: ");
		String nomeCompleto = nome + " " + sobrenome;
		JOptionPane.showMessageDialog(null, "Nome Completo: " + nomeCompleto, "Informa��o",JOptionPane.INFORMATION_MESSAGE);
	}

}
