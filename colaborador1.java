package poo;

public class colaborador1 extends Pessoa
{
	private int codigoSetor;
	private float salarioBase;
	private float imposto;
	
	public colaborador1(String nome, String endereco, String cpf, int telefone, int idade, int codigoSetor, float salarioBase, float imposto)
	{
		super(nome, endereco, cpf, telefone, idade);
		this.codigoSetor = codigoSetor;
		this.salarioBase = salarioBase;
		this.imposto = imposto;
	}

	public int getCodigoSetor() {
		return codigoSetor;
	}

	public void setCodigoSetor(int codigoSetor) {
		this.codigoSetor = codigoSetor;
	}

	public float getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}

	public float getImposto() {
		return imposto;
	}

	public void setImposto(float imposto) {
		this.imposto = imposto;
	}

	public void imprimirInfo()
	{
		System.out.println("\nNome do colaborador: "+getNome()+
							"\nCPF: "+getCpf()+"\nIdade: "+getIdade()+
							"\nTelefone: "+getTelefone()+"\nEndereço: "+getEndereco()+"\nCódigo do setor: "+codigoSetor+"\nSalário base: "+salarioBase+
							"\n Valor em porcentagem (sem o %) de imposto a ser retido: "+imposto);
	}
	
	public void calcularSalario()
	{
		double salario_total = salarioBase - (salarioBase * (imposto/100));
		System.out.println("\nO salário a ser recebido pelo colaborador "+getNome()+", foi de: "+salario_total);
	}
	
}
