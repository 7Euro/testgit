/**
 * 
 */
package ssh.test.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;

/**
 * @author Leo
 * @filename Dao.java
 */
@Repository
public class Dao extends HibernateDaoSupport{
	@Autowired
	public void setSessionFactoryOverride(SessionFactory  sessionFactory){
		super.setSessionFactory(sessionFactory); 
	}
}
