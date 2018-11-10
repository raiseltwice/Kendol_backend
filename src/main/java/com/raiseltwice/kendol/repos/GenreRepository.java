package com.raiseltwice.kendol.repos;

import com.raiseltwice.kendol.models.Genre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface GenreRepository extends JpaRepository<Genre, Integer> {

    Optional<Genre> findGenreByTitle(String title);
}
