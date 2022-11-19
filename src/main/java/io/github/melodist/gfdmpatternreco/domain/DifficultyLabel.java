package io.github.melodist.gfdmpatternreco.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class DifficultyLabel {

    @Id @GeneratedValue
    private Long id;

    private String label;
}
