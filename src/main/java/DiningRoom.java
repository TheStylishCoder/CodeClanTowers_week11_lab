import java.util.ArrayList;

public class DiningRoom {

    private String name;
    private ArrayList<Guest> diningRoomGuests;

    public DiningRoom(String name){
        this.name = name;
        this.diningRoomGuests = new ArrayList<Guest>();
    }

    public String getName() {
        return name;
    }
}
