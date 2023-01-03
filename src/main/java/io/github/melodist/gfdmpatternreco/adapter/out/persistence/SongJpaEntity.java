package io.github.melodist.gfdmpatternreco.adapter.out.persistence;

import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class SongJpaEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String title;

    @Column
    private String artist;

    @OneToMany(mappedBy = "song")
    List<PatternJpaEntity> patterns = new ArrayList<>();

    @OneToOne
    VersionJpaEntity version;

    static SongJpaEntity createSongJpaEntity(String title, String artist) {
        SongJpaEntity result = new SongJpaEntity();
        result.setTitle(title);
        result.setArtist(artist);
        return result;
    }
}
