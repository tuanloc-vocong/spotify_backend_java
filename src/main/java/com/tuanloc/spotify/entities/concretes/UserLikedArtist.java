package com.tuanloc.spotify.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_liked_artists")
public class UserLikedArtist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_liked_artist_id")
    private int userLikedArtistId;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "artist_id")
    private int artistId;
}
