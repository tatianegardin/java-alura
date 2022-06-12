public class Fluxo {
    public static void main(String[] args) {
        System.out.println("Start - main");
        try{
            metodo1();
        } catch (ArithmeticException | NullPointerException | MinhaExcecao ex){
            System.out.println(ex.getMessage());
        }
        System.out.println("End - main");

        Conta conta = new Conta();

    }

    public static void metodo1  () {
        System.out.println("Start - Método 1");
        metodo2();
        System.out.println("End - Método 1");
    }
    public static void metodo2() {
        System.out.println("Start - Método 2");
        throw  new MinhaExcecao("Deu bem ruim");

    }


}