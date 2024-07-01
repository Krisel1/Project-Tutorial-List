package com.APP.Lista.de.Tutoriales.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ITutorialRepository extends CrudRepository<Tutorial, Long> {
}
