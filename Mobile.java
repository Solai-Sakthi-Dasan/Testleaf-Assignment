package week1.day1.assignment2;

public class Mobile {

	public static void main(String[] args) {
		
		Mobile mobile = new Mobile();
		mobile.switchOn();
		mobile.makeCall();
		mobile.recordCall();
		mobile.cutcall();
		mobile.takeSnap();
		mobile.deleteSnap();
		mobile.setPassword();
		mobile.setAlarm();
		mobile.setTimer();
		mobile.downloadApplications();
		mobile.openApplication();
		mobile.closeApplication();
		mobile.lockMobile();
		mobile.unlockMobile();
		mobile.switchOff();
		
	}
	
	public void switchOn() {
		System.out.println("Mobile switched ON...");
	}
	
	public void makeCall() {
		System.out.println("Calling the number...");
	}
	
	public void recordCall() {
		System.out.println("Record the call");
	}
	
	public void cutcall() {
		System.out.println("Call is cut...");
	}
	
	public void takeSnap() {
		System.out.println("Picture is captured");
	}
	
	public void deleteSnap() {
		System.out.println("Picture is deleted...");
	}
	
	public void setPassword() {
		System.out.println("Password is set successfully...");
	}
	
	public void setAlarm() {
		System.out.println("Alarm is set...");
	}
	
	public void setTimer() {
		System.out.println("Timer is running...");
	}
	
	public void downloadApplications() {
		System.out.println("Application is downloaded successfully...");
	}
	
	public void openApplication() {
		System.out.println("Application is opened...");
	}
	
	public void closeApplication() {
		System.out.println("Application is closed...");
	}
	
	public void lockMobile() {
		System.out.println("Mobile is locked...");
	}
	
	public void unlockMobile() {
		System.out.println("Mobile is unlocked...");
	}
	
	public void switchOff() {
		System.out.println("Mobile is switched off...");
	}

}
