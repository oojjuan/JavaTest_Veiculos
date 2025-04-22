public class Moto extends Veiculo{
    private int cilindradas;

    public Moto(String modelo, int ano, int cilindradas) {
        super(modelo, ano);
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Modelo do carro: " + getModelo() + "\nAno: " + getAno() + "\nCilindradas: " + getCilindradas());
    }

    public int getCilindradas() {
        return cilindradas;
    }
}
