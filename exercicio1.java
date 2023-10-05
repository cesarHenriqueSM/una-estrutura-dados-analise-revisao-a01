package listavi;
import java.util.Scanner;

public class exercicio1 {
	
public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		String nome = " ", vacinaEmDia = " ", sintomasRecentes = " ", contatoComPessoasComSintomas = " ", retornandoViagem = " ", orientacaoFinal = " ";
		int idade, probabilidadeInfeccao = 0, contadorTentativas = 0;
		boolean tentativas = false;
		
		System.out.print("Digite o seu nome: ");
			nome = read.next();
		System.out.print("Informe a sua idade: ");
			idade = read.nextInt();
			
		System.out.println("Responda o questionário abaixo respondendo apenas com SIM ou NAO.");
			
			
		do {
			System.out.print("\n1. Seu cartão de vacina está em dia? ");
				vacinaEmDia = read.next();
				vacinaEmDia.toUpperCase();
				if(vacinaEmDia.equals("SIM") || vacinaEmDia.equals("NAO")) {
					break;
				}
				else {
					contadorTentativas++;
					System.out.print("\nINFORMAÇÃO INVÁLIDA! 1. Seu cartão de vacina está em dia? ");
					System.out.print("\nResponda digitando SIM ou NAO.");
				if(contadorTentativas == 3) {
					tentativas = true;
					break;
					}
				}
		}while(true);
		
		contadorTentativas = 0;
		
		if(tentativas == false) {
			do {
				System.out.print("\n2. Teve algum dos sintomas recentemente (dor de cabeça, febre, náusea, dor articular, gripe)? ");
					sintomasRecentes = read.next();
					sintomasRecentes.toUpperCase();
					if(sintomasRecentes.equals("SIM") || sintomasRecentes.equals("NAO")) {
						break;
					}
					else {
						contadorTentativas++;
						System.out.print("\nINFORMAÇÃO INVÁLIDA! 2. Teve algum dos sintomas recentemente (dor de cabeça, febre, náusea, dor articular, gripe)? ");
						System.out.print("\nResponda digitando SIM ou NAO.");
						if(contadorTentativas == 3) {
							tentativas = true;
							break;
						}
					}
			}while(true);
			
		}
			
		contadorTentativas = 0;
			
		if(tentativas == false) {
			do {
				System.out.print("\n3. Teve contato com pessoas com sintomas gripais nos últimos dias? ");
					contatoComPessoasComSintomas = read.next();
					contatoComPessoasComSintomas.toUpperCase();
					if(contatoComPessoasComSintomas.equals("SIM") || contatoComPessoasComSintomas.equals("NAO")) {
						break;
					}
					else {
						contadorTentativas++;
						System.out.print("\nINFORMAÇÃO INVÁLIDA! 3. Teve contato com pessoas com sintomas gripais nos últimos dias? ");
						System.out.print("\nResponda digitando SIM ou NAO.");
						if(contadorTentativas == 3) {
							tentativas = true;
							break;
						}
					}
			}while(true);
		}
				
		contadorTentativas = 0;
				
		if(tentativas == false) {
			do {
				System.out.print("\n4. Está retornando de viagem realizada no exterior? ");
					retornandoViagem = read.next();
					retornandoViagem.toUpperCase();
					if(retornandoViagem.equals("SIM") || retornandoViagem.equals("NAO")) {
						break;
					}
					else {
						contadorTentativas++;
						System.out.print("\nINFORMAÇÃO INVÁLIDA! 4. Está retornando de viagem realizada no exterior? ");
						System.out.print("\nResponda digitando SIM ou NAO.");
							if(contadorTentativas == 3) {
								tentativas = true;
								break;
							}
					}
					}while(true);
		}
	
		if(tentativas == true) {
			System.out.print("\nNão foi possível realizar o diagnóstico.\nGentileza procurar ajuda médica caso apareça algum sintoma.");
		}
		else {
			if(vacinaEmDia.equals("NAO")) {
				probabilidadeInfeccao += 10;
			}
			if(sintomasRecentes.equals("SIM")) {
				probabilidadeInfeccao += 30;
			}
			if(contatoComPessoasComSintomas.equals("SIM")) {
				probabilidadeInfeccao += 30;
			}
			if(retornandoViagem.equals("SIM")) {
				probabilidadeInfeccao += 30;
			}
			if(retornandoViagem.equals("SIM")) {
				orientacaoFinal = "\nVocê ficará sob observação por 05 dias.";
			}else {
				if(probabilidadeInfeccao <= 30) {
					orientacaoFinal = "\nPaciente sob observação. Caso apareça algum sintoma, gentileza buscar assistência médica.";
				}
				else if(probabilidadeInfeccao <= 60) {
					orientacaoFinal = "\nPaciente com risco de estar infectado. Gentileza aguardar em lockdown por 02 dias para ser acompanhado.";
				}
				else if(probabilidadeInfeccao <= 89) {
					orientacaoFinal = "\nPaciente com alto risco de estar infectado. Gentileza aguardar em lockdown por 05 dias para ser acompanhado.";
				}
				else {
					orientacaoFinal = "\nPaciente crítico! Gentileza aguardar em lockdown por 10 dias para ser acompanhado";
				}
			}
		}
		System.out.print("\nNome: " + nome);
		System.out.print("\nIdade: " + idade);
		System.out.print("\nCartão de vacina em dia? \nResposta: " + vacinaEmDia);
		System.out.print("\nTeve contato com pessoas infectadas? \nResposta: " + contatoComPessoasComSintomas);
		System.out.print("\nTeve síntomas recentes? \nResposta: " + sintomasRecentes);
		System.out.print("\nEstá retornando de viagem? \nResposta: " + retornandoViagem);
		System.out.print("\nProbabilidade de infecção: " + probabilidadeInfeccao);
		System.out.print("\nOrientação final: " + orientacaoFinal);
		
		System.out.print("\nPesquisa concluída.");
	}

}