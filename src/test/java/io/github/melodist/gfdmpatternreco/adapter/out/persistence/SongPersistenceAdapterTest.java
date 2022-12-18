package io.github.melodist.gfdmpatternreco.adapter.out.persistence;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.Import;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
@Import({SongPersistenceAdapter.class})
class SongPersistenceAdapterTest {

    @Autowired
    SongPersistenceAdapter adapterUnderTest;

    @Autowired
    SongRepository songRepository;

    @Test
    void createSong() {
        String title = "title";
        String artist = "artist";

        adapterUnderTest.createSong(title, artist);

        assertThat(songRepository.count()).isEqualTo(1);
        SongJpaEntity savedSong = songRepository.findAll().get(0);
        assertThat(savedSong.getTitle()).isEqualTo(title);
        assertThat(savedSong.getArtist()).isEqualTo(artist);
    }
}