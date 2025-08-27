package salario;

public class Salary {

    private double minSalary;
    private double salary;

    public Salary(double minSalary, double salary) {
        this.minSalary = minSalary;
        this.salary = salary;
    }

    public double getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(double minSalary) {
        this.minSalary = minSalary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Double countSalary() {
        return salary/minSalary;
    }
}
