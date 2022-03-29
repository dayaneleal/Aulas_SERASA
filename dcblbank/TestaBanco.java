package dcblbank;

public class TestaBanco {
	
	
	public static void main(String[] args) {
//		
//		Pessoa pessoaNumero1 = new Pessoa();
//		pessoaNumero1.setNome("José das Couves");
//		pessoaNumero1.setProfissao("Agricultor");
//		pessoaNumero1.setCpf("643.829.641-48");
//		
//		System.out.println("Nome:"+ pessoaNumero1.getNome());
//		System.out.println("Nome:"+ pessoaNumero1.getProfissao());
//		System.out.println("CPF:"+ pessoaNumero1.getCpf());
		Conta conta1 = new Conta();
		conta1.setAgencia(1234);
		conta1.setNumeroConta(7889);
//		conta1.setSaldo(10000);
		conta1.setTitular("Dayane Leal");
		conta1.depositar(100);
		conta1.sacar(50);
		System.out.println(conta1.toString());
		
		Conta conta2 = new Conta();
		conta2.setAgencia(5582);
		conta2.setNumeroConta(0234);
		conta1.transferir(20, conta2);
		
//		System.out.println("Agencia:" + conta1.getAgencia());
//		System.out.println("Conta:" + conta1.getNumeroConta());
		System.out.println("Saldo Atual Conta 1:" + conta1.getSaldo());
		System.out.println("Saldo Atual Conta 2:" + conta2.getSaldo());
//		System.out.println("Titular:" + conta1.getTitular());
	}
	
	
	
}
