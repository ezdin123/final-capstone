package yenatLounge.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "user")
@Entity(name = "User")
public class User {

	@Id
	@Column(name = "u_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long u_id;

	@Column(name = "fname")
	private String fname;

	@Column(name = "lname")
	private String lname;

	@Column(name = "address")
	private String address;

	@Column(name = "phone")
	private String phone;

	@Column(name = "uname")
	private String uname;

	@Column(name = "upass")
	private String upass;

	public User() {

	}

	public User(Long u_id, String fname, String lname, String address, String phone, String uname, String upass) {
		super();
		this.u_id = u_id;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.phone = phone;
		this.uname = uname;
		this.upass = upass;
	}

	public Long getU_id() {
		return u_id;
	}

	public void setU_id(Long u_id) {
		this.u_id = u_id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpass() {
		return upass;
	}

	public void setUpass(String upass) {
		this.upass = upass;
	}

	@Override
	public String toString() {
		return "User [u_id=" + u_id + ", fname=" + fname + ", lname=" + lname + ", address=" + address + ", phone="
				+ phone + ", uname=" + uname + ", upass=" + upass + "]";
	}

}
