package projetoecommerce.model;

public class AlimentoDoce extends Alimento{
	
	private String porcao;
	
	public AlimentoDoce(int tipo, String descrição, float preco, String porcao) {
		super(tipo, descrição, preco);
		this.porcao = porcao;
		
	}

	public String getPorcao() {
		return porcao;
	}

	public void setPorcao(String porcao) {
		this.porcao = porcao;
	}

}
