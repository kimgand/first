package ch08;

public class RemoteControlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoteControl rc;
		rc= new Television();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(2);
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(3);
		rc=new SmartPhone();
		rc.turnOn();
		rc.turnOff();
		rc.setVolume(4);
		
		RemoteControl rc1 = new RemoteControl() {
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
		};
	}
}

			
		
		


