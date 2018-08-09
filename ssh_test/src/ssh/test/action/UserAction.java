package ssh.test.action;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import ssh.test.bean.User;
import ssh.test.service.IUserService;

import com.opensymphony.xwork2.ActionSupport;

/**yonghu
 * @author Leo
 * @filename UserAction.java
 * @time 20182018��4��1������10:45:17
 */
@Scope("prototype")
@Controller("userAction")
public class UserAction extends ActionSupport{
	private static final long serialVersionUID = 1L;
	private User user;
	private List<User> list;
	@Autowired
	private IUserService userService;
	
	/***
	 * 添加信息
	 * @return
	 */
	public String add(){
		try {
			userService.save(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SUCCESS;
	}
	/**
	 * 查询所有的用户信息
	 * @return
	 */
	public String display(){
		try {
			list = userService.findUser();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SUCCESS;
	}
	/**
	 * 删除一条信息
	 * @return
	 */
	public String deleteUser(){
		try {
			userService.delete(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SUCCESS;
	}
	/**
	 * 查找用户
	 * @return
	 */
	public String findUser(){
		try {
			user = userService.findUserById(user.getUid());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SUCCESS;
	}
	/**
	 * 修改用户
	 * @return
	 */
	public String updateUser(){
		try {
			userService.update(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return SUCCESS;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public List<User> getList() {
		return list;
	}
	public void setList(List<User> list) {
		this.list = list;
	}
}
