package kr.co.mlec.BoardVO;

public class LoginVO {
	private String name;
	private String id;
	private String email;
	private String password;
	private String regDate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "LoginVO [name=" + name + ", id=" + id + ", email=" + email
				+ ", password=" + password + ", regDate=" + regDate + "]";
	}
}
