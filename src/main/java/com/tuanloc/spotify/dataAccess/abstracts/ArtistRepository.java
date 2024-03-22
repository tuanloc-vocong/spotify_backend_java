package com.tuanloc.spotify.dataAccess.abstracts;

import com.tuanloc.spotify.entities.concretes.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Integer> {
    Artist getByArtistName(String name);
    Artist getById(int id);
    List<Artist> getByArtistNameContains(String name);
    List<Artist> getByArtistNameStartsWith(String name);
}
