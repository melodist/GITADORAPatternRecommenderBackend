package io.github.melodist.gfdmpatternreco.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Song {

    private Long id;
    private String title;
    private String artist;
    List<Pattern> patterns;
    Version version;

    public static Song withId(Long id, String title, String artist) {
        return new Song(id, title, artist, null, null);
    }
}
