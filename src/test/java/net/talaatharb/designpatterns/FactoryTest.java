package net.talaatharb.designpatterns;

import org.junit.jupiter.api.Test;

class FactoryTest {

	@Test
	void factoryCreationTest() {
		NotificationServiceFactory factory = new NotificationServiceFactory();
		NotificationService service = factory.getNotificationService("email");
		service.notifyUser();
		System.out.println(service.getClass());
	}
}
