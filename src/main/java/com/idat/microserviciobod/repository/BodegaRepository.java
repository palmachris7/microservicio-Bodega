package com.idat.microserviciobod.repository;

import com.idat.microserviciobod.model.Bodega;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BodegaRepository extends JpaRepository<Bodega,Integer> {
}
