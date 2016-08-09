package hotel;

public class Animal {
	
	private String nome;
	private String tipo;
	private int idade;
	
	public Animal(String nomeAnimal, String tipoAnimal, int idadeAnimal) throws Exception{
		
		verificaDados(nomeAnimal, tipoAnimal, idadeAnimal);
		
		this.nome = nomeAnimal;
		this.tipo = tipoAnimal;
		this.idade = idadeAnimal;
	}

	private void verificaDados(String nomeAnimal, String tipoAnimal, int idadeAnimal)
			throws Exception {
		if(nomeAnimal == null || nomeAnimal.trim().isEmpty()){
			throw new Exception("Nome de um animal nao pode ser nulo ou vazio");
		}
		if(tipoAnimal == null || tipoAnimal.trim().isEmpty()){
			throw new Exception("Tipo de um animal nao pode ser nulo ou vazio");
		}
		if(idadeAnimal <= 0){
			throw new Exception("Idade de um animal nao pode ser abaixo de 0");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public boolean equals(Object outroAnimal){
		if(outroAnimal instanceof Animal){
			Animal novoAnimal = (Animal)outroAnimal;
			if(novoAnimal.getNome().equals(nome) && novoAnimal.getTipo().equals(tipo)){
				return true;
			}
		}return false;
	}
	
	
	
	
	
}
