package dcblbank;

import java.time.LocalDate;


public abstract class Funcionario {
	
		private final double INDICE = 0.05; //constante
	
		private String nome;
		private String ctps;
		private String cpf;
		private LocalDate dataAdmissao;
		private double salario;
		

		
		public Funcionario() {
			
		}
		
		public Funcionario(String nome, String cpf, String ctps, double salario, LocalDate dataAdmissao) {
			super();
			this.nome = nome;
			this.ctps = ctps;
			this.dataAdmissao = dataAdmissao;
			this.salario = salario;
		}



		public double getBonus() {
			return this.salario * INDICE;
		}
		
		public String getNome() {
			return nome;
		}
		public String getCtps() {
			return ctps;
		}
		public String getCpf() {
			return cpf;
		}
		public LocalDate getData() {
			return dataAdmissao;
		}
		public LocalDate getDataAdmissao() {
			return dataAdmissao;
		}
		public double getSalario() {
			return salario;
		}
		@Override
		public String toString() {
			return " Nome:" +getNome() + "\n CTPS:" + getCtps() + "\n Data Admissão: " + getDataAdmissao() + "\n Salario: " + getSalario();
		}
		
		
		
		
}
