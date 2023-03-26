
public class HospitalEmployees
{
protected String name;
protected int number; 
//-----------------------------------------------------------------
// Sets up this hospital employee with the specified information.
//-----------------------------------------------------------------

public HospitalEmployees (String empName, int empNumber)
{
name = empName;
number = empNumber; }

//----------------------------------------------------------------- 
// Sets the name for this employee.
//----------------------------------------------------------------- 
public void setName (String empName)
{
name = empName;
} 
//----------------------------------------------------------------- 
// Sets the employee number for this employee. 
//----------------------------------------------------------------- 

public void setNumber (int empNumber)
{
number = empNumber; 
}
//----------------------------------------------------------------- 
// Returns this employee's name.
//----------------------------------------------------------------- 
public String getName()
{
return name;
} 
//----------------------------------------------------------------- 
// Returns this employee's number.
//----------------------------------------------------------------- 
public int getNumber()
{
return number;
}
}