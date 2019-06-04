package ch08;

public class SmartPhone implements RemoteControl{
private int volume;
	
	public void turnOn() {
		System.out.println("스마트폰을 켭니다");
	}
	
	public void turnOff() {
		System.out.println("스마트폰을 끕니다");
	}
	
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume=RemoteControl.MIN_VOLUME;
		}else {
			this.volume=volume;
		}
		System.out.println("현재 스마트폰 볼륨: " +this.volume);
	}


}
