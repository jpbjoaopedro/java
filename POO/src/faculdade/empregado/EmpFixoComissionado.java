package faculdade.empregado;

public class EmpFixoComissionado extends EmpComissionado {
    private double salarioBase;

    public EmpFixoComissionado(String nome, String sobreNome, String cpf, double totalVendas, double taxaComissao,
            double salarioBase) {
        super(nome, sobreNome, cpf, totalVendas, taxaComissao);
        this.salarioBase = salarioBase < 0 ? 0 : salarioBase;
    }

    // Construtor vazio
    public EmpFixoComissionado() {
    }

    // Salario base
    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        if (salarioBase < 0) {
            this.salarioBase = 0;
        } else {
            this.salarioBase = salarioBase;
        }
    }

    // Salario
    public double salario() {
        return super.salario() + this.salarioBase;
    }

    // toString
    public String toString() {
        return "Empregado Fixo Comissionado {" +
                "nome='" + getNome() + '\'' +
                ", sobrenome='" + getSobreNome() + '\'' +
                ", cpf='" + getCpf() + '\'' +
                ", totalVendas=" + getTotalVendas() +
                ", taxaComissao=" + getTaxaComissao() +
                ", salarioBase=" + salarioBase +
                ", salario=" + salario() +
                '}';
    }
}
