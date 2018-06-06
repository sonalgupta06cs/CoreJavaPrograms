package com.java.collection;

public class StudentOverrideEqualsAndHashCode {
	
	private String registrationNumber;

	public StudentOverrideEqualsAndHashCode(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	
	
	
	public boolean equals(Object o) {
		if(o instanceof StudentOverrideEqualsAndHashCode && o != null) {
			String regNumber = ((StudentOverrideEqualsAndHashCode)o).getRegistrationNumber();
			//System.out.println("this.getRegistrationNumber() "+this.getRegistrationNumber());
			if(regNumber != null && regNumber.equals(this.getRegistrationNumber()))
			{
			   //System.out.println("this.registrationNumber "+this.registrationNumber);
			   return true;
			}
		}
		return false;
	}
	
	// it returns some unique number for each instance
	public int hashCode()
	{
		// since each n every registration number is gonna be different
		return this.registrationNumber.hashCode(); 
		// Now Map will allow only 1 instance of the class
		// We need this hashCode() because the collection uses a very specific strategy to reach out to 
		// objects asap to fetch them.
	}

}

// That's how equal & hashcode helps collection to avoid allowing duplicates coming into the data structures.
