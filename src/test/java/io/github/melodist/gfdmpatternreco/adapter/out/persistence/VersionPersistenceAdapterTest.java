package io.github.melodist.gfdmpatternreco.adapter.out.persistence;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@Import({VersionPersistenceAdapter.class})
class VersionPersistenceAdapterTest {

    @Autowired
    VersionPersistenceAdapter adapterUnderTest;

    @Autowired
    VersionRepository versionRepository;

    @Test
    void createVersion() {
        String versionName = "version";

        adapterUnderTest.createVersion(versionName);

        assertThat(versionRepository.count()).isEqualTo(1);
        VersionJpaEntity savedVersion = versionRepository.findAll().get(0);
        assertThat(savedVersion.getVersionName()).isEqualTo(versionName);
    }
}