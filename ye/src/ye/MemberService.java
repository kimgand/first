package ye;

public class MemberService {
	boolean login(String id,String password) {
		//member.id.equals(id) && member.password.equals(password)
		if (id=="hong") {
			if(password=="12345") {
			return true;
			}
		}
		return false;
	}

	void logout(String id) {
		System.out.println("�α׾ƿ� �Ǿ����ϴ�.");
	}
}
