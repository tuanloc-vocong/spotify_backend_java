package com.tuanloc.spotify.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user_liked_albums")
public class UserLikedAlbum {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_liked_album_id")
    private int userLikedAlbumId;

    @Column(name = "user_id")
    private int userId;

    @Column(name = "album_id")
    private int albumId;
}
