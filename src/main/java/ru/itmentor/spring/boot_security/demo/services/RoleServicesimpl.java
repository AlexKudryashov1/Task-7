package ru.itmentor.spring.boot_security.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.itmentor.spring.boot_security.demo.model.Role;
import ru.itmentor.spring.boot_security.demo.repositories.RoleRepositories;

import java.util.List;
@Service
@Transactional(readOnly = true)
public class RoleServicesimpl implements RoleServices {
    private final RoleRepositories roleRepositories;


    @Autowired
    public RoleServicesimpl(RoleRepositories roleRepositories) {
        this.roleRepositories = roleRepositories;
    }

    @Override
    public List<Role> findAll() {
        return roleRepositories.findAll();
    }

    @Override
    public Role findByName(String name) {
        return roleRepositories.findByName(name);
    }
}
