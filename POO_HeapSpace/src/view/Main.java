package view;

import model.No;

public class Main {
	public static void main(String[] args) {
		No primeira = new No();
		No ultimo = primeira;
		while (true) {
			No outro = new No();
			ultimo.proximo = outro;
			ultimo = outro;
		}
	}
}
