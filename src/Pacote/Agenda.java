package Pacote;

import java.util.ArrayList;

public class Agenda {
	
	private ArrayList<Contato> contatos;
	private int quantidadeContatos;
	
	public Agenda(ArrayList<Contato> contatos) {
		this.contatos = contatos;
		
	}

	public ArrayList<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(ArrayList<Contato> contatos) {
		this.contatos = contatos;
	}
	public int getQuantidadeContatos() {
		int cont = 0;
		while(cont < contatos.size()) {
			cont++;
		}
		quantidadeContatos = cont;
		return quantidadeContatos;
	}

	public void setQuantidadeContatos(int quantidadeContatos) {
		this.quantidadeContatos = quantidadeContatos;
	}
	
	public void ListaDeContatos() {
		for(int i = 0; i < contatos.size(); i++) {
			System.out.println("------------------ \n");
			System.out.println(contatos.get(i).getNome());
			System.out.println(contatos.get(i).getEmail() + "\n");
		}
		System.out.println("Quantidade de Contatos: " + getQuantidadeContatos());
	}


	
	
}
