package io.github.movax10.calorizer.dao.impl;

import java.util.List;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;
import io.github.movax10.calorizer.dao.AccountDao;
import io.github.movax10.calorizer.entities.Account;


/**
 * @author radchenko.as
 * @version 1.0
 */
@Repository("accountDao")
@SuppressWarnings("unchecked")
public class AccountDaoImpl extends AbstractEntityDao<Account> implements AccountDao {

	@Override
	public List<Account> listAccounts(final int offset, final int count) {
		return getSession().createCriteria(getEntityClass()).setFirstResult(offset).setMaxResults(count).list();
	}

	@Override
	protected Class<Account> getEntityClass() {
		return Account.class;
	}
	
	@Override
	public Account findByLogin(final String login) {
		return (Account) getSession().createCriteria(getEntityClass()).add(Restrictions.eq("login", login)).uniqueResult();
	}

	

}