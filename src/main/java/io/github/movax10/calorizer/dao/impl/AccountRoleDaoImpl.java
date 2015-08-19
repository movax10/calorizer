package io.github.movax10.calorizer.dao.impl;

import io.github.movax10.calorizer.dao.AccountRoleDao;
import io.github.movax10.calorizer.entities.AccountRole;

import org.springframework.stereotype.Repository;
/**
 * @author radchenko.as
 * @version 1.0
 */
@Repository("accountRoleDao")
public class AccountRoleDaoImpl extends AbstractEntityDao<AccountRole>
		implements AccountRoleDao {
	@Override
	protected Class<AccountRole> getEntityClass() {
		return AccountRole.class;
	}
}
