package sayHi;

public class PersonAge
{
	String firstName;
	String lastName;
	int age;
	/**
	 * @param firstName - First Name
	 * @param lastName - Last Name
	 * @param age - age of person in years
	 */
	public PersonAge(String firstName, String lastName, int age)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	/**
	 * @return the fname
	 */
	public String getFname()
	{
		return firstName;
	}
	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname)
	{
		this.firstName = fname;
	}
	/**
	 * @return the lname
	 */
	public String getLname()
	{
		return lastName;
	}
	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname)
	{
		this.lastName = lname;
	}
	/**
	 * @return the age
	 */
	public int getAge()
	{
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age)
	{
		this.age = age;
	}
	@Override
	public String toString()
	{
		return "Person: "+ firstName+ " "+ lastName+ ", "+ age ;
	}
	public PersonAge makePerson(PersonAge that) throws UnderAgeException
	{
		if (age<18 || that.age <18)
		{
			throw new UnderAgeException();
		}
		PersonAge child = new PersonAge(this.firstName,that.lastName,0);
		return child;
	}
	public static void main(String[] args)
	{
		PersonAge r = new PersonAge("Romeo", "Mon", 15);
		System.out.println("R "+r);	
		
				
	}
}
