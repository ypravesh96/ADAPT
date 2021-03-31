package beans;

import org.springframework.beans.factory.annotation.Required;

public class Student {
	private String name;
	private int rollNo;
	
	@Required
	public void setName(String name)
	{
		this.name=name;
	}

	public String getName() {
		// TODO Auto-generated method stub
		return this.name;
	}
	
	@Required
	public void setRollNo(int rollNo)
	{
		this.rollNo=rollNo;
	}
	
	public int getRollNo() {
		// TODO Auto-generated method stub
		return this.rollNo;
	}
	
	@Override
    public String toString() {
        return "[name=" + this.getName() + ", Roll No=" + this.getRollNo() + "]";
    }
}
