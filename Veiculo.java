public abstract class Veiculo implements Alugavel {
    private String modelo;
    private int ano;
    private Disponibilidade disponivel;

    public Veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
        this.disponivel = Disponibilidade.DISPONIVEL;
    }

    public abstract void exibirInfo();

    // Verificar disponibilidade para alugar
    @Override
    public void alugar() {
        if (this.disponivel == Disponibilidade.DISPONIVEL) {
            this.disponivel = Disponibilidade.ALUGADO;
        } else {
            throw new IllegalStateException("O veículo não esta disponível.");
        }
    }

    // Realizar devolução do veículo caso esteja alugado
    @Override
    public void devolver() {
        if (this.disponivel == Disponibilidade.ALUGADO) {
            this.disponivel = Disponibilidade.DISPONIVEL;
        } else {
            throw new IllegalStateException("O veículo não esta alugado.");
        }
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public Disponibilidade getDisponivel() {
        return disponivel;
    }
}

enum Disponibilidade {
    DISPONIVEL,
    ALUGADO
}