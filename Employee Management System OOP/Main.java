//Hospital Management System

import java.util.ArrayList;

abstract class Employee{
    String name;
    String employeeID;
    double baseSalary;

    public Employee(String name, String employeeID, double baseSalary) {
        this.name = name;
        this.employeeID = employeeID;
        this.baseSalary = baseSalary;
    }

    public void displayDetails(){
        System.out.println("Name: "+name+" ID: "+employeeID+" Salary: "+baseSalary);
    }

    abstract double calculateSalary();
}
class Doctor extends Employee{
    String Specialization;

    public Doctor(String name, String employeeID, double baseSalary, String specialization) {
        super(name, employeeID, baseSalary);
        Specialization = specialization;
    }

    @Override
    double calculateSalary() {
        return baseSalary + 20000;
    }
}
class Nurse extends Employee{
    String shiftType;

    public Nurse(String name, String employeeID, double baseSalary, String shiftType) {
        super(name, employeeID, baseSalary);
        this.shiftType = shiftType;
    }


    @Override
    double calculateSalary() {
        return baseSalary + 10000;
    }
}

class Technician extends Employee{
    String department;

    public Technician(String name, String employeeID, double baseSalary, String department) {
        super(name, employeeID, baseSalary);
        this.department = department;
    }

    @Override
    double calculateSalary() {
        return baseSalary + 5000;
    }
}
public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employee = new ArrayList<>();

        Doctor d = new Doctor("Jawad Mahar","2312240",45000,"LunSpecialist");
        Nurse n = new Nurse("Samiullah","2312250",15000,"Night");
        Technician t = new Technician("Muzafar","2312260",12000,"Electric");

        employee.add(d);
        employee.add(n);
        employee.add(t);

        for(Employee e:employee){
            e.displayDetails();
        }

    }
}