package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tbl_usuariocl2 database table.
 * 
 */
@Entity
@Table(name="tbl_usuariocl2")
@NamedQuery(name="TblUsuariocl2.findAll", query="SELECT t FROM TblUsuariocl2 t")
public class TblUsuariocl2 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int idusuariocl2;

	private String passwordcl2;

	private String usuariocl2;

	public TblUsuariocl2() {
	}

	public int getIdusuariocl2() {
		return this.idusuariocl2;
	}

	public void setIdusuariocl2(int idusuariocl2) {
		this.idusuariocl2 = idusuariocl2;
	}

	public String getPasswordcl2() {
		return this.passwordcl2;
	}

	public void setPasswordcl2(String passwordcl2) {
		this.passwordcl2 = passwordcl2;
	}

	public String getUsuariocl2() {
		return this.usuariocl2;
	}

	public void setUsuariocl2(String usuariocl2) {
		this.usuariocl2 = usuariocl2;
	}

}