package org.example.generics;

public class Employee extends User implements Comparable<Employee>    {
    private String name;
    private double salary;
    public Employee(String name, double salary) {}
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Employee o) {
        if (this.salary < o.salary) {
            return -1;
        } else
        {
            return 1;
        }
    }
}
