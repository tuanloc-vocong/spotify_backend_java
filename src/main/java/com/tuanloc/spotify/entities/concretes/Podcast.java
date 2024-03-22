package com.tuanloc.spotify.entities.concretes;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Table(name = "podcasts")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "episodes"})
public class Podcast {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "podcast_id")
    private int podcastId;

    @Column(name = "podcast_name")
    private String podcastName;

    @Column(name = "podcast_about")
    private String podcastAbout;

    @Column(name = "podcast_cover_image_url")
    private String podcastCoverImageUrl;

    @Column(name = "podcast_publisher")
    private String podcastPublisher;

    @OneToMany(mappedBy = "podcast")
    private List<Episode> episodes;
}
