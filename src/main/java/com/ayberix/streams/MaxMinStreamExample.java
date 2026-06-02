package com.ayberix.streams;

import java.util.ArrayList;
import java.util.List;

public class MaxMinStreamExample {
    public static void main(String[] args) {
        /**
         * Create a list of salary and perform below operations using Stream API
         * 1. Filter the salary which is greater than 3000
         * 2. Find the max salary from the filtered list
         * 3. Find the min salary from the filtered list
         * 4. Find the sum of salary from the filtered list
         * 5. Find the average of salary from the filtered list
         */
//Monolithic Approach of creating list Object : It is mutable
        List<Integer> salList = new ArrayList<>();
        salList.add(1000);
        salList.add(2000);
        salList.add(3000);
        salList.add(4000);
        salList.add(5000);
        salList.add(2500);
        salList.add(3500);
        salList.add(1200);
        salList.add(4200);
        salList.add(1800);
        salList.add(3700);


        /**
         * add those salary which is greater than 3000.
         */
        // int totalSal = 0;
        List<Integer> filteredSalaryList = salList.stream().filter(sal -> sal > 3500).toList();
        System.out.println("Filtered Salary List: " + filteredSalaryList);

        filteredSalaryList.stream().max(Integer::compareTo).ifPresent(max -> System.out.println("Max Salary: " + max));
        filteredSalaryList.stream().min(Integer::compareTo).ifPresent(min -> System.out.println("Min Salary: " + min));
        int sum = filteredSalaryList.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sum of Salary: " + sum);
        double avg = filteredSalaryList.stream().mapToInt(Integer::intValue).average().orElse(0.0);
        System.out.println("Average Salary: " + avg);

//Declarative Approach of creating list Object : It is immutable
        List<Integer> salaryList = List.of(1000, 2000, 3000, 4000, 5000, 2500,3500,1200,4200,1800,3700);
        /**
         * Filter the salary which is greater than 3000
         */
        List<Integer> filteredList = salaryList.stream()
                .filter((Integer salary) -> salary > 3000)
                .toList();
        System.out.println("Filtered Salary List: " + filteredList);

        /**
         * Filter the count of salary which is greater than 3000
         */
        long count = salaryList.stream()
                .filter((Integer salary) -> salary > 3000).count();
        System.out.println("Filtered Salary List count: " + count);

        /** EMPLOYEE EXAMPLE
         * Print all employee names using stream whose salary is greater than 5000 and age is less than 35.
         */


        Employee emp1 = new Employee(101L, "John", 4500.0, "IT", 30, "M", "New York");
        Employee emp2 = new Employee(102L, "Alice", 5500.0, "HR", 28, "M", "Los Angeles");
        Employee emp3 = new Employee(103L, "Bob", 6000.0, "Finance", 35,        "M", "Chicago");
        Employee emp4 = new Employee(104L, "John cena", 4500.0, "IT", 30, "M", "New York");
        Employee emp5 = new Employee(105L, "Alica", 5500.0, "HR", 28, "F", "Los Angeles");
        Employee emp6 = new Employee(106L, "Boba", 6000.0, "Finance", 35,        "M", "Chicago");


        List<Employee> employeeList = List.of(emp1, emp2, emp3,emp4, emp5, emp6);

        /**
         * Print all employee names using stream whose salary is greater than 5000 and age is less than 35 and sort by name and gender should be Male and city should be New York.
         */

        List<Employee> list = employeeList.stream()
                .filter((Employee emp) -> emp.getEmpSalary() > 5000)
                .filter((Employee emp) -> emp.getEmpAge() < 35)
                .filter((Employee emp) -> emp.getGender().equals("M"))
                .filter((Employee emp) -> emp.getCity().equals("Los Angeles"))
                .toList();
        System.out.println("Employee List: " + list);

        list.stream().map(Employee::getEmpName)
                .forEach((String name) -> System.out.println("Employee Name: " + name));

        List<String> employeeName = list.stream().map(Employee::getEmpName).toList();
        System.out.println("Employee Name List: " + employeeName);

        //print distinct employee names and gender
        list.stream().map(emp -> emp.getEmpName()+"-"+emp.getGender()).distinct()
                .forEach((String name) -> System.out.println("Distinct Employee Name: " + name));
    }

    //Intermediate Operations: filter, map, sorted, distinct
    //Terminal Operations: forEach, collect, count, min, max, sum, average

}
