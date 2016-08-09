package hotel;

public class Estadia {
	
	private Animal animal;
	private double valor;
	private int dias;
	
	public Estadia(String nomeAnimal, String tipoAnimal, int idadeAnimal, int dias, double valor) throws Exception{
		nomeAnimal = animal.getNome();
		tipoAnimal = animal.getTipo();
		idadeAnimal = animal.getIdade();
		
		verificaDados(dias, valor);
		
		this.dias = dias;
		this.valor = valor;
	}

	private void verificaDados(int dias, double valor) throws Exception {
		if(dias <= 0){
			throw new Exception("Dias nao deve ser menor ou igual a zero");
		}
		if(valor <= 0){
			throw new Exception("Valor nao deve ser menor ou igual a zero");
		}
	}

	public double getValor() {
		return valor;
	}

	public int getDias() {
		return dias;
	}
	
	public String getNome(){
		return animal.getNome();
	}
	
	public String getTipo(){
		return animal.getTipo();
	}
	
	public int getIdade(){
		return animal.getIdade();
	}
	
	
	public String toString(){
		return animal.getNome() + " , " +animal.getTipo() + ", " + this.dias + " dias com o preço de R$ " + this.valor;
	}
	

}
