package salario;

public class Salario {

    private Double salary;

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Salario(Double salary) {
        this.salary = salary;
    }

    public Double fixSalary() {
        return this.salary * 1.25;
    }
}
