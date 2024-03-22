package com.tuanloc.spotify.entities.concretes;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;
import java.util.Optional;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "playlist_cover_images")
public class PlaylistCoverImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "playlist_cover_image_id")
    private int playlistCoverImageId;

    @Column(name = "playlist_id")
    private int playlistId;

    @Column(name = "playlist_cover_image_link")
    private String playlistCoverImageLink;

    public Optional<String> getPlaylistCoverImageLink(){
        return Optional.ofNullable(playlistCoverImageLink);
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        PlaylistCoverImage that = (PlaylistCoverImage) o;
        return Objects.equals(playlistCoverImageId, that.playlistCoverImageId) &&
                Objects.equals(playlistId, that.playlistId) &&
                Objects.equals(playlistCoverImageLink, that.playlistCoverImageLink);
    }

    @Override
    public int hashCode(){
        return Objects.hash(playlistCoverImageId, playlistId, playlistCoverImageLink);
    }
}
