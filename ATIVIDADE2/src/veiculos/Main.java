package veiculos;

public class Main {
    public static void main(String[] args) {
        // Criando um carro
        Carro carro = new Carro("Toyota", "Corolla", 2022, 4);
        System.out.println(carro.informacoesVeiculo());

        // Criando uma moto
        Moto moto = new Moto("Yamaha", "YZF-R3", 2023, 321);
        System.out.println(moto.informacoesVeiculo());
    }
}