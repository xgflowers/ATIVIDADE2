package veiculos;

public abstract class Veiculo {
    public String marca;
    public String modelo;
    private int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano > 0) {
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("O ano deve ser maior que 0.");
        }
    }

    public abstract String informacoesVeiculo();
}