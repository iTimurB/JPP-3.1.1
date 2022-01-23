package com.itimtim.springboot.example.dao;

import com.itimtim.springboot.example.model.Role;

import java.util.List;
import java.util.Set;

public interface RoleDao {
    Set<Role> getRolesByIds (List<Long> ids);
}
