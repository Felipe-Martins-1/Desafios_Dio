package model;

/**
 *
 * @author Felipe
 */
public abstract class Conta {

    private static int contador = 0;
    private final int AGENCIA = 1;
    private int numero = 0;
    private double saldo = 0.0;
    private Cliente cliente;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
        this.contador++;
        this.setNumero(this.contador);
    }

    private int getNumero() {
        return numero;
    }

    private void setNumero(int numero) {
        this.numero = numero;
    }

    private double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) {
        this.setSaldo(this.getSaldo() - valor);
    }

    public void depositar(double valor) {
        this.setSaldo(this.getSaldo() + valor);
    }

    public void tranferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public void mostrarExtrato() {
        System.out.printf("\nAgencia = " + this.AGENCIA
                + "\nNumero = " + this.getNumero()
                + "\nNome = " + this.cliente.getNome()
                + "\nSaldo = %.2f\n", this.getSaldo());
    }
}
