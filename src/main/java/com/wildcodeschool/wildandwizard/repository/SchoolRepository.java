package com.wildcodeschool.wildandwizard.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wildcodeschool.wildandwizard.entity.School;

// TODO : update this interface
@Repository                              //<School,Long>signalent que notre interface sera chargée de gérer l'entité School, et que l'identifiant unique de School (son id) est de type Long
public interface SchoolRepository extends JpaRepository<School,Long> {
}
