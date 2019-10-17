package view;

import controller.Dicionario;
import javax.swing.JOptionPane;

public class Principal {
	public static void main(String[] args) {
		Dicionario dic = new Dicionario();
		int opc = 0;
		while (opc != 9) {
			opc = Integer.parseInt(JOptionPane.showInputDialog(
					"----- MENU PRINCIPAL ----- \n"
					+ "1 - Consultar definicao \n"
					+ "2 - Adicionar definicao \n"
					+ "9 - Sair"));
			switch (opc) {
			case 1:
				dic.consultarDefinicao();
				break;
			case 2:
				dic.adicionarDefinicao();
				break;
			case 9:
				System.exit(0);
			default:
				JOptionPane.showMessageDialog(null, "Opcao invalida!");
			}
		}
	}
}
