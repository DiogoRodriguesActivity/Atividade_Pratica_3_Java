package Pacote;

public class ContatoEmergencia extends Contato{
	
	private int grauPrioridade;
	private String Observacao;
	public ContatoEmergencia(String nome, String email, String telefone, int grauPrioridade, String Observacao) {
		super(nome,email,telefone);
		this.grauPrioridade = grauPrioridade;
		this.Observacao = Observacao;
	}

	
	public int getGrauPrioridade() {
		return grauPrioridade;
	}

	public void setGrauPrioridade(int grauPrioridade) {
		
		if(grauPrioridade < 1 || grauPrioridade > 5) {
			throw new IllegalArgumentException("A prioridade deve ser entre 1 e 5");
		}
		
		this.grauPrioridade = grauPrioridade;
	}


	public String getObservacao() {
		return Observacao;
	}


	public void setObservacao(String observacao) {
		Observacao = observacao;
	}
	
	
	
}
