public abstract class Veiculo implements Alugavel {
    private String modelo;
    private int ano;
    private Disponivel disponivel;

    public Veiculo(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
        this.disponivel = Disponivel.DISPONIVEL;
    }

    public abstract void exibirInfo();

    // Verificar disponibilidade para alugar
    @Override
    public void alugar() {
        if (this.disponivel == Disponivel.DISPONIVEL) {
            this.disponivel = Disponivel.ALUGADO;
        } else {
            throw new IllegalStateException("O veículo não esta disponível.");
        }
    }

    // Realizar devolução do veículo caso esteja alugado
    @Override
    public void devolver() {
        if (this.disponivel == Disponivel.ALUGADO) {
            this.disponivel = Disponivel.DISPONIVEL;
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

    public Disponivel getDisponivel() {
        return disponivel;
    }
}

enum Disponivel {
    DISPONIVEL,
    ALUGADO
}