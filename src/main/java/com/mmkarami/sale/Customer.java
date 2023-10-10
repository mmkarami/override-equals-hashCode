package com.mmkarami.sale;

public class Customer {

	private String name;

	private int id;

	public Customer(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object other) {
		if (this == other)
			return true;
		if (!(other instanceof Customer customer)) {
			return false;
		}
		boolean idEquals = this.id == customer.id;
		boolean nameEquals = (this.name == null && customer.name == null)
				|| (this.name != null && this.name.equals(customer.name)
						|| (customer != null && customer.getName().equals(this.name)));
		return idEquals && nameEquals;
	}

	public final int hashCode() {
		int hashCode = 19;
		if (this.name != null)
			hashCode = 41 * hashCode + this.name.hashCode();
		hashCode = 61 * hashCode + id;
		return hashCode;
	}

}