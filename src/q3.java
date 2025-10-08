//Veiculo
package veiculos;

public class Veiculo {
    private String marca;
    private String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void exibirInfo() {
        System.out.println("Marca: " + marca + " | Modelo: " + modelo);
    }
}
//Carro
package veiculos;

public class Carro extends Veiculo {
    private int portas;

    public Carro(String marca, String modelo, int portas) {
        super(marca, modelo);
        this.portas = portas;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Carro - " + portas + " portas");
        super.exibirInfo();
    }
}
//Moto
package veiculos;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int cilindradas) {
        super(marca, modelo);
        this.cilindradas = cilindradas;
    }

    @Override
    public void exibirInfo() {
        System.out.println("Moto - " + cilindradas + "cc");
        super.exibirInfo();
    }
}
//TesteVeiculo
package veiculos;

public class TesteVeiculo {
    public static void main(String[] args) {
        Veiculo[] garagem = new Veiculo[3];
        garagem[0] = new Carro("Bugatti", "Divo", 2);
        garagem[1] = new Moto("Honda", "Projeto Koraidon", 160);
        garagem[2] = new Carro("Ferrari", "F80", 2);

        for (Veiculo v : garagem) {
            v.exibirInfo();
            System.out.println("----------------");
        }
    }
}
