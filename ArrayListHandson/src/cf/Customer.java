package cf;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Customer implements Serializable,Cloneable,Comparable<Customer> {
	private static final long serialVersionUID = 1L;
	int custId;
	String custname;
	String email;
	String mobile;
	Date dob;
	Address address;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	@Override
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd-mm-yyyy");
		return "Customer [custId=" + custId + ", custname=" + custname + ", email=" + email + ", mobile=" + mobile
				+ ", dob=" + sdf.format(dob) + ", address=" + address + "]";
	}
	

}
