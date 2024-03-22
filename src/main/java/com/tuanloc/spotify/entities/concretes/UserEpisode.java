package com.tuanloc.spotify.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_episodes")
public class UserEpisode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_episode_id")
    private int userEpisodeId;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "episode_id")
    private int episodeId;
}
