import java.util.*;

public class atv1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        double salario, novoSalario, ferias, decTerceiro;

        System.out.println("Menu de opções: \n1 - Novo Salário\n2 - Férias\n3 - Décimo terceiro\n4 - Sair");
        opcao = sc.nextInt();
        while (opcao != 4) {
            switch (opcao) {
                case 1:
                    salario = testeSalario();
                    if (salario < 1000) {
                        novoSalario = salario + (salario * 0.15);
                        System.out.println("Novo Salário: " + novoSalario);
                        menuOp();
                        opcao = sc.nextInt();
                    } else if (salario >= 1000 && salario <= 2000) {
                        novoSalario = salario + (salario * 0.10);
                        System.out.println("Novo Salário: " + novoSalario);
                        menuOp();
                        opcao = sc.nextInt();
                    } else if (salario > 2000) {
                        novoSalario = salario + (salario * 0.05);
                        System.out.println("Novo Salário: " + novoSalario);
                        menuOp();
                        opcao = sc.nextInt();
                    }
                    break;
                case 2:
                    salario = testeSalario();
                    ferias = salario + (salario / 3);
                    System.out.println("Suas férias valem: " + ferias);
                    menuOp();
                    opcao = sc.nextInt();
                    break;
                case 3:
                    salario = testeSalario();
                    System.out.println("Digite o número de meses de trabalho: (Máx 12)");
                    int meses = sc.nextInt();
                    while (meses < 0 || meses > 12) {
                        System.out.println("Digite os meses novamente: ");
                        meses = sc.nextInt();
                    }
                    decTerceiro = (salario * meses) / 12;
                    System.out.println("Seu décimo terceiro é: " + decTerceiro);
                    menuOp();
                    opcao = sc.nextInt();
                    break;
                case 4:
                    System.out.println("Você saiu!");
                    break;
                default:
                    System.out.println("\nOpção inválida! ");
                    System.out
                            .println("\nMenu de opções: \n1 - Novo Salário\n2 - Férias\n3 - Décimo terceiro\n4 - Sair");
                    opcao = sc.nextInt();
            }
        }
        sc.close();
    }

    public static void menuOp() {
        System.out.println("\nMenu de opções: \n1 - Novo Salário\n2 - Férias\n3 - Décimo terceiro\n4 - Sair");
    }

    public static double testeSalario() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu salário: ");

        double salario = sc.nextInt();
        while (salario < 0) {
            System.out.println("Salário inválido!\nDigite novo salário: ");
            salario = sc.nextInt();
        }
        return salario;
    }
}