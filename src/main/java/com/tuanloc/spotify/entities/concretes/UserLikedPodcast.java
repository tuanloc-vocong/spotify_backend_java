package com.tuanloc.spotify.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_liked_podcasts")
public class UserLikedPodcast {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_liked_podcast_id")
    private int userLikedPodcasetId;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "podcast_id")
    private int podcastId;
}
