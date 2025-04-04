package com.emprendimientos.udea_emprende.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emprendimientos.udea_emprende.model.Role;
import com.emprendimientos.udea_emprende.service.RoleService;

import postMethodDTO.RolePostDTO;

@RestController
@RequestMapping("/api/roles")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class RoleController {
    @Autowired
    private RoleService roleService;

    @GetMapping
    public List<Role> getAllRoles() {
        return roleService.getAllRoles();
    }

    @PostMapping
    public RolePostDTO createNewRole(@RequestBody Role role) {
        RolePostDTO rolePostDTO = new RolePostDTO();
        rolePostDTO.setUserId(role.getUser().getUserId());
        rolePostDTO.setUserTypeId(role.getUserType().getUserTypeId());
        roleService.saveRole(role);
        return rolePostDTO;
    }

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping("/{id}")
    public Role getRoleById(@PathVariable Integer id) {
        return roleService.getRoleById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteRoleById(@PathVariable Integer id) {
        roleService.deleteRoleById(id);
    }

}
