package net.talaatharb.designpatterns;

import java.time.ZonedDateTime;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {

	private UUID id;
	
	private String model;
	
	private String driveSystem;
	
	private String brand;
	
	private ZonedDateTime creationDate;
	
	public static CarBuilder builder() {
		return new CarBuilder();
	}
	
	
	public static class CarBuilder{
		private UUID id;
		
		private String model;
		
		private String driveSystem;
		
		private String brand;
		
		private ZonedDateTime creationDate;
		
		public CarBuilder id(UUID id) {
			this.id = id;
			return this;
		}
		
		public CarBuilder brand(String brand) {
			this.brand = brand;
			return this;
		}
		
		public Car build() {
			Car c = new Car(id, model, driveSystem, brand, creationDate);
			
			// Logic check for consistency of car object
			if(c.getId() == null) {
				throw new NullPointerException("Id can't be null");
			}
			
			return c;
		}
	}
}
