package signin;

public class Employee {
private String name;
private int ID;


public Employee(int iD, String name) {
	super();
	this.name = name;
	ID = iD;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}

public String toString() {
	return "Employee [name=" + name + ", ID=" + ID + "]";
}

}
