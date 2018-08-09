package ssh.test.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ssh.test.bean.User;
import ssh.test.dao.Dao;
import ssh.test.service.IUserService;

/**
 * @author Leo
 * @filename UserServiceImpl.java
 * @time 20182018年8月8日下午11:12:37
 */
@Service	//服务层注解
public class UserServiceImpl implements IUserService {
	@Autowired
	private Dao  userdao;
	@Override
	public void save(User user) throws Exception {
		userdao.getHibernateTemplate().save(user);
		
	}
	@Override
	public List<User> findUser() throws Exception {
		List<User> list = userdao.getHibernateTemplate().find("from User");
		return list;
	}
	@Override
	public void delete(User user) throws Exception {
		userdao.getHibernateTemplate().delete(user);
		
	}
	@Override
	public void update(User user) throws Exception {
		userdao.getHibernateTemplate().update(user);
		
	}
	@Override
	public User findUserById(Integer id) throws Exception {
		User user = null;
		user = userdao.getHibernateTemplate().get(User.class, id);
		return user;
	}

}
