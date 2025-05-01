package faculdade.empregado;

public class EmpComissionado {
    private String nome;
    private String sobreNome;
    private String cpf;
    private double totalVendas;
    private double taxaComissao;

    public EmpComissionado(String nome, String sobreNome, String cpf, double totalVendas, double taxaComissao) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.cpf = cpf;
        this.totalVendas = totalVendas;
        this.taxaComissao = taxaComissao;
    }

    // Construtor vazio
    public EmpComissionado() {
    }

    // Nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Sobrenome
    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    // Cpf
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // Total vendas
    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        if (totalVendas < 0) {
            this.totalVendas = 0;
        } else {
            this.totalVendas = totalVendas;
        }
    }

    // Taxa comissao
    public double getTaxaComissao() {
        return taxaComissao;
    }

    public void setTaxaComissao(double taxaComissao) {
        if (taxaComissao < 0) {
            this.taxaComissao = 0;
        } else {
            this.taxaComissao = taxaComissao;
        }
    }

    // Metodo salario
    public double salario() {
        return this.totalVendas * this.taxaComissao;
    }

    // toString
    public String toString() {
        return "Empregado Comissionado {" +
                "nome='" + nome + '\'' +
                ", sobrenome='" + sobreNome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", totalVendas=" + totalVendas +
                ", taxaComissao=" + taxaComissao +
                ", salario=" + salario() +
                '}';
    }
}
