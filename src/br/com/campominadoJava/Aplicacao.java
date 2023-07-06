package br.com.campominadoJava;

import br.com.campominadoJava.modelo.Tabuleiro;
import br.com.campominadoJava.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		new TabuleiroConsole(tabuleiro);

	}

}
