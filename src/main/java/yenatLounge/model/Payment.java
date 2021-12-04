package yenatLounge.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "payment")
public class Payment {

	@Id
	@Column(name = "pay_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long pay_id;

	@Column(name = "fname")
	private String fname;

	@Column(name = "lname")
	private String lname;

	@Column(name = "address")
	private String address;

	@Column(name = "cc")
	private long cc;

	public Payment() {

	}

	public Payment(Long pay_id, String fname, String lname, String address, long cc) {
		this.pay_id = pay_id;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.cc = cc;
	}

	public Long getPay_id() {
		return pay_id;
	}

	public void setPay_id(Long pay_id) {
		this.pay_id = pay_id;
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

	public long getCc() {
		return cc;
	}

	public void setCc(long cc) {
		this.cc = cc;
	}

	@Override
	public String toString() {
		return "Payment [pay_id=" + pay_id + ", fname=" + fname + ", lname=" + lname + ", address=" + address + ", cc="
				+ cc + "]";
	}

}