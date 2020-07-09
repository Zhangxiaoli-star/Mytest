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
	System.out.println("新增员工为："+e.toString());
}
public void removeMember(Employee e) {
	staff.remove(e.getID());
	System.out.println("删除员工："+e.toString());
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
			System.out.println("无此ID员工");
			b=false;
		}
	}
return b;	
}
public void showstaff() {
	System.out.println(staff.toString());
}
}
