package Model;

public class Intern extends Employee{

    static final int MAX_SALARY = 20000;

    public Intern(String name, int age, String designation, double salary) {
        super(name, age, designation, salary);
        if (salary <= MAX_SALARY) {
            super.setSalary(salary);


        } else {
            super.setSalary(MAX_SALARY);

        }
    }


    @Override
    public void setSalary(double salary) {

        if (salary<=MAX_SALARY){
            super.setSalary(salary);


            }
           else{
            super.setSalary(MAX_SALARY);




        }
    }
}
