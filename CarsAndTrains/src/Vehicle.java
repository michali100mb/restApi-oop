import javax.swing.JOptionPane;
public abstract class Vehicle {
    private int vNumber;
    public Vehicle(int vehicleNumber) {
        setVNumber(vehicleNumber);
    }

    abstract String printInfo();

    private void setVNumber(int vehicleNumber) {
        this.vNumber = vehicleNumber;
    }

    public int getVNumber() {
        return vNumber;
    }

}
