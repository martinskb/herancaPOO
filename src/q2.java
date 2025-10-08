package pessoas;

public class Fornecedor extends Pessoa {
    private double valorCredito;
    private double valorDivida;

    public Fornecedor() {
        super();
        this.valorCredito = 0;
        this.valorDivida = 0;
    }

    public Fornecedor(String nome, String endereco, String telefone,
                      double valorCredito, double valorDivida) {
        super(nome, endereco, telefone);
        this.valorCredito = valorCredito;
        this.valorDivida = valorDivida;
    }

    public double getValorCredito() { return valorCredito; }
    public void setValorCredito(double valorCredito) { this.valorCredito = valorCredito; }

    public double getValorDivida() { return valorDivida; }
    public void setValorDivida(double valorDivida) { this.valorDivida = valorDivida; }

    public double obterSaldo() {
        return valorCredito - valorDivida;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Valor Crédito: " + valorCredito +
                ", Valor Dívida: " + valorDivida +
                ", Saldo: " + obterSaldo();
    }
}

//teste

package pessoas;

public class TesteFornecedor {
    public static void main(String[] args) {
        Fornecedor f = new Fornecedor("McDonald's", "Rod. Augusto Montenegro", "(91) 4002-8922", 10000, 2500);
        System.out.println(f);
    }
