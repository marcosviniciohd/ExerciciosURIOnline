import java.util.Scanner;

public class URI1009 {

    public static void main(String[] args) {

        String nomeVendedor;
        Double salarioFixo, totalDeVendasMes, totalAReceber;

        Scanner leia = new Scanner(System.in);

        nomeVendedor = leia.nextLine();
        salarioFixo = Double.parseDouble(leia.nextLine());
        totalDeVendasMes = Double.parseDouble(leia.nextLine());

        totalAReceber = salarioFixo + ( (totalDeVendasMes * 15) / 100 );

        System.out.printf("TOTAL = R$ %.2f\n", totalAReceber);

    }

}
