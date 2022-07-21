package net.talaatharb.designpatterns;

import org.springframework.stereotype.Service;

public class NotificationServiceFactory {

	public NotificationService getNotificationService(String config) {
		if(config.equals("email")) {
			return new EmailNotification();
		}
		
		if(config.equals("sms")) {
			return new SMSNotification();
		}
		
		if(config.equals("push")) {
			return new PushNotification();
		}
		
		return null;
	}
}

class EmailNotification implements NotificationService{

	@Override
	public void notifyUser() {
		System.out.println("Email notification");	
	}
	
}

class SMSNotification implements NotificationService{

	@Override
	public void notifyUser() {
		System.out.println("SMS notification");	
	}
	
}

@Service
class PushNotification implements NotificationService{

	@Override
	public void notifyUser() {
		System.out.println("Push notification");	
	}
	
}
