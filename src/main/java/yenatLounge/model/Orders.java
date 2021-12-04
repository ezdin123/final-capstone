package yenatLounge.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "orders")
@Table(name = "orders")

public class Orders {

	@Id
	@Column(name = "o_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long o_id;

	@Column(name = "p_id")
	private Long p_id;

	public Orders() {

	}

	public Orders(Long o_id, Long p_id, Long u_id) {

		this.o_id = o_id;
		this.p_id = p_id;

	}

	public Long getO_id() {
		return o_id;
	}

	public void setO_id(Long o_id) {
		this.o_id = o_id;
	}

	public Long getP_id() {
		return p_id;
	}

	public void setP_id(Long p_id) {
		this.p_id = p_id;
	}

	@Override
	public String toString() {
		return "Orders [o_id=" + o_id + ", p_id=" + p_id + "]";
	}

}