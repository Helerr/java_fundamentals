package labs_examples.objects_classes_methods.labs.objects.airplanepkg;

public class PassengerArea {
    private String seatType;
    private int amountOfSeats;

    public PassengerArea(String seatType, int amountOfSeats) {
        this.seatType = seatType;
        this.amountOfSeats = amountOfSeats;
    }

    @Override
    public String toString() {
        return "PassengerArea{" +
                "seatType='" + seatType + '\'' +
                ", amountOfSeats=" + amountOfSeats +
                '}';
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public int getAmountOfSeats() {
        return amountOfSeats;
    }

    public void setAmountOfSeats(int amountOfSeats) {
        this.amountOfSeats = amountOfSeats;
    }
}
