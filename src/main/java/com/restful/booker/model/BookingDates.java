package com.restful.booker.model;

import java.util.HashMap;

public class BookingDates {
    public HashMap<String, Object> getBookingDates() {
        HashMap<String, Object> bookingDates = new HashMap<>();
        bookingDates.put("checkin","2024-04-01");
        bookingDates.put("checkout", "2024-04-05");
        return bookingDates;
    }
}

