package signin;

import java.util.Date;

public class DakaInfo {
private int ID;
private Date enterdate;
private Date exitdate;
public DakaInfo(int iD, Date enterdate, Date exitdate) {
	ID = iD;
	this.enterdate = enterdate;
	this.exitdate = exitdate;
}
public int getID() {
	return ID;
}
public void setID(int iD) {
	ID = iD;
}
public Date getEnterdate() {
	return enterdate;
}
public void setEnterdate(Date enterdate) {
	this.enterdate = enterdate;
}
public Date getExitdate() {
	return exitdate;
}
public void setExitdate(Date exitdate) {
	this.exitdate = exitdate;
}

public String toString() {
	return " ID=" + ID +", enterdate=" + enterdate + ", exitdate=" + exitdate + "]";
}


}
