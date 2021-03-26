package org.esig.dao;

import org.esig.models.Vehicule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface VehiculeRepository extends JpaRepository<Vehicule, Integer>{

}
