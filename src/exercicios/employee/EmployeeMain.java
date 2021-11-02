package exercicios.employee;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee pessoa1 = new Employee("Beto", "Noronha", 2555.00);
        Employee pessoa2 = new Employee("Maria", "da Rosa", 3850.75);

//        System.out.println(pessoa1);
//        System.out.println(pessoa2);

//        System.out.println(pessoa1.salarioAnual());
//        System.out.println(pessoa2.salarioAnual());

//        pessoa1.aumento(21);
//        pessoa2.aumento(18);

        System.out.println(pessoa1.salarioAnual2());
        System.out.println(pessoa1.salarioAnual());
//        System.out.println(pessoa2.salarioAnual());


    }
}
