package com.tuanloc.spotify.dataAccess.abstracts;

import com.tuanloc.spotify.entities.concretes.UserLikedAlbum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserLikedAlbumRepository extends JpaRepository<UserLikedAlbum, Integer> {
    List<UserLikedAlbum> getByUserId(int userId);
    UserLikedAlbum getByUserIdAndAlbumId(int userId, int albumId);
}
