package PhoneBookPhone;

public class Phone {
	
	private String tel;
	private String name;
	
	//생성자
	public Phone(String name , String tel) {
		this.name = name;
		this.tel = tel;
		
	}

	public String getTel() {
		return tel;
	}

	public String getName() {
		return name;
	}
	
	
}
