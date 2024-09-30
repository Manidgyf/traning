package com.multiplex.model;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {
//	private Long movieId;
//	private Long multiplexId;
	private Long ticketId; 
	private String movieName;
	private String multiplexName;
	private LocalDateTime timeStamp;
	private double totalAmount;
	private double discountedAmount;
	private Long screeningId;
	private String ticketstatus;
	private List<Integer> confirmedSeats;
	private List<String> seatTypes;

}
