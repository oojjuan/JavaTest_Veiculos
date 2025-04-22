public class Main {
    
    public static void main(String[] args) {
        Moto moto = new Moto("Yamaha", 2007, 849);
        Carro carro = new Carro("Fusca", 1980, 2);

        moto.exibirInfo();
        carro.exibirInfo();
    }
}
