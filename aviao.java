package poo;

public class aviao {
	
	private String nome;
	private String porte;
	private int ano;
	
	public void imprimirInfo()
	{
System.out.println("\nNome do Avi�o: "+getNome()+"\nSeu modelo �: "+getPorte()+
				"\nSeu ano �: "+getAno());
	}
	
	public aviao (String nome, String porte, int ano)
	{
		this.nome = nome;
		this.porte = porte;
		this.ano = ano;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int idade) {
		this.ano = ano;
	}

}
