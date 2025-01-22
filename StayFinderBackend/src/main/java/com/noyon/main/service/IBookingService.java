package com.noyon.main.service;
import com.noyon.main.dto.Response;
import com.noyon.main.entity.Booking;
public interface IBookingService {

    Response saveBooking(Long rooId, Long userId, Booking bookingRequest);
    Response findBookingByConfirmationCode(String confirmationCode);
    Response getAllBookings();
    Response cancelBooking(Long bookingId);
}