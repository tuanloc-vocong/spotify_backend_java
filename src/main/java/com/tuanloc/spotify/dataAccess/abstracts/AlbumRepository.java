package com.tuanloc.spotify.dataAccess.abstracts;

import com.tuanloc.spotify.entities.concretes.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Integer> {
    Album getByAlbumName(String name);
    Album getById(int id);
    List<Album> getByArtist_ArtistId(int artistId);
    List<Album> getByAlbumNameContains(String name);
    List<Album> getByAlbumNameStartsWith(String name);
}
