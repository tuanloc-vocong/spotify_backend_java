package com.tuanloc.spotify.dataAccess.abstracts;

import com.tuanloc.spotify.entities.concretes.PlaylistCoverImage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlaylistCoverImageRepository extends JpaRepository<PlaylistCoverImage, Integer> {
    PlaylistCoverImage getPlaylistCoverImageByPlaylistId(int playlistId);
}
