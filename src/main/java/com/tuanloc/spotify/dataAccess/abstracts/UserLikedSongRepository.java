package com.tuanloc.spotify.dataAccess.abstracts;

import com.tuanloc.spotify.entities.concretes.UserLikedSong;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserLikedSongRepository extends JpaRepository<UserLikedSong, Integer> {
    List<UserLikedSong> getByUserId(int userId);
    UserLikedSong getByUserIdAndSongId(int userId, int songId);
}
