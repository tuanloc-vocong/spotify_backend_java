package com.tuanloc.spotify.dataAccess.abstracts;

import com.tuanloc.spotify.entities.concretes.UserLikedPodcast;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserLikedPodcastRepository extends JpaRepository<UserLikedPodcast, Integer> {
    List<UserLikedPodcast> getByUserId(int userId);
    UserLikedPodcast getByUserIdAndPodcastId(int userId, int podcastId);
}
