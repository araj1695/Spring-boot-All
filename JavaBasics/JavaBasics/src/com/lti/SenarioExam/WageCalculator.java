package com.lti.SenarioExam;

// Wage Caculator class which inherit employee class
public class WageCalculator extends Employee {
    double weeklyPayCheck;
    double biWeeklyPayCheck;
    double overTimeHours;

    // default constructor
    public WageCalculator(){}

    // Paramitariged constructor
    public WageCalculator(int employeeId, String employeeName) {
        super(employeeId, employeeName);
    }

    // setter method for setting hourly rate for an Employee
    public void setHourlyRate(double hourlyRate){
        this.hourlyRate = hourlyRate;
    }

    // Setter method for setting worked hours for an Employee
    public void setWorkedHours(double workedHours){
        this.workedHours = workedHours;
    }

    // getter method for getting weekly pay check for an employee
    public double getWeeklyPayCheck() {
        return weeklyPayCheck;
    }

    // getter method for getting biweekly pay check for an employee
    public double getBiWeeklyPayCheck() {
        return biWeeklyPayCheck;
    }

    //  Method for calculating weekly pay check for an Employee
    public double CalculateWeeklyPayCheck(){
        if(this.workedHours<=40){
            this.weeklyPayCheck = workedHours*hourlyRate;
            this.overTimeHours = 0;
            return this.weeklyPayCheck;
        }
        else{
            this.overTimeHours = this.workedHours-40;
            this.weeklyPayCheck = this.workedHours*hourlyRate + (this.overTimeHours*hourlyRate*.5);
            return this.weeklyPayCheck;
        }
    }

    // Method for calculating bi weekly pay check for an Employee
    public double CalculateBiWeeklyPayCheck(){
        this.CalculateWeeklyPayCheck();
        this.biWeeklyPayCheck = this.weeklyPayCheck*2;
        return this.biWeeklyPayCheck;
    }
}
