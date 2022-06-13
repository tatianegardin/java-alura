package br.com.bytebank.modelo;

public class GuardadorDeReferencias {
    Object[] ref ;
    int posicaoLivre;

    public GuardadorDeReferencias() {
        this.ref = new Object[10];
        this.posicaoLivre = 0;
    }

    public void adiciona(Object ref) {
        this.ref[posicaoLivre] = ref;
        this.posicaoLivre++;
    }

    public int getQuantidade() {
        return this.posicaoLivre;
    }
}
