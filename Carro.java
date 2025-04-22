public class Carro extends Veiculo {
    private int portas;

    public Carro (String modelo, int ano, int portas) {
        super(modelo, ano);
        this.portas = portas;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Modelo do carro: " + getModelo() + "\nAno: " + getAno() + "\nQntd. de portas: " + getPortas());
    }

    public int getPortas() {
        return portas;
    }
}
