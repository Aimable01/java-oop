public class Bicycle {
    private int cadence;
    private int gear;
    private int speed;

    public Bicycle(int startCadence, int startGear, int startSpeed) {
        gear = startGear;
        cadence = startCadence;
        speed = startSpeed;
    }
    public int getCadence() {
        return cadence;
    }
    public void setCadence(int cadence) {
        cadence = cadence;
    }
    public int getGear() {
        return gear;
    }
    public void setGear(int gear) {
        gear = gear;
    }
    public int getSpeed() {
        return speed;
    }
    public void applyBrake(int decrement){
        speed -= decrement;
    }
    public void speedUp(int increment){
        speed += increment;
    }

    // method to compute the loan payment
    public double computePayment(double loanAmt, double rate, double futureValue, int numPeriods){
        double interest = rate / 100.0;
        double partial1 = Math.pow((1 + interest), -numPeriods);
        double denominator = (1 - partial1)/interest;
        double answer = (-loanAmt / denominator) - ((futureValue * partial1) / denominator);
        return answer;
    }
}
