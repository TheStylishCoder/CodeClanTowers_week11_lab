import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(10, 2, "double", 100, true);
        guest = new Guest("Scott");
    }

    @Test
    public void canGetGuestCount(){
        assertEquals(0, bedroom.guestCount());
    }

    @Test
    public void canAddGuest(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.guestCount());
        assertEquals(true, bedroom.isOccupied());
    }

    @Test
    public void canRemoveGuest(){
        bedroom.addGuest(guest);
        bedroom.removeGuest();
        assertEquals(0, bedroom.guestCount());
        assertEquals(false, bedroom.isOccupied());
    }
}
