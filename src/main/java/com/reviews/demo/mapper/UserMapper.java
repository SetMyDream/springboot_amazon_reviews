package com.reviews.demo.mapper;

import com.reviews.demo.dto.CommentDto;
import com.reviews.demo.model.User;
import com.reviews.demo.service.RoleService;
import java.util.Set;
import org.springframework.stereotype.Component;

@Component
public class UserMapper {
    private final RoleService roleService;

    public UserMapper(RoleService roleService) {
        this.roleService = roleService;
    }

    public User map(CommentDto commentDto) {
        User user = new User();
        user.setExternalId(commentDto.getUserId());
        user.setProfileName(commentDto.getProfileName());
        user.setPassword("1111");
        user.setRoles(Set.of(roleService.findByName("USER")));
        return user;
    }
}
