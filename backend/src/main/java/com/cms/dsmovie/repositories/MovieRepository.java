package com.cms.dsmovie.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cms.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{

}
