package cf;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Project implements Comparable<Project>,Serializable,Cloneable{
	private int pid;
	private String domain;
	private Date startdate;
	private Date enddate;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public Date getStartdate() {
		return startdate;
	}
	public void setStartdate(Date startdate) {
		this.startdate = startdate;
	}
	public Date getEnddate() {
		return enddate;
	}
	public void setEnddate(Date enddate) {
		this.enddate = enddate;
	}
	public Project(int pid, String domain, Date startdate, Date enddate) {
		super();
		this.pid = pid;
		this.domain = domain;
		this.startdate = startdate;
		this.enddate = enddate;
	}
	public Project() {
		super();
	}
	@Override
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
		return "Project [pid=" + pid + ", domain=" + domain + ", startdate=" + sdf.format(startdate) + ", enddate=" + sdf.format(enddate )+ "]";
	}
	@Override
	public int compareTo(Project o) {
		if(this.pid<o.pid)
		{
		return -1;	
		}
		else if(this.pid>o.pid)
		{
		return 1;	
		}
		else
		{
			return 0;
		}
		}

	
	
}
