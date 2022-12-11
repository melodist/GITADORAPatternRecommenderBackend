package io.github.melodist.gfdmpatternreco.adapter.out.persistence;

import io.github.melodist.gfdmpatternreco.domain.Pattern;
import io.github.melodist.gfdmpatternreco.domain.Version;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class SongJpaEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String artist;

    @OneToMany(mappedBy = "song")
    List<Pattern> patterns = new ArrayList<>();

    @OneToOne
    Version version;
}
