package ch08;

public class SmartPhone implements RemoteControl{
private int volume;
	
	public void turnOn() {
		System.out.println("����Ʈ���� �մϴ�");
	}
	
	public void turnOff() {
		System.out.println("����Ʈ���� ���ϴ�");
	}
	
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume=RemoteControl.MIN_VOLUME;
		}else {
			this.volume=volume;
		}
		System.out.println("���� ����Ʈ�� ����: " +this.volume);
	}


}
