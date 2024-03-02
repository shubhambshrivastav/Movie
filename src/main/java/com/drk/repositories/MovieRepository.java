package com.drk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.drk.entities.Movie;

@Repository("movieRepository")
public interface MovieRepository extends JpaRepository<Movie, Integer>{

	Movie findById(int id);
}
