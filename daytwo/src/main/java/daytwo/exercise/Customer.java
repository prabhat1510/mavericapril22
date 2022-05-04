package daytwo.exercise;

public class Customer {
	
	private Long id;
	private String name;
	private Integer tier;
	
	/**
	 * No-arg constructor  or default constructor
	 */
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	//Parameterized constructor
	public Customer(Long id, String name, Integer tier) {
		this.id = id;
		this.name = name;
		this.tier = tier;
	}

	/*
	 * Getter and Setter methods 
	 */
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getTier() {
		return tier;
	}

	public void setTier(Integer tier) {
		this.tier = tier;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", tier=" + tier + "]";
	}
	
	
}
