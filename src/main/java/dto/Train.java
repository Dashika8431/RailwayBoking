package dto;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Train {
	@Id
	int number;
	String name;
	int seat;
	
	String[]station;
	
	String[]price;
	
	String[]time;
	
	String[]days;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	public String[] getStation() {
		return station;
	}

	public void setStation(String[] station) {
		this.station = station;
	}

	public String[] getPrice() {
		return price;
	}

	public void setPrice(String[] price) {
		this.price = price;
	}

	public String[] getTime() {
		return time;
	}

	public void setTime(String[] time) {
		this.time = time;
	}

	public String[] getDays() {
		return days;
	}

	public void setDays(String[] days) {
		this.days = days;
	}
	
	
	}
