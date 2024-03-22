package com.tuanloc.spotify.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "playlists")
public class Playlist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "playlist_id")
    private int playlistId;

    @Column(name = "playlist_name")
    private String playlistName;

    @Column(name = "playlist_user_id")
    private int playlistUserId;

    @Column(name = "playlist_cover_image_url")
    private String playlistCoverImageUrl;

//    @Column(name = "playlist_songs")
//    private List<Integer> playlistSongs;
}
