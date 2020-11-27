package com.reviews.demo.service.impl;

import com.reviews.demo.model.Role;
import com.reviews.demo.repository.RoleRepository;
import com.reviews.demo.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;

    public RoleServiceImpl(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    @Override
    public Role save(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public Role findByName(String roleName) {
        return roleRepository.findByRoleName(Role.of(roleName).getRoleName());
    }
}
