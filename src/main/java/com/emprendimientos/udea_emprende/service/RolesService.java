package com.emprendimientos.udea_emprende.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.emprendimientos.udea_emprende.repository.RolesRepository;
import com.emprendimientos.udea_emprende.model.Roles;

@Service
public class RolesService {
    private final RolesRepository rolesRepository;

    public RolesService(RolesRepository rolesRepository) {
        this.rolesRepository = rolesRepository;
    }

    public List<Roles> getAllRoles() {
        return rolesRepository.findAll();
    }

    public Roles getRolesById(Integer rolesId) {
        return rolesRepository.findById(rolesId).orElse(null);
    }

    public Roles saveRoles(Roles roles) {
        return rolesRepository.save(roles);
    }

    public void deleteRoles(Integer rolesId) {
        rolesRepository.deleteById(rolesId);
    }
}
