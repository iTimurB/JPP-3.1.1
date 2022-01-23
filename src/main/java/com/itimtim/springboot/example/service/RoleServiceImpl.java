package com.itimtim.springboot.example.service;

import com.itimtim.springboot.example.dao.RoleDao;
import com.itimtim.springboot.example.model.Role;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Set;

@Service
public class RoleServiceImpl implements RoleService {

    private final RoleDao roleDao;

    public RoleServiceImpl(RoleDao roleDao) {
        this.roleDao = roleDao;
    }

    @Override
    @Transactional
    public Set<Role> getRolesByIds(List<Long> ids) {
        return roleDao.getRolesByIds(ids);
    }
}
