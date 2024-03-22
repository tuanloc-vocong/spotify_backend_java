package com.tuanloc.spotify.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Table(name = "episodes")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Episode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "episode_id")
    private int episodeId;

    @Column(name = "episode_name")
    private String episodeName;

    @Column(name = "episode_duration")
    private double episodeDuration;

    @Column(name = "episode_url")
    private String episodeUrl;

    @Column(name = "episode_release_date")
    private Date episodeReleaseDate;

    @Column(name = "episode_description")
    private String episodeDescription;

    @ManyToOne()
    @JoinColumn(name = "podcast_id")
    private Podcast podcast;
}
