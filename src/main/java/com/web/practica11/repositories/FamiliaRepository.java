package com.web.practica11.repositories;

import com.web.practica11.entity.Familia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FamiliaRepository extends JpaRepository<Familia,Integer> {

    Familia findById(int id);
    List<Familia> findByHijoNotNullAndEnabled(Boolean boo);
    List<Familia> findAllByEnabled(Boolean boo);
    List<Familia> findAllByEnabledAndHijoNull(Boolean boo);
}
