package com.tuanloc.spotify.dataAccess.abstracts;

import com.tuanloc.spotify.entities.concretes.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SongRepository extends JpaRepository<Song, Integer> {
    Song getBySongName(String songName);
    Song getById(int id);
    List<Song> getBySongNameContains(String name);
    List<Song> getBySongNameStartsWith(String name);
    List<Song> getByAlbum_AlbumId(int albumId);
    List<Song> getByCategory_CategoryId(int categoryId);
}
