import java.util.Scanner;

public class URI1008 {

    public static void main(String[] args) {

        int numeroFuncionario, numeroHorasTrabalhadas;
        Double valorHora, salario;

        Scanner leia = new Scanner(System.in);

        numeroFuncionario = Integer.parseInt(leia.nextLine());
        numeroHorasTrabalhadas = Integer.parseInt(leia.nextLine());

        valorHora = Double.parseDouble(leia.nextLine());

        salario = ( valorHora * numeroHorasTrabalhadas );

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f\n", salario);

    }

}
