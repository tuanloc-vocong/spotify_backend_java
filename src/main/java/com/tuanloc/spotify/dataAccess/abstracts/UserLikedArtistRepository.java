package com.tuanloc.spotify.dataAccess.abstracts;

import com.tuanloc.spotify.entities.concretes.UserLikedArtist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserLikedArtistRepository extends JpaRepository<UserLikedArtist, Integer> {
    List<UserLikedArtist> getByUserId(int userId);
    UserLikedArtist getByUserIdAndArtistId(int userId, int artistId);
}
