package Questão2;

public class SistemaUber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância percorrida (em km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Digite o tempo de espera (em minutos): ");
        int tempoEspera = scanner.nextInt();

        System.out.print("Digite a tarifa base (em R$): ");
        double tarifaBase = scanner.nextDouble();

        System.out.print("Digite o fator de demanda (ex.: 1.0 para normal, 1.5 para 50%% a mais): ");
        double fatorDemanda = scanner.nextDouble();

        CorridaUber corrida = new CorridaUber();
        corrida.distancia = distancia;        
        corrida.tempoEspera = tempoEspera;
        corrida.tarifaBase = tarifaBase;
        corrida.fatorDemanda = fatorDemanda;

        corrida.exibirDetalhesCorrida();

        scanner.close();
    }
}