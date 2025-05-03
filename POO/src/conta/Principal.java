package conta;

import java.util.Scanner;
import area.*;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;

        System.out.println("===== Bem vindo =====");

        do {
            System.out.println(
                    "1. Calcular área do Quadrado\n" +
                            "2. Calcular área do Retângulo\n" +
                            "3. Utilizar a Conta Corrente\n" +
                            "4. Utilizar a Conta Poupança\n" +
                            "5. Sair\n" +
                            "Digite a opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\nDigite o lado do quadrado: ");
                    int ladoQuadrado = scanner.nextInt();
                    Quadrado quadrado = new Quadrado(ladoQuadrado);
                    System.out.println(quadrado.toString());
                    break;

                case 2:
                    System.out.println("\nDigite o lado do retangulo: ");
                    int ladoRetanculo = scanner.nextInt();
                    System.out.println("\nDigite a altura do retangulo: ");
                    int alturaRetangulo = scanner.nextInt();
                    Retangulo retangulo = new Retangulo(ladoRetanculo, alturaRetangulo);
                    System.out.println(retangulo.toString());
                    break;

                case 3:
                    int opcaoConta = 0;
                    ContaCorrente contaCorrente = new ContaCorrente(0);

                    Scanner sc1 = new Scanner(System.in);

                    System.out.println("=== Conta Corrente Acessada! ===");

                    do {
                        System.out.println(
                                "1. Depositar\n" +
                                        "2. Sacar\n" +
                                        "3. Ver conta\n" +
                                        "4. Sair\n" +
                                        "Digite a opção desejada: ");
                        opcaoConta = sc1.nextInt();

                        switch (opcaoConta) {
                            case 1:
                                System.out.println("\nDigite o valor a ser depositado: ");
                                double deposito = sc1.nextDouble();
                                contaCorrente.depositar(deposito);
                                break;
                            case 2:
                                System.out.println("\nDigite o valor a sacar: ");
                                double saque = sc1.nextDouble();
                                contaCorrente.sacar(saque);
                                break;
                            case 3:
                                System.out.println(contaCorrente.toString());
                                break;
                            case 4:
                                System.out.println("\nSaindo da conta corrente...");
                                break;
                            default:
                                System.out.println("\nOpção inválida! Tente novamente.");
                                break;
                        }

                    } while (opcaoConta != 4);
                    break;

                case 4:
                    opcaoConta = 0;
                    ContaPoupanca contaPoupanca = new ContaPoupanca(0);

                    Scanner sc2 = new Scanner(System.in);

                    System.out.println("=== Conta Poupança Acessada! ===");

                    do {
                        System.out.println(
                                "1. Depositar\n" +
                                        "2. Sacar\n" +
                                        "3. Ver conta\n" +
                                        "4. Sair\n" +
                                        "Digite a opção desejada: ");
                        opcaoConta = sc2.nextInt();

                        switch (opcaoConta) {
                            case 1:
                                System.out.println("\nDigite o valor a ser depositado: ");
                                double deposito = sc2.nextDouble();
                                contaPoupanca.depositar(deposito);
                                break;
                            case 2:
                                System.out.println("\nDigite o valor a sacar: ");
                                double saque = sc2.nextDouble();
                                contaPoupanca.sacar(saque);
                                break;
                            case 3:
                                System.out.println(contaPoupanca.toString());
                                break;
                            case 4:
                                System.out.println("\nSaindo da conta corrente...");
                                break;
                            default:
                                System.out.println("\nOpção inválida! Tente novamente.");
                                break;
                        }

                    } while (opcaoConta != 4);
                    break;

                case 5:
                    System.out.println("\n=== Obrigado por utilizar o sistema! ===");
                    break;
                default:
                    System.out.println("\nOpção inválida! Tenve novamente.");
                    break;
            }

        } while (opcao != 5);
        scanner.close();
    }
}
