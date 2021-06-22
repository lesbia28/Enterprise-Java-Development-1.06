package Model;

public class Employee {

        String name;
        int age;
        String designation;
        double salary;

    public Employee() {
    }

    public Employee(String name, int age, String designation, double salary) {
            this.name = name;
            this.age = age;
            this.designation = designation;
            this.salary = salary;
        }




        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getDesignation() {
            return designation;
        }

        public void setDesignation(String designation) {
            this.designation = designation;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;


        }

        public void printEmployee() {
            System.out.println("Name:" + name);
            System.out.println("Age:" + age);
            System.out.println("Designation:" + designation);
            System.out.println("Salary:" + salary);
        }

    }







