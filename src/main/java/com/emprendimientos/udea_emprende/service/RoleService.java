package com.emprendimientos.udea_emprende.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.emprendimientos.udea_emprende.repository.RoleRepository;
import com.emprendimientos.udea_emprende.model.Role;

@Service
public class RoleService {
    private final RoleRepository rolesRepository;

    public RoleService(RoleRepository rolesRepository) {
        this.rolesRepository = rolesRepository;
    }

    public List<Role> getAllRoles() {
        return rolesRepository.findAll();
    }

    public Role getRoleById(Integer rolesId) {
        return rolesRepository.findById(rolesId).orElse(null);
    }

    public Role saveRole(Role roles) {
        return rolesRepository.save(roles);
    }

    public void deleteRoleById(Integer rolesId) {
        rolesRepository.deleteById(rolesId);
    }

}
