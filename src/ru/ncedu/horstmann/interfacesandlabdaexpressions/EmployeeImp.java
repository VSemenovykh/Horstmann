package ru.ncedu.horstmann.interfacesandlabdaexpressions;

/**
 * This class EmployeeImp
 * Exercises 1
 * Provide an interface Measurable with a method double getMeasure() that measures
 * an object in some way. Make Employee implement Measurable. Provide
 * a method double average(Measurable[] objects) that computes the average
 * measure. Use it to compute the average salary of an array of employees
 *
 * Exercises 2
 * Continue with the preceding exercise and provide a method Measurable
 * largest(Measurable[] objects). Use it to find the name of the employee with
 * the largest salary. Why do you need a cast?
 * @version 1.0, 5 Jan 2021
 * @author Vladislav Semenovykh
 */
public class EmployeeImp implements IMeasurable{
    private double salary; 
    private String name;

    /**
     * Constructor - creating a new instance with specific values
     * @see #EmployeeImp(double)
     */
    public EmployeeImp(){
        this.salary = 0.0;
    }

    /**
     * Constructor - creating a new instance with specific values
     * @param salary
     * @see #EmployeeImp(double, String)
     */
    public EmployeeImp(double salary){
        this.salary = salary;
    }

    /**
     * Constructor - creating a new instance with specific values
     * @param salary
     * @param name
     * @see #EmployeeImp()
     */
    public EmployeeImp(double salary, String name){
        this.salary = salary;
        this.name = name;
    }

    /**
     * Method to get field {@link #salary}
     * @return salary
     */
    @Override
    public double getMeasure(){
        return this.salary;
    }

    /**
     * Method to get field {@link #name}
     * @return name
     */
    public String getName(){
        return this.name;
    }

    /**
     * Method to get average salary employees
     * @return average salary
     */
    public double average(IMeasurable[] obj){
        for(int i = 0; i < obj.length; i++)
            salary +=((EmployeeImp)obj[i]).getMeasure();
        return salary/obj.length;
    }

    /**
     * Method to get the object with the largest salary
     * @return new obj
     */
    @Override
    public IMeasurable largest(IMeasurable[] obj){
        EmployeeImp employee = (EmployeeImp) obj[0];
        for(int i = 1; i < obj.length; i++){
            EmployeeImp other = (EmployeeImp) obj[i];
            if (employee.getMeasure() < other.getMeasure())
                employee = other;
        }
        return employee;
    }
}
