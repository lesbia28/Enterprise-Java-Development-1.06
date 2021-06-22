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
        Employee employee2= new Employee("Maria", 22,"intern",7200);
        Employee employee3= new Employee("Luisa",32, "Chief Analitics Officer", 36000);
        Employee employee4= new Employee("Alba", 28,"Chief operating Officer", 30000);
        Employee employee5= new Employee("Marta", 35, "Financial Control Officer", 50000);
        Employee employee6=new Employee("Alberto", 29, "Chief Technology Officer", 55000);
        Employee employee7= new Employee("Ismael", 27,"Community Manager",28000 );
        Employee employee8= new Employee ("Andres", 36, "Marketing Manager", 40000);
        Employee employee9= new Employee("Mariela", 34,"Business Development Manager", 55000);
        Employee employee10= new Employee("Augusto", 31, "Corporate Communications Manager", 32000);


    }


        }



