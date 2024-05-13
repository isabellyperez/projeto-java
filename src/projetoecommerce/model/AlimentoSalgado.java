package projetoecommerce.model;

public class AlimentoSalgado extends Alimento {
	
	private String preparo;

	public AlimentoSalgado(int tipo, String descrição, float preco, String preparo) {
		super(tipo, descrição, preco);
		this.preparo = preparo;

	}

	public String getPreparo() {
		return preparo;
	}

	public void setPreparo(String preparo) {
		this.preparo = preparo;
	}

}
