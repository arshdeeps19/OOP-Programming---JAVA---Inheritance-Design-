public class Doctor extends HospitalEmployees 
{
protected String specialty;

//-----------------------------------------------------------------
// Sets up this doctor with the specified information. 
//-----------------------------------------------------------------

public Doctor (String empName, int empNumber, String special) 
{
super (empName, empNumber);
specialty = special; 
}

//----------------------------------------------------------------- 
// Sets this doctor's specialty.
//----------------------------------------------------------------- 

public void setSpecialty (String special)
{
specialty = special;
}
public String getSpecialty()
{
return specialty; }
//----------------------------------------------------------------- 
// Returns a description of this doctor as a string.
//----------------------------------------------------------------- 
public String toString()
{
return super.toString() + "\t" + specialty;
}
//----------------------------------------------------------------- 
// Prints a message appropriate for this doctor.
//----------------------------------------------------------------- 
public void diagnose()

{
System.out.println (name + " is a(n) " + specialty + " doctor.");
} 
}