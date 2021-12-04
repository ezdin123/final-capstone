package yenatLounge.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "admin_login")
public class AdminLogin {

	@Id
	@Column(name = "aname")
	@GeneratedValue
	private String aname;

	@Column(name = "apass")
	private String apass;

	public AdminLogin() {

	}

	public AdminLogin(String aname, String apass) {
		this.aname = aname;
		this.apass = apass;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getApass() {
		return apass;
	}

	public void setApass(String apass) {
		this.apass = apass;
	}

	@Override
	public String toString() {
		return "AdminLogin [aname=" + aname + ", apass=" + apass + "]";
	}

}