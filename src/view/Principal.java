package view;

import br.edu.fateczl.arvore.inteiro.ArvoreInt;

public class Principal {

	public static void main(String[] args) {
		ArvoreInt a = new ArvoreInt();
		int [] vetor = {12, 4, 16, 2, 8, 6};
		for (int i: vetor) {
			a.insert(i);
		}
		try {
			a.search(6);
			a.remove(12);
			a.postfixSearch();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
