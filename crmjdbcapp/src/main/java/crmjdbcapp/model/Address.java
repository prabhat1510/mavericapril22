package crmjdbcapp.model;

public class Address {
	private Integer addressId;
	private Integer floorNo;
	private String area;
	private Long pinCode;
	private String city;
	private String state;
	private String country;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(Integer addressId, Integer floorNo, String area, Long pinCode, String city, String state,
			String country) {
		this.addressId = addressId;
		this.floorNo = floorNo;
		this.area = area;
		this.pinCode = pinCode;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public Integer getAddressId() {
		return addressId;
	}

	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}

	public Integer getFloorNo() {
		return floorNo;
	}

	public void setFloorNo(Integer floorNo) {
		this.floorNo = floorNo;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public Long getPinCode() {
		return pinCode;
	}

	public void setPinCode(Long pinCode) {
		this.pinCode = pinCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", floorNo=" + floorNo + ", area=" + area + ", pinCode=" + pinCode
				+ ", city=" + city + ", state=" + state + ", country=" + country + "]";
	}

}
