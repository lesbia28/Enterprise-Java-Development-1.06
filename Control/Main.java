package Control;

/*

Lab 1.06

Create an Employee class to represent an employee of a company.
Add all relevant properties and behaviors that you might need but
 you have to include a salary property.
 Don’t forget to add getters and setters.
Create an Intern class that extends from Employee. All the Interns
have a salary limit of 20000 (constant). You must validate if an intern
 is created (or salary updated) with a bigger salary than the max. The max value is set.
Write a program that creates 10 Employees and print it al the
properties into a file named employees.txt.

*/

import Model.Employee;

public class Main {

    public static void main(String[] args) {
        Employee employee1=new Employee("Miguel",30,"CEO", 500000);
    }

        public void printEmployee() {
            System.out.println("Name:" + name);
            System.out.println("Age:" + age);
            System.out.println("Designation:" + designation);
            System.out.println("Salary:" + salary);
        }

    }
    }