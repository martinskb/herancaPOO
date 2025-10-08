package pessoas;

public class Pessoa {
    private String nome;
    private String endereco;
    private String telefone;

    public Pessoa() {
        this.nome = "";
        this.endereco = "";
        this.telefone = "";
    }

    public Pessoa(String nome) {
        this.nome = nome;
        this.endereco = "";
        this.telefone = "";
    }

    public Pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getNome() { return nome; }
    public String getEndereco() { return endereco; }
    public String getTelefone() { return telefone; }

    public void setNome(String nome) { this.nome = nome; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Endereço: " + endereco + ", Telefone: " + telefone;
    }
}
