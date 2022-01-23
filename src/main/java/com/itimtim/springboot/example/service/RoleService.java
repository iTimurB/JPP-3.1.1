package com.itimtim.springboot.example.service;

import com.itimtim.springboot.example.model.Role;

import java.util.List;
import java.util.Set;

public interface RoleService {

    Set<Role> getRolesByIds (List<Long> ids);
}
