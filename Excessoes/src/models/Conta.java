package models;

public class Conta  {
    private int saldo;

    /**
     *
     * @param x
     */
    public void deposita(int x){
        this.saldo += x;
    }
}
