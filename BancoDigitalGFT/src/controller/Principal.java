package controller;

import java.util.Scanner;
import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

/**
 *
 * @author Felipe
 */
public class Principal {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nomeConta = "", funcao = "";
        float valor = 0;

        Cliente c1 = new Cliente("Guilherme");
        Cliente c2 = new Cliente("Paula");

        Conta cc = new ContaCorrente(c1);
        Conta cp = new ContaPoupanca(c2);
        Conta conta = null, contaDestino = null;

        while (true) {
            System.out.println("\ne = encerrar");
            System.out.println("Nome");
            nomeConta = scan.next();

            if (nomeConta.equals("Guilherme")) {
                conta = cc;
                contaDestino = cp;
            } else if (nomeConta.equals("Paula")) {
                conta = cp;
                contaDestino = cc;
            } else if (nomeConta.equals("e")) {
                break;
            }

            while (true) {
                System.out.println("\nFunções disponíveis "
                        + "\nd = depositar"
                        + "\nt = transferir"
                        + "\ns = sacar"
                        + "\ne = extrato"
                        + "\nsa = sair");
                funcao = scan.next();
                if (funcao.equals("d")) {
                    System.out.println("Valor");
                    valor = scan.nextFloat();
                    conta.depositar(valor);
                } else if (funcao.equals("t")) {
                    System.out.println("Valor");
                    valor = scan.nextFloat();
                    conta.tranferir(valor, contaDestino);
                } else if (funcao.equals("s")) {
                    System.out.println("Valor");
                    valor = scan.nextFloat();
                    conta.sacar(valor);
                } else if (funcao.equals("e")) {
                    conta.mostrarExtrato();
                } else if (funcao.equals("sa")) {
                    break;
                }
            }
        }
    }
}
