package com.pfe.gesauto.service;
import com.pfe.gesauto.model.Role;
import com.pfe.gesauto.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public Role addRole(Role role) {
        return roleRepository.save(role);
    }
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }
    public Optional<Role> getRoleById(long id) { return roleRepository.findById(id);}
    public void deleteRoleById(long id) {
        roleRepository.deleteById(id);
    }
}
