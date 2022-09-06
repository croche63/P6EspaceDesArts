package com.inti.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.inti.dao.RoleDAO;
import com.inti.entities.Role;
import com.inti.service.interfaces.IRoleService;

@Service
public class RoleService implements IRoleService {
	@Autowired
	RoleDAO RoleDAO;

	@Override
	public List<Role> findAll() {
		return RoleDAO.findAll();
	}

	@Override
	public Role save(Role Role) {
		return RoleDAO.save(Role);
	}

	@Override
	public void delete(Long id) {
		RoleDAO.deleteById(id);

	}

}
