package Logistica;
import java.util.Scanner;
public class Projeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Digite o peso do chassi:");
        double pesoChassi = scanner.nextDouble();
        System.out.println("Digite o peso do semi-roboque:");
        double pesoSemiRoque = scanner.nextDouble();
        System.out.println("Digite o peso da carroceria:");
        double pesoCarroceria = scanner.nextDouble();
        System.out.println("Digite o peso de outros equipamentos:");
        double pesoEquipamentos = scanner.nextDouble();
        System.out.println("Digite o peso bruto total (PBT):");
        double pesoBrutoTotal = scanner.nextDouble();
        System.out.println("Digite a carga total para o mês:");
        double cargaTotalMes = scanner.nextDouble();
        System.out.println("Digite a capacidade útil do veículo:");
        double capacidadeUtilVeiculo = scanner.nextDouble();
        System.out.println("Digite o tempo de ida:");
        double tempoIda = scanner.nextDouble();
        System.out.println("Digite o tempo de volta:");
        double tempoVolta = scanner.nextDouble();
        System.out.println("Digite o tempo de carga:");
        double tempoCarga = scanner.nextDouble();
        System.out.println("Digite o tempo de descarga:");
        double tempoDescarga = scanner.nextDouble();
        System.out.println("Digite o número de turnos de operação diário:");
        double numTurnosDiario = scanner.nextDouble();
        System.out.println("Digite a duração de cada turno:");
        double duracaoTurno = scanner.nextDouble();
        System.out.println("Digite o número de dias trabalhados por mês:");
        double numDiasTrabalhadosMes = scanner.nextDouble();
        System.out.println("Digite o número de dias parados para manutenção por mês:");
        double numDiasParadosManutencao = scanner.nextDouble();
        System.out.println("Digite o número de viagens necessárias para atender a demanda:");
        double numViagensNecessarias = scanner.nextDouble();

        // Chamada das funções
        double pesoTotalVeiculo = calcularPesoTotalVeiculo(pesoChassi, pesoSemiRoque, pesoCarroceria, pesoEquipamentos);
        double cargaUtilVeiculo = calcularCargaUtilVeiculo(pesoBrutoTotal, pesoTotalVeiculo);
        double numViagensMensais = calcularNumeroViagensMensais(cargaTotalMes, capacidadeUtilVeiculo);
        double tempoTotalViagem = calcularTempoTotalViagem(tempoIda, tempoVolta, tempoCarga, tempoDescarga);
        double tempoDiarioOperacao = calcularTempoDiarioOperacao(numTurnosDiario, duracaoTurno);
        double numViagensVeiculoPorDia = calcularNumeroViagensVeiculoPorDia(tempoTotalViagem, tempoDiarioOperacao);
        double numDiasDisponiveisMes = calcularDiasDisponiveisPorMes(numDiasTrabalhadosMes, numDiasParadosManutencao);
        double numViagensMensaisVeiculo = calcularNumeroViagensMensaisVeiculo(numViagensVeiculoPorDia, numDiasTrabalhadosMes);
        double frotaNecessaria = calcularFrotaNecessaria(numViagensNecessarias, numViagensMensaisVeiculo);

        // Saída de resultados
        System.out.println("A) Peso total do veículo: " + pesoTotalVeiculo);
        System.out.println("B) Carga útil do veículo: " + cargaUtilVeiculo);
        System.out.println("C) Número de viagens mensais: " + numViagensMensais);
        System.out.println("D) Tempo total de viagem: " + tempoTotalViagem);
        System.out.println("E) Tempo diário de operação: " + tempoDiarioOperacao);
        System.out.println("F) Número de viagens de um veículo por dia: " + numViagensVeiculoPorDia);
        System.out.println("G) Cálculo de número total de dias disponíveis por mês: " + numDiasDisponiveisMes);
        System.out.println("H) Número de viagens mensais de um veículo: " + numViagensMensaisVeiculo);
        System.out.println("I) Cálculo da frota necessária: " + frotaNecessaria);

        scanner.close();
    }

    public static double calcularPesoTotalVeiculo(double pesoChassi, double pesoSemiRoque, double pesoCarroceria, double pesoEquipamentos) {
        return pesoChassi + pesoSemiRoque + pesoCarroceria + pesoEquipamentos;
    }

    public static double calcularCargaUtilVeiculo(double pesoBrutoTotal, double pesoTotalVeiculo) {
        return pesoBrutoTotal - pesoTotalVeiculo;
    }

    public static double calcularNumeroViagensMensais(double cargaTotalMes, double capacidadeUtilVeiculo) {
        return cargaTotalMes / capacidadeUtilVeiculo;
    }

    public static double calcularTempoTotalViagem(double tempoIda, double tempoVolta, double tempoCarga, double tempoDescarga) {
        return tempoIda + tempoVolta + tempoCarga + tempoDescarga;
    }

    public static double calcularTempoDiarioOperacao(double numTurnosDiario, double duracaoTurno) {
        return numTurnosDiario * duracaoTurno;
    }

    public static double calcularNumeroViagensVeiculoPorDia(double tempoTotalViagem, double tempoDiarioOperacao) {
        return tempoDiarioOperacao / tempoTotalViagem;
    }

    public static double calcularDiasDisponiveisPorMes(double numDiasTrabalhadosMes, double numDiasParadosManutencao) {
        return numDiasTrabalhadosMes - numDiasParadosManutencao;
    }

    public static double calcularNumeroViagensMensaisVeiculo(double numViagensVeiculoPorDia, double numDiasTrabalhadosMes) {
        return numViagensVeiculoPorDia * numDiasTrabalhadosMes;
    }

    public static double calcularFrotaNecessaria(double numViagensNecessarias, double numViagensMensaisVeiculo) {
        return numViagensNecessarias / numViagensMensaisVeiculo;
		
		
		
		
		
	}

}
