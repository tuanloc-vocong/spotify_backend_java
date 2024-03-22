package com.tuanloc.spotify.dataAccess.abstracts;

import com.tuanloc.spotify.entities.concretes.UserEpisode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserEpisodeRepository extends JpaRepository<UserEpisode, Integer> {
    List<UserEpisode> getByUserId(int userId);
    UserEpisode getByUserIdAndEpisodeId(int userId, int episodeId);
}
