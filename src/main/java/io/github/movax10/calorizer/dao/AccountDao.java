package io.github.movax10.calorizer.dao;

import java.util.List;

import io.github.movax10.calorizer.entities.Account;

/**
 * @author radchenko.as
 * @version 1.0
 */
public interface AccountDao extends IEntityDao<Account> {
	
	List<Account> listAccounts(int offset, int count);

	Account findByLogin(String email);
}
