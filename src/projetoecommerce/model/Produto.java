package projetoecommerce.model;

public class Produto {

	    private int codigo;
	    private String nome;
	    private String marca;
	    private float preco;

	    public Produto(int codigo, String nome, String marca, float preco) {
	        this.codigo = codigo;
	        this.nome = nome;
	        this.marca = marca;
	        this.preco = preco;
	    }

	    public int getCodigo() {
	        return codigo;
	    }

	    public void setCodigo(int codigo) {
	        this.codigo = codigo;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getMarca() {
	        return marca;
	    }

	    public void setMarca(String marca) {
	        this.marca = marca;
	    }

	    public float getPreco() {
	        return preco;
	    }

	    public void setPreco(float preco) {
	        this.preco = preco;
	    }
	}


