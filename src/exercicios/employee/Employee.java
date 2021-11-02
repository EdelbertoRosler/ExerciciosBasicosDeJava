package exercicios.employee;

public class Employee {
    private String nome, sobrenome;
    private double salario;

    public Employee(String nome, String sobrenome, double salario) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.salario = salario;
    }


    public String salarioAnual(){
        if (this.salario < 0){
            return "0.0";
        }
        return String.format("%.2f", (this.salario * 12));
    }

    public Double salarioAnual2(){
        return this.salario * 12;
    }

    public void aumento(double percentual){
        this.salario = this.salario * (1 + ( percentual / 100));
    }

//    @Override
//    public String toString() {
//        return "Employee \n" +
//                "   nome = " + this.nome + " " + this.sobrenome + "\n" +
//                "   salario = R$" + String.format("%.2f", this.salario);
//    }


    @Override
    public String toString() {
        return "Employee \n" +
                "   nome=" + nome + " " + sobrenome +"\n"+
                "   salario=" + salario;
    }

    public String getNome() { return nome; }

    public void setNome(String nome) { this.nome = nome; }

    public String getSobrenome() { return sobrenome; }

    public void setSobrenome(String sobrenome) { this.sobrenome = sobrenome; }

    public double getSalario() { return salario; }

    public void setSalario(double salario) { this.salario = salario; }
}
