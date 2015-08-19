package io.github.movax10.calorizer.dao.impl;

import org.hibernate.criterion.Restrictions;

import io.github.movax10.calorizer.dao.RoleDao;
import io.github.movax10.calorizer.entities.Role;

public class RoleDaoImpl extends AbstractEntityDao<Role> implements RoleDao {
	@Override
	protected Class<Role> getEntityClass() {
		return Role.class;
	}

	@Override
	public Role getStudentRole() {
		return (Role) getSession().createCriteria(getEntityClass()).add(Restrictions.eq("idRole", 4L)).uniqueResult();
	}
}
