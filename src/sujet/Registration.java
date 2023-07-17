package sujet;

import java.time.LocalDate;
import java.util.Objects;

public class Registration {

	private String name;
	private String mobile;
	private String gender;
	private LocalDate dob;
	private String adress;

	public Registration() {
		super();
	}

	public Registration(String name, String mobile, String gender, LocalDate dob, String adress) {
		super();
		this.name = name;
		this.mobile = mobile;
		this.gender = gender;
		this.dob = dob;
		this.adress = adress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	@Override
	public int hashCode() {
		return Objects.hash(adress, dob, gender, mobile, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Registration other = (Registration) obj;
		return Objects.equals(adress, other.adress) && Objects.equals(dob, other.dob)
				&& Objects.equals(gender, other.gender) && Objects.equals(mobile, other.mobile)
				&& Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Registration [name=" + name + ", mobile=" + mobile + ", gender=" + gender + ", dob=" + dob + ", adress="
				+ adress + "]";
	}

}
