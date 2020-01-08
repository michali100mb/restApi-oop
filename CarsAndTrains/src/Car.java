public class Car extends Vehicle {
    enum carTypes {SUZUKI, MAZDA, VOLVO, TOYOTA, CITROEN};
    private carTypes type;

    Car(int carNumber, carTypes cType){
       super(carNumber);
       setType(cType);
    }

    private void setType(carTypes cType) {
        this.type = cType;
    }

    private String getType() {
        return String.valueOf(type);
    }

    @Override
    public String printInfo() {
        return ("The vehicle is a CAR. \n" +
                "\tNumber: " + getVNumber() + "\n" +
                "\tType: " + getType());
    }
}
