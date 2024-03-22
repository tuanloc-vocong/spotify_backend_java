package com.tuanloc.spotify.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_liked_songs")
public class UserLikedSong {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_liked_song_id")
    private int userLikedSongId;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "song_id")
    private int songId;
}
