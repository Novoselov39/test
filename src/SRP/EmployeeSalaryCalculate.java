package SRP;

public class EmployeeSalaryCalculate {
        
    //данный класс создан для реализации принципа SRP

    private int baseSalary;

    public EmployeeSalaryCalculate(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double salaryCalculate(){
        return this.baseSalary * 1.5;
    }
}
