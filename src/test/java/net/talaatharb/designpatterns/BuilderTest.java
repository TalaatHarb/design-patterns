package net.talaatharb.designpatterns;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.UUID;

import org.junit.jupiter.api.Test;

class BuilderTest {

	@Test
	void testCreationOfCar() {
		Car car = Car.builder().id(UUID.randomUUID()).brand("BMW").build();
		assertEquals("BMW", car.getBrand());
		assertNotNull(car.getId());
	}

}
