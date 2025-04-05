package com.emprendimientos.udea_emprende.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.emprendimientos.udea_emprende.model.Role;
import com.emprendimientos.udea_emprende.model.User;
import com.emprendimientos.udea_emprende.model.UserType;
import com.emprendimientos.udea_emprende.service.RoleService;

import getMethodDTO.RoleGetDTO;
import postMethodDTO.RolePostDTO;

@RestController
@RequestMapping("/api/roles")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
public class RoleController {
    @Autowired
    private RoleService roleService;

    @GetMapping
    public List<RoleGetDTO> getAllRoles() {
        List<Role> roles = roleService.getAllRoles();
        List<RoleGetDTO> rolesDTO = new ArrayList<>();

        for (Role role : roles) {
            RoleGetDTO roleGetDTO = new RoleGetDTO();
            roleGetDTO.setRoleId(role.getRolesId());
            roleGetDTO.setCreatedAt(role.getCreatedAt());
            roleGetDTO.setUpdatedAt(role.getUpdatedAt());
            roleGetDTO.setUserTypeId(role.getUserType().getUserTypeId());
            roleGetDTO.setUserId(role.getUser().getUserId());

            rolesDTO.add(roleGetDTO);
        }
        return rolesDTO;

    }

    @PostMapping
    public RolePostDTO createNewRole(@RequestBody RolePostDTO rolePostDTO) {
        Role newRole = new Role();
        User user = new User();
        user.setUserId(rolePostDTO.getUserId());
        UserType userType = new UserType();
        userType.setUserTypeId(rolePostDTO.getUserTypeId());

        newRole.setUser(user);
        newRole.setUserType(userType);

        roleService.saveRole(newRole);
        return rolePostDTO;
    }

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping("/{id}")
    public RoleGetDTO getRoleById(@PathVariable Integer id) {
        Role role = roleService.getRoleById(id);

        RoleGetDTO roleGetDTO = new RoleGetDTO();
        roleGetDTO.setRoleId(role.getRolesId());
        roleGetDTO.setCreatedAt(role.getCreatedAt());
        roleGetDTO.setUpdatedAt(role.getUpdatedAt());
        roleGetDTO.setUserId(role.getUser().getUserId());
        roleGetDTO.setUserTypeId(role.getUserType().getUserTypeId());

        return roleGetDTO;

    }

    @DeleteMapping("/{id}")
    public void deleteRoleById(@PathVariable Integer id) {
        roleService.deleteRoleById(id);
    }

}
