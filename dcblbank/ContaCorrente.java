package dcblbank;

public class ContaCorrente extends Conta{

	private double limite;
	private double saldoComLimite;
	
	public ContaCorrente() {
		this.limite = 500.0;
	}


	@Override
	public boolean sacar(double valor) {
		if(saldo >= valor && valor > 0) {
			saldo -= valor;
			return true;
		}else if(valor <= saldoComLimite) {
			saldo -= valor;
			limite += saldo;
			System.out.println("Valor do saque: " + valor);
			return true;
		}
		return false;
	}
	
	@Override
	public boolean transferir(double valor, Conta destinatario) {
		
		if(valor > 0 && saldo >= valor) {
			saldo-= valor;
			destinatario.depositar(valor);
			return true;
		}
		return false;
	}
	
	public double getLimite() {
		return limite;
	}
	
	
	
	public double getSaldoComLimite() {
		this.saldoComLimite = super.saldo + limite;
		return saldoComLimite;
	}
	
}
