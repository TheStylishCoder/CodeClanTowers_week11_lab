import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    Booking booking;
    Bedroom bedroom;
    Booking booking2;

    @Before
    public void before(){
        booking = new Booking(bedroom, 0);
        bedroom = new Bedroom(15, 3, "family", 200, false);
        booking2 = new Booking(bedroom, 2);
    }
    @Test
    public void canGetNumberOfNights(){
        assertEquals(0, booking.getNumberOfNights());
    }

    @Test
    public void canBookRoom(){
        booking.setNumberOfNights(2);
        assertEquals(2, booking.getNumberOfNights());
    }

    @Test
    public void canGetTotalBill(){
        assertEquals(400, booking2.getTotalBill(bedroom));
    }

}
