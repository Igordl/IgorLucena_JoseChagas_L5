package hotel;

import java.util.ArrayList;
import java.util.List;

public class Recepcao {
	final String FIM_DE_LINHA = System.lineSeparator();
	List<Estadias> estadias;
	public Recepcao() {
		estadias = new ArrayList<Estadias>();
	}
	
	public void checkIn(String nome, String tipo, int idade, int dias, double valor){
		Estadia estadia = new Estadia(nome,tipo,idade,dias,valor);
		estadias.add(estadia);
	}
	public void checkOut(String nome){
		for (Estadias estadia : estadias) {
			if(estadia.getNome().equalsIgnoreCase(nome)){
				estadias.remove(estadia);
			}
			
		}
	}
	public int getNumDeHospedes(){
		return estadias.size();
	}
	public double getLucroTotal(){
		double lucroTotal = 0.0;
		for (Estadias estadia : estadias) {
			resultado += estadia.getDias() + estadia.getValor();
		}
		return lucroTotal;
	}
	
	public String toString(){
		String retorno = "Estadias:" + FIM_DE_LINHA ;
		for (Estadias estadia : estadias) {
			retorno += getNome() + " (" + getTipo() + "): " + getDias() + " dias com o preço de R$ " + getValor() + FIM_DE_LINHA;
			
		}
		return retorno;
	}
}
