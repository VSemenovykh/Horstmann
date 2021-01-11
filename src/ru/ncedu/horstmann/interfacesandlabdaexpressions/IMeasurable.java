package ru.ncedu.horstmann.interfacesandlabdaexpressions;

/**
 * This interface IMeasurable for class EmployeeImp
 * @version 1.0, 5 Jan 2021
 * @author Vladislav Semenovykh
 */
public interface IMeasurable {
    double getMeasure();
    public double average(IMeasurable[] objects);
    IMeasurable largest(IMeasurable[] objects);
}
