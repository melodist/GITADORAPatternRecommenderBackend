package io.github.melodist.gfdmpatternreco.adapter.out.persistence;

import io.github.melodist.gfdmpatternreco.domain.DifficultyLabel;

import javax.persistence.*;

@Entity
@Table(name="pattern")
public class PatternJpaEntity {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JoinColumn(name = "SONG_ID")
    private SongJpaEntity song;

    private Float difficulty;

    @OneToOne
    private DifficultyLabel difficultyLabel;
}
