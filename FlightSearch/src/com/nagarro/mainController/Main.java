package com.nagarro.mainController;

import java.io.*;
import com.nagarro.input.*;
import java.util.*;
import com.nagarro.model.*;

public class Main {

	public static void main(String[] args) throws IOException {

		// boolean running = true;
		final List<Flight> results = new ArrayList<>();
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		DirectoryReader.readDir("data");
		UserInput ui = InputAcceptor.enterData();
		System.out.println(ui);

		// search the flights and show
		Watcher.watcher();
		try
		{
		results.clear();
			for (HashSet<Flight> flight_data : DirectoryReader.flightInfo.values()) {
				for (Flight data : flight_data) {
					if (data.getDepLoc().equalsIgnoreCase(ui.getDepLoc())
							& data.getArrLoc().equalsIgnoreCase(ui.getArrLoc())
							& data.getFlightClass().contains(ui.getFlightClass())
							& data.getValidTill().after(ui.getValidTill()))
						results.add(data);
				}
			}
			if (ui.getOutputPrefer() == 1) {
				Collections.sort(results, new FlightPriceComparator());
			} else {
				Collections.sort(results, new FlightDurationComparator());
			}
//		System.out.println("Do you want to exit for show the results (say e for exit)");
//		if('e' == br.readLine().charAt(0)) 
//			break;
//		}
		}
		finally {
			System.out.println(
					"FLIGHT_NO | DEP_LOC | ARR_LOC | VALID_TILL | FLIGHT_TIME | FLIGHT_DUR | FARE | SEAT_AVAILABILITY | CLASS\r");
			for (Flight f : results) {
				System.out.println(f);
			}
		}
	}
}
