public class Train extends Vehicle{
    private int wagonNumber;

    Train(int trainNumber, int wagonNumber) {
        super(trainNumber);
        setWagonNumber(wagonNumber);
    }

    private void setWagonNumber(int wagonNumber) {
        this.wagonNumber = wagonNumber;
    }

    private String getNumberOWagons() {
        return Integer.toString(wagonNumber);
    }

    @Override
    public String printInfo() {
        return ("The vehicle is a Train. \n" +
                "\tNumber: " +getVNumber() + "\n" +
                "\tNumber of wagons: " + getNumberOWagons());
    }
}
