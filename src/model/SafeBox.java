package model;

public class SafeBox {
	
	//Attributes
	private int passwordD1 = 0;
	private int passwordD2 = 0;
	private int passwordD3 = 0;
	private int passwordD4 = 0;
	private int passwordD5 = 0;
	private int passwordD6 = 0;
	private String content;
	
	//Constructor
	public SafeBox() {
		
	}

	public int getPasswordD1() {
		return passwordD1;
	}

	public void setPasswordD1(int passwordD1) {
		this.passwordD1 = passwordD1;
	}

	public int getPasswordD2() {
		return passwordD2;
	}

	public void setPasswordD2(int passwordD2) {
		this.passwordD2 = passwordD2;
	}

	public int getPasswordD3() {
		return passwordD3;
	}

	public void setPasswordD3(int passwordD3) {
		this.passwordD3 = passwordD3;
	}

	public int getPasswordD4() {
		return passwordD4;
	}

	public void setPasswordD4(int passwordD4) {
		this.passwordD4 = passwordD4;
	}

	public int getPasswordD5() {
		return passwordD5;
	}

	public void setPasswordD5(int passwordD5) {
		this.passwordD5 = passwordD5;
	}

	public int getPasswordD6() {
		return passwordD6;
	}

	public void setPasswordD6(int passwordD6) {
		this.passwordD6 = passwordD6;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	//ChangePassword
	public boolean checkPassword(int passwordD1, int passwordD2, int passwordD3, int passwordD4, int passwordD5, int passwordD6) {
		boolean check = false;
		if(
				(passwordD1 == getPasswordD1()) &&
				(passwordD2 == getPasswordD2()) &&
				(passwordD3 == getPasswordD3()) &&
				(passwordD4 == getPasswordD4()) &&
				(passwordD5 == getPasswordD5()) &&
				(passwordD6 == getPasswordD6())	
				) {
			check = true;
		}
		return check;	
	}
	
}


