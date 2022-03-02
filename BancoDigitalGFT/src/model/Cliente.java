package model;

/**
 *
 * @author Felipe
 */
public class Cliente {

    private String nome;

    public Cliente(String nome) {
        this.setNome(nome);
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }
}
