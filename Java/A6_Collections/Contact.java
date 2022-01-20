package collections;

import java.util.EnumSet;

public class Contact {

	long phoneno;
	String name, email;

	public enum gender {
		Fe, m
	}

	gender g;

	public Contact(long phoneno, String name, String email, gender g) {
		super();
		this.phoneno = phoneno;
		this.name = name;
		this.email = email;
		this.g = g;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
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

	public gender getG() {
		return g;
	}

	public void setG(gender g) {
		this.g = g;
	}
}
