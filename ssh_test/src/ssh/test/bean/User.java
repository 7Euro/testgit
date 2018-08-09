/**
 * @author Leo
 * @version 1.0.0
 * @filename User.java
 * @time 2017年3月2日 下午7:49:51
 * @copyright(C) 2017 深圳市北辰德科技股份有限公司
 */
package ssh.test.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;




/**
 *<简述功能>
 *<功能详细描述>
 * @see
 * @since
 */
@Entity
@Table(name="user")
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Integer uid;
	
	private int nameNo;	//编号
	
	private String name;	//姓名
	
	private String address;	//地址
	
	private String sex;	//性别

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public int getNameNo() {
		return nameNo;
	}

	public void setNameNo(int nameNo) {
		this.nameNo = nameNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
