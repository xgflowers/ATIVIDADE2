# ATIVIDADE2
Gerenciamento de Veículos
Este projeto é um sistema simples de gerenciamento de veículos, desenvolvido em Java utilizando os princípios de Programação Orientada a Objetos (POO). Ele demonstra o uso de herança, abstração, polimorfismo e encapsulamento por meio de classes e métodos.

📂 Estrutura do Projeto
O código está organizado no pacote veiculos, com as seguintes classes:

1 Veiculo (classe abstrata):

Atributos:
marca (público): Marca do veículo.
modelo (público): Modelo do veículo.
ano (privado): Ano de fabricação do veículo.
Métodos:
getAno() e setAno(int ano) para acessar e modificar o ano.
Método abstrato informacoesVeiculo(), implementado nas subclasses.

2 Carro (subclasse de Veiculo):

Atributos:
numeroPortas (público): Número de portas do carro.
Implementa informacoesVeiculo() para exibir os dados do carro.

3 Moto (subclasse de Veiculo):

Atributos:
cilindrada (privado): Cilindrada da moto em cc.
Métodos:
getCilindrada() e setCilindrada(int cilindrada) para acessar e modificar a cilindrada.
Implementa informacoesVeiculo() para exibir os dados da moto.

4 Main:

Classe principal para executar o programa, instanciar objetos de Carro e Moto, configurar seus atributos e exibir as informações.

🚀 Como Executar
Pré-requisitos
JDK 8 ou superior.
IDE como IntelliJ IDEA, Eclipse ou qualquer editor de código com suporte a Java.
Passo a passo

1 Clone o repositório:

git clone https://github.com/seu-usuario/gerenciamento-veiculos.git
cd gerenciamento-veiculos

2. Abra o projeto:

Importe o diretório como um projeto Java.
Certifique-se de que o JDK está configurado.

3 Estrutura do código:

Certifique-se de que as classes estão no seguinte local:
src/
  veiculos/
    Veiculo.java
    Carro.java
    Moto.java
    Main.java
    
4 Execute o programa:

Localize a classe Main no pacote veiculos.
Clique com o botão direito e escolha Run Main.main().
A saída será exibida no console.

📜 Licença
Este projeto é de uso livre e pode ser modificado ou distribuído conforme sua necessidade.

Se tiver dúvidas ou sugestões, sinta-se à vontade para contribuir ou abrir uma issue.
