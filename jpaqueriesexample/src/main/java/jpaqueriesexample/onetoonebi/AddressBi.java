package jpaqueriesexample.onetoonebi;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="address_bi")
public class AddressBi implements Serializable {	
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="address_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int addressId;	
	private String street;	
	private String city;	
	private String state;	
	private String zipCode;
	@OneToOne(mappedBy = "addressBi") // Inverse side 
	private StudentBi studentBi;
	
	
	public StudentBi getStudentBi() {
		return studentBi;
	}
	public void setStudentBi(StudentBi studentBi) {
		this.studentBi = studentBi;
	}
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
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
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	
}
