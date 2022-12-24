package io.github.melodist.gfdmpatternreco.adapter.out.persistence;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
public class VersionJpaEntity {

    @Id @GeneratedValue
    private Long id;

    @Column
    private String versionName;

    static VersionJpaEntity createVersionJpaEntity(String versionName) {
        VersionJpaEntity result = new VersionJpaEntity();
        result.setVersionName(versionName);
        return result;
    }
}
