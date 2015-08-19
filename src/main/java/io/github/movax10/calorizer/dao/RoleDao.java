package io.github.movax10.calorizer.dao;

import io.github.movax10.calorizer.entities.Role;
/**
 * @author radchenko.as
 * @version 1.0
 */
public interface RoleDao extends IEntityDao<Role> {
	
	Role getStudentRole();
}
