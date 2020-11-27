package com.reviews.demo.service;

import com.reviews.demo.model.Role;

public interface RoleService {
    Role save(Role role);
    Role findByName(String roleName);
}
