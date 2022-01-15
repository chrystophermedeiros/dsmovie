package com.cms.dsmovie.repositories;
import org.springframework.data.jpa.repository.JpaRepository;

import com.cms.dsmovie.entities.Score;
import com.cms.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
