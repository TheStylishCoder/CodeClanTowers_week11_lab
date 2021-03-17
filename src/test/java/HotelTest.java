import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    Hotel hotel;
    Bedroom bedroom;
    ConferenceRoom conferenceRoom;
    Guest hotelGuest;
    Booking booking;
    DiningRoom diningRoom;
    DiningRoom diningRoom2;

    @Before
    public void before(){
        hotel = new Hotel();
        bedroom = new Bedroom(10, 2, "double", 100, false);
        conferenceRoom = new ConferenceRoom(20, "Conference Room A");
        hotelGuest = new Guest("Scott");
        booking = new Booking(bedroom, 2);
        diningRoom = new DiningRoom("Breakfast Room");
        diningRoom = new DiningRoom("Evening Room");
    }

    @Test
    public void canCheckInGuestToBedroom(){
        bedroom.addGuest(hotelGuest);
        assertEquals(1, bedroom.guestCount());
        assertEquals(true, bedroom.isOccupied());
    }

    @Test
    public void canCheckOutGuestsFromBedroom(){
        bedroom.addGuest(hotelGuest);
        bedroom.removeGuest();
        assertEquals(0, bedroom.guestCount());
        assertEquals(false, bedroom.isOccupied());
    }

    @Test
    public void canAddGuestToConferenceRoom(){
        conferenceRoom.addGuest(hotelGuest);
        assertEquals(1, conferenceRoom.guestCount());
    }

    @Test
    public void canRemoveGuestsFromConferenceRoom(){
        conferenceRoom.addGuest(hotelGuest);
        conferenceRoom.removeGuest();
        assertEquals(0, conferenceRoom.guestCount());
    }

    @Test
    public void canBookRoom(){

    }
}
