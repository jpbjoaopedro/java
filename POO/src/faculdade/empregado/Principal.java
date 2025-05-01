package faculdade.empregado;

public class Principal {
    public static void main(String[] args) {
        EmpComissionado emp1 = new EmpComissionado("Ana", "Silva", "111.222.333-44", 10000.0, 0.1);
        EmpComissionado emp2 = new EmpComissionado();
        emp2.setNome("Carlos");
        emp2.setSobreNome("Oliveira");
        emp2.setCpf("555.666.777-88");
        emp2.setTotalVendas(8000.0);
        emp2.setTaxaComissao(0.12);

        EmpFixoComissionado empF1 = new EmpFixoComissionado("Marina", "Souza", "999.000.111-22", 12000.0, 0.05, 2000.0);
        EmpFixoComissionado empF2 = new EmpFixoComissionado();
        empF2.setNome("João");
        empF2.setSobreNome("Pereira");
        empF2.setCpf("333.444.555-66");
        empF2.setTotalVendas(9000.0);
        empF2.setTaxaComissao(0.08);
        empF2.setSalarioBase(1500.0);

        // Exibindo tudo com toString()
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(empF1);
        System.out.println(empF2);
    }
}