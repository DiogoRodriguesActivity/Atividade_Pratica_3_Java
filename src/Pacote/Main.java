package Pacote;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contato obj = new Contato("Diogo", "Diogo@gmail", "(31)99799-8261");
		//Agenda contatos = new Agenda(ArrayList<obj>); Como o construtor da sua classe Agenda recebe um ArrayList<Contato>, você precisa criar uma lista 
		
		ArrayList<Contato> lista = new ArrayList<>();
		
		lista.add(obj);
		
		Agenda contatos = new Agenda(lista);
		
		System.out.println("Hello World");
	
		obj.MostrarUser();
		contatos.ListaDeContatos();
		
		
	}

}
