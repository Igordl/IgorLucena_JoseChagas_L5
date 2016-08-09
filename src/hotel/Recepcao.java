package hotel;

import java.util.ArrayList;
import java.util.List;

public class Recepcao {
	final String FIM_DE_LINHA = System.lineSeparator();
	private List<Estadia> estadias;

	public Recepcao() {
		estadias = new ArrayList<Estadia>();
	}

	public void checkIn(String nome, String tipo, int idade, int dias, double valor) throws Exception {
		Estadia estadia = new Estadia(nome, tipo, idade, dias, valor);
		estadias.add(estadia);
	}

	public void checkOut(String nome) {
		for (Estadia estadia : estadias) {
			if (estadia.getNome().equalsIgnoreCase(nome)) {
				estadias.remove(estadia);
			}

		}
	}

	public int getNumDeHospedes() {
		return estadias.size();
	}

	public double getLucroTotal() {
		double lucroTotal = 0.0;
		for (Estadia estadia : estadias) {
			lucroTotal += estadia.getValor();
		}
		return lucroTotal;
	}

	public String toString() {
		String retorno = "Estadias:" + FIM_DE_LINHA;
		for (Estadia estadia : estadias) {
			retorno += estadia.toString();

		}
		return retorno;
	}
}
