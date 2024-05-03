public class Cliente {
    private String nome;
    private String cpf;
    private int idade;

    public Cliente(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

// Métodos de acesso 
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }   



    // Método para imprimir os detalhes do cliente
    public void imprimirDetalhesCliente() {
        System.out.println("\nNome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Idade: " + idade);
    }

// Teste

    public static void main(String[] args) {
        // Criando um objeto Cliente
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00", 30);

        // Imprimindo os detalhes do cliente
        cliente1.imprimirDetalhesCliente();
    }

}
