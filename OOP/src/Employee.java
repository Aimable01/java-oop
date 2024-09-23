public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public static int numberOfEmployees;

    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }

    public int calculateWage(int extraHours){
        return baseSalary + (getHourlyRate() * extraHours);
    }
    public int calculateWage(){
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary){
        if(baseSalary <= 0){
            throw new IllegalArgumentException("Salary cannot be zero or negative");
        }else{
            this.baseSalary = baseSalary;
        }
    }

    private int getBaseSalary(){
        return baseSalary;
    }

    private int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0){
            throw new IllegalArgumentException("Hourly rate cannot be zero or negative");
        }
        this.hourlyRate = hourlyRate;
    }
}
