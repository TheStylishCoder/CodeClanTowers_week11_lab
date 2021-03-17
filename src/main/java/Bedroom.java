import java.util.ArrayList;

public class Bedroom {

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> occupants;
    private String type;
    private int nightlyRate;
    private boolean occupied;

    public Bedroom(int roomNumber, int capacity, String type, int nightlyRate, boolean occupied){
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.type = type;
        this.nightlyRate = nightlyRate;
        this.occupied = occupied;
        this.occupants = new ArrayList<Guest>();
    }

    public int guestCount(){
        return this.occupants.size();
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void addGuest(Guest guest){
        this.occupants.add(guest);
        this.occupied = true;
    }

    public void removeGuest(){
        this.occupants.clear();
        this.occupied = false;
    }

    public int getNightlyRate() {
        return nightlyRate;
    }
}
