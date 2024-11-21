package veiculos;

public class Moto extends Veiculo {
    private int cilindrada;

    public Moto(String marca, String modelo, int ano, int cilindrada) {
        super(marca, modelo, ano);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        if (cilindrada > 0) {
            this.cilindrada = cilindrada;
        } else {
            throw new IllegalArgumentException("A cilindrada deve ser maior que 0.");
        }
    }

    @Override
    public String informacoesVeiculo() {
        return "Moto - Marca: " + marca + ", Modelo: " + modelo +
                ", Ano: " + getAno() + ", Cilindrada: " + cilindrada + "cc";
    }
}