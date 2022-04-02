package dcblbank;

import java.time.LocalDate;
import java.util.Locale;


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
		
//		PessoaFisica pfDayane = new PessoaFisica();
//		pfDayane.setNome("Dayane");
//		pfDayane.setEmail("email@email.com");
//		pfDayane.setTelefone("999999999");
//		pfDayane.setCpf("123456789-10");
//		pfDayane.setRg("12345678-9");
//		pfDayane.setProfissao("Estudante");
//		
//		Conta conta1 = new Conta();
//		conta1.setAgencia(1234);
//		conta1.setNumeroConta(7889);
////		conta1.setSaldo(10000);
//		conta1.setTitular(pfDayane);
//		conta1.depositar(100);
//		conta1.sacar(50);
//		System.out.println(conta1.toString());
//		
//		Conta conta2 = new Conta();
//		conta2.setAgencia(5582);
//		conta2.setNumeroConta(0234);
//		conta1.transferir(20, conta2);
//		
////		System.out.println("Agencia:" + conta1.getAgencia());
////		System.out.println("Conta:" + conta1.getNumeroConta());
//		System.out.println("Saldo Atual Conta 1:" + conta1.getSaldo());
//		System.out.println("Saldo Atual Conta 2:" + conta2.getSaldo());
////		System.out.println("Titular:" + conta1.getTitular());
//		
//		ContaCorrente cc1 = new ContaCorrente();
//		cc1.depositar(1000);
//		System.out.println("Saldo: " + cc1.getSaldo());
//		System.out.println("Limite: " +cc1.getLimite());
//		System.out.println("Saldo com limite: " +cc1.getSaldoComLimite());
//		cc1.sacar(1500);
//		System.out.println("Saldo: " + cc1.getSaldo());
//		System.out.println("Limite: " +cc1.getLimite());
//		System.out.println("Saldo com limite: " +cc1.getSaldoComLimite());
		
		
		Locale.setDefault(new Locale("pt", "BR"));
		Gerente funcionario = new Gerente("Dayane Leal","011.122.348-92", "88759", 2500.0, LocalDate.now());
		System.out.println(funcionario.toString());
		System.out.printf(" Bonus: %.2f \n" , funcionario.getBonus());
		System.out.println("===================================");
		
//		boolean resposta = funcionario.autenticarSistema("usuariopadrao", "mudar123");

		
		boolean resposta1 = funcionario.autenticarSistema("Dayane", "1234");
		
		if(resposta1) {
			System.out.println(" Bem-vindo(a) " + funcionario.getNome());
		} else {
			System.out.println(" Usuário ou senha inválidos");
		}
		
		System.out.println("===================================");
		funcionario.alterarUsuario("usuariopadrao", "121kk");
		funcionario.alterarSenha("mudar123", "1dafalk");
		
	}
	
	
	
}
