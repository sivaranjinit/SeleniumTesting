package weak1.day1;

import org.bouncycastle.jcajce.provider.asymmetric.rsa.ISOSignatureSpi;

public class Mobile {
	public void makeCall() {
		System.out.println("To make call");
	}
	private void sendMsg() {
		System.out.println("To send messages");

	}
	public static void main(String[] args) {
		Mobile myMobile = new Mobile();
		myMobile.makeCall();
		myMobile.sendMsg();
	}
	

}
