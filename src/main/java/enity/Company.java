package enity;

import java.util.Date;

public class Company {
	private String companyId;
	private String companyName;
	private String address;
	private String director;
	private Date inaugurationDay;
	private String fieldOfActivity;
	private int totalEmployees;
	
	public Company() {
		super();
	}

	public Company(String companyId, String companyName, String address, String director, Date inaugurationDay,
			String fieldOfActivity, int totalEmployees) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.address = address;
		this.director = director;
		this.inaugurationDay = inaugurationDay;
		this.fieldOfActivity = fieldOfActivity;
		this.totalEmployees = totalEmployees;
	}

	public String getCompanyId() {
		return companyId;
	}

	public void setCompanyId(String companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public Date getInaugurationDay() {
		return inaugurationDay;
	}

	public void setInaugurationDay(Date inaugurationDay) {
		this.inaugurationDay = inaugurationDay;
	}

	public String getFieldOfActivity() {
		return fieldOfActivity;
	}

	public void setFieldOfActivity(String fieldOfActivity) {
		this.fieldOfActivity = fieldOfActivity;
	}

	public int getTotalEmployees() {
		return totalEmployees;
	}

	public void setTotalEmployees(int totalEmployees) {
		this.totalEmployees = totalEmployees;
	}
	
	
}
