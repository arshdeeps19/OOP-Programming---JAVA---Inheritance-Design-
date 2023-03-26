public class Janitor extends Administrator {
private static final java.lang.String String = null;
protected boolean sweeping;

//-----------------------------------------------------------------
// Sets up this janitor with the specified information.
//-----------------------------------------------------------------

public Janitor (String empName, int i, String dept, boolean sw)
{
super (String, dept);
sweeping = sw;
}


public void setIsSweeping (boolean isS)
{
sweeping = isS;
}
//----------------------------------------------------------------- 
// Returns the current sweeping status of this janitor.
//----------------------------------------------------------------- 

public boolean getIsSweeping ()
{
return sweeping;
}

//----------------------------------------------------------------- 
// Returns a description of this janitor as a string.
//----------------------------------------------------------------- 

public String toString ()
{
return super.toString() + "\tSweeping: " + sweeping;
}
//----------------------------------------------------------------- 
// Prints a message appropriate for this janitor. 
//----------------------------------------------------------------- 

public void sweep()
{
String name = null;
System.out.println (name + " is"); 
if (!sweeping)
System.out.print (" not"); 
System.out.println (" sweeping the floor.");
} }
