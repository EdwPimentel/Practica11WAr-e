package com.web.practica11.service;

import com.web.practica11.entity.Role;
import com.web.practica11.repositories.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RolService {
    @Autowired
    RolRepository rolRepository;

    @Transactional
    public void createRol(Role role){
        rolRepository.save(role);
    }

    public List<Role> listRoles(){
        return rolRepository.findAll();
    }
}
