package com.demos.service;

import java.math.BigInteger;

import com.demos.entities.ScheduledFlight;
import com.demos.exceptions.*;

public interface ScheduledFlightService {

	public ScheduledFlight addScheduledFlight(ScheduledFlight scheduledFlight);

	public ScheduledFlight modifyScheduledFlight(ScheduledFlight scheduledFlight);

	public String removeScheduledFlight(BigInteger id) throws RecordNotFoundException;

	public Iterable<ScheduledFlight> viewAllScheduledFlights();

	public ScheduledFlight viewScheduledFlight(BigInteger id) throws ScheduledFlightNotFoundException;
}
