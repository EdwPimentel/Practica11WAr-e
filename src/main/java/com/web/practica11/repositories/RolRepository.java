package com.web.practica11.repositories;

import com.web.practica11.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Role,Integer> {
    Role findByRoleName(String rolName);
}
