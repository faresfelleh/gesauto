package com.pfe.gesauto.controller;

import com.pfe.gesauto.model.Role;
import com.pfe.gesauto.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("Api/Role")
public class RoleController {
    @Autowired
    private RoleService roleService;

    @PostMapping
    public Role saveRole(@RequestBody Role role) {return  roleService.addRole(role);}
    @GetMapping
    public List<Role> ListRoles() {return roleService.getAllRoles();}
    @GetMapping("/{id}")
    public Optional<Role> GetRoleById(@PathVariable int id) {return roleService.getRoleById(id);}
    //@DeleteMapping("/{id}")
    //public String deleteRole
}
