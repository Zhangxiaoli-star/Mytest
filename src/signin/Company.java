package signin;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Company {
Map <Integer,String>staff=new HashMap<Integer,String>();
Map <Integer,DakaInfo>sign=new HashMap<Integer,DakaInfo>();
public void addMember(Employee e) {
	staff.put(e.getID(),e.getName());
	System.out.println("����Ա��Ϊ��"+e.toString());
}
public void removeMember(Employee e) {
	staff.remove(e.getID());
	System.out.println("ɾ��Ա����"+e.toString());
}
public boolean searchMember(int id) {
	boolean b=false;
	Set s=new HashSet(staff.keySet());
	Iterator it=s.iterator();
	while(it.hasNext()) {
		if(it.next().equals(id)) {			
			b=true;
			break;
		}else if(it.hasNext()==false) {
			System.out.println("�޴�IDԱ��");
			b=false;
		}
	}
return b;	
}
public void showstaff() {
	System.out.println(staff.toString());
}
}
