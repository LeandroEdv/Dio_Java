package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	
	public static void main(String[] args) {
		// System.out.println("Processo seletivo");
		imprimirSelecionados();
		
	}
	static void imprimirSelecionados() {
		String [] candidatos = {"FELIPE","MARCIA","JULIANA","PAULO","ALGUSTO"};
		
		for(int indice =0; indice < candidatos.length; indice ++) {
			System.out.println("O candidato de numero "+ (indice + 1) + " é " + candidatos[indice]);
		}
		// Forma abreviada
		for (String candidato: candidatos) {
			System.out.println("candidato selecionado: "+ candidato);
		}
	}
	
	static void selecaoCandidatos() {
		String [] candidatos = {"FELIPE","MARCIA","JULIANA","PAULO","ALGUSTO","MONICA","FABRICIO","MIRELA","DANIELA","JORGE"};
		int candidatosSelecionados =0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		
		while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("o candidato" + candidato + " solicitou este valor de salário: " + salarioPretendido);
			if (salarioBase >= salarioPretendido) {
				System.out.println("O candidato "+ candidato + " foi selecionado para a vaga");
				candidatosSelecionados ++;
			}
			candidatoAtual ++;
		}
	}
	
	static double valorPretendido () {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	
    static void analisarCandidato(double salarioPretendido) {
    	double salarioBase = 2000.0;
    	
    	if (salarioBase > salarioPretendido) {
    		System.out.println("ligar parao candidato");
    	}else if (salarioBase == salarioPretendido) {
    		System.out.println("Ligar para o candidato com contra proposta");
    	}else {
    		System.out.println("Aguardando resultado dos demais candidatos");
    	}
    }

}
