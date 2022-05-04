package crmjdbcapp.model;

public class Customer {
	private Integer custId;
	private String custName;
	private String email;
	private Long mobile;
	private Address address;

	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public Customer(Integer custId, String custName, String email, Long mobile, Address address) {
		this.custId = custId;
		this.custName = custName;
		this.email = email;
		this.mobile = mobile;
		this.address = address;
	}

	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", email=" + email + ", mobile=" + mobile
				+ ", address=" + address + "]";
	}

}
