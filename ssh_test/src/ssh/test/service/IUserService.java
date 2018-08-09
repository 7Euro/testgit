package ssh.test.service;

import java.util.List;

import ssh.test.bean.User;

/**
 * @author Leo
 * @filename IUserService.java
 * @time 20182018年8月8日下午11:13:35
 */
public interface IUserService {
	
	//增加一条数据
	public void save(User user) throws Exception;
	
	//查找数据库的记录
	public List<User> findUser() throws Exception;
	
	//删除一条信息
	public void delete(User user) throws Exception;
	
	//更新记录
	public void update(User user) throws Exception;
	
	//根据id查找用户
	 public User findUserById(Integer id) throws Exception;
	
}
