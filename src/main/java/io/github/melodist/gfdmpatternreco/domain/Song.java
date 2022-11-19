package io.github.melodist.gfdmpatternreco.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Song {

    @Id @GeneratedValue
    private Long id;

    private String title;
    private String artist;

    @OneToMany(mappedBy = "song")
    List<Pattern> patterns = new ArrayList<>();

    @OneToOne
    Version version;
}
