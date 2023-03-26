public class Nurse extends HospitalEmployees {
protected int numPatients;
public Nurse (String empName, int empNumber, int numPat) {
super (empName, empNumber);
numPatients = numPat; }
//----------------------------------------------------------------- 
// Sets the number of patients for this nurse.
//----------------------------------------------------------------- 

public void setNumPatients (int pat)
{
numPatients = pat;
}
//----------------------------------------------------------------- 
// Returns this nurse's current number of patients.
//----------------------------------------------------------------- 

public int getNumPatients()
{
return numPatients;
}
//----------------------------------------------------------------- 
// Returns a description of this nurse as a string.
//----------------------------------------------------------------- 

public String toString()
{
return super.toString() + " has " + numPatients + " patients.";
}
//----------------------------------------------------------------- 
// Prints a message appropriate for this nurse. 
//----------------------------------------------------------------- 

public void assist()
{
System.out.println (name + " is a nurse with " +
numPatients + " patients.");
}
}