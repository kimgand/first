package ye;

public class SingletonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("���� Singleton ��ü �Դϴ�.");
			
		}else {
			System.out.println("�ٸ� Singleton ��ü �Դϴ�.");
		}
	}

}