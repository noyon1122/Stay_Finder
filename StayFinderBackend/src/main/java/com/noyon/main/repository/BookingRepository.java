package com.noyon.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.noyon.main.entity.Booking;

import java.util.Optional;

public interface BookingRepository extends JpaRepository<Booking, Long> {

    Optional<Booking> findByBookingConfirmationCode(String confirmationCode);
}