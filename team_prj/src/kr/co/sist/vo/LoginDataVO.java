package kr.co.sist.vo;

public class LoginDataVO {
	private String name, email;
	
	public LoginDataVO() {
		// TODO Auto-generated constructor stub
	}
	
	
	

	public LoginDataVO(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}




	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
