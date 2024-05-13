package projetoecommerce.model;

public abstract class Alimento {
	
	private int tipo;
	private String descricao;
	private float preco;
	public Alimento(int tipo, String descrição, float preco) {
		this.tipo = tipo;
		this.descricao = descrição;
		this.preco = preco;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescrição(String descrição) {
		this.descricao = descrição;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}
	
	 public void exibirInformacoes() {
		 
		 String tipo = "";
			
			switch(this.tipo) {
			case 1:
				tipo = "Salgado";
			break;
			case 2:
				tipo = "Doce";
			break;
			}
			
			System.out.println("\n\n***********************************************************");
			System.out.println("Especificidades do Produto:");
			System.out.println("***********************************************************");
	        System.out.println("Categoria do Alimento: " +tipo);
	        System.out.println("Descrição do Alimento escolhido: " + this.descricao);
	        System.out.println("Preço do Alimento: R$" + this.preco);
	 }
	 
	 
}
