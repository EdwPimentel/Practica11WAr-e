package com.web.practica11.repositories;

import com.web.practica11.entity.Equip;
import com.web.practica11.entity.EquipRental;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EquipRentRepository extends JpaRepository<EquipRental, Integer> {

    EquipRental findById(int id);
    EquipRental findByEquip(Equip equip);
}
