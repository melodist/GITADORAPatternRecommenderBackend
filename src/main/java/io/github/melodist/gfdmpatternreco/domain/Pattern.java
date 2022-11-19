package io.github.melodist.gfdmpatternreco.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Pattern {

    @Id @GeneratedValue
    private Long id;

    private Float difficulty;

    @OneToOne
    private DifficultyLabel difficultyLabel;
}
