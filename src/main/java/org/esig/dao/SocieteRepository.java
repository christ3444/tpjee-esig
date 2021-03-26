package org.esig.dao;

import org.esig.models.Societe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface SocieteRepository extends JpaRepository<Societe, Integer>{

}
