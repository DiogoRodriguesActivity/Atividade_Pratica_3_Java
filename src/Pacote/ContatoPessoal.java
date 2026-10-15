package Pacote;



public class ContatoPessoal extends Contato {
	

	private String dataAniversario;
	private String parentenco;
	
	public ContatoPessoal(String nome, String email, String telefone, String dataAniversario, String parentenco) {
		super(nome, email, telefone);
		this.dataAniversario = dataAniversario;
		this.parentenco = parentenco;
	}

	public String getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(String dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

	public String getParentenco() {
		return parentenco;
	}

	public void setParentenco(String parentenco) {
		this.parentenco = parentenco;
	}
	
}
