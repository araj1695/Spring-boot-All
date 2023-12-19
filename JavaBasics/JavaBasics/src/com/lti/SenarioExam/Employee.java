package com.lti.SenarioExam;

import java.util.Scanner;

// Abstruct Employee class for creating employee objects and employee methods 
public abstract class Employee {
    int EmployeeId;
    String EmployeeName;
    double hourlyRate;
    double workedHours;

    // Default constructor
    public Employee(){}

    // paramitariged constructor
    public Employee(int employeeId, String employeeName) {
        EmployeeId = employeeId;
        EmployeeName = employeeName;
    }

    // Abstract method for setting hourlyrate for employee
    public abstract void setHourlyRate(double hourlyRate);

    // Abstruct method for setting worked hours for employee
    public abstract void setWorkedHours(double workedHours);

    // In built to string method for printiting the employee data
    @Override
    public String toString() {
        return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", hourlyRate=" + hourlyRate
                + ", workedHours=" + workedHours + "]";
    }

    // ==========================  Main Method =========================
    public static void main(String[] args) {
    boolean flag = true;
    do{
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("================================================");
            System.out.print("Please Enter the Employee ID: ");
            int id = Integer.parseInt(sc.nextLine());
            System.out.print("Please Enter employee name: ");
            String name = sc.nextLine();
            System.out.print("Please Enter weekly worked hour for "+name+" : ");
            double workedHour = Double.parseDouble(sc.nextLine());
            System.out.print("Please Enter hourly rate for "+name+" : ");
            double hourlyRate = Double.parseDouble(sc.nextLine());
            WageCalculator w = new WageCalculator(id,name);
            w.setHourlyRate(hourlyRate);
            w.setWorkedHours(workedHour);
            boolean f = true;
            do{
                System.out.println("================================================");
                System.out.println("Please select one option.");
                System.out.println("1. Weekly Pay Check.");
                System.out.println("2. BiWeekly Pay Check.");
                System.out.println("3. Exit.");
                System.out.print("Please enter number between 1 and 3: ");
                int choice = Integer.parseInt(sc.nextLine());
                switch(choice){
                    case 1:
                    System.out.println("Weekly pay check for employee "+w.EmployeeName+" is "+w.CalculateWeeklyPayCheck());
                    break;
                    case 2:
                    System.out.println("BiWeekly pay check for employee "+w.EmployeeName+" is "+w.CalculateBiWeeklyPayCheck());
                    break;
                    case 3:
                    f = false;
                    break;
                    default:
                    System.out.println("Invalid choice.");
                }
            }while(f);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.println("================================================");
        // sc.close();
        flag = false;
    }while(flag);
    }
}
