package com.example.application.repositories;

import com.example.application.models.AmmoType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AmmoTypeRepository extends JpaRepository<AmmoType, Long> {
}
