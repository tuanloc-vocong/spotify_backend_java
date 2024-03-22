package com.tuanloc.spotify.dataAccess.abstracts;

import com.tuanloc.spotify.entities.concretes.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlaylistRepository extends JpaRepository<Playlist, Integer> {
    List<Playlist> getByPlaylistUserId(int playlistUserId);
    Playlist getByPlaylistName(String playlistName);

    @Modifying
    @Query("UPDATE Playlist p SET p.playlistCoverImageUrl=:playlistCoverImageUrl WHERE p.playlistId=:playlistId")
    void updatePlaylistCoverImageUrl(int playlistId, String playlistCoverImageUrl);
}
