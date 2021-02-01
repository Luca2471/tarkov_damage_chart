package com.example.application.repositories;

import com.example.application.models.Caliber;
import com.example.application.projections.EmbedAmmoType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(excerptProjection = EmbedAmmoType.class)
public interface CaliberRepository extends JpaRepository<Caliber, Long> {
}
