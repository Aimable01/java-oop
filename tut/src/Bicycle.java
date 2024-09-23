public class Bicycle {
    private int cadence;
    private int gear;
    private int speed;

    public Bicycle(int cadence, int gear, int speed) {

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
}
