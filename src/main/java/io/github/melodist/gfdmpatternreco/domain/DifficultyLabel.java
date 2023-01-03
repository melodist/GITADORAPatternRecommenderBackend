package io.github.melodist.gfdmpatternreco.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class DifficultyLabel {

    @Id @GeneratedValue
    private Long id;

    private String label;
}
