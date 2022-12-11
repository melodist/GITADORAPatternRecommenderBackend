package io.github.melodist.gfdmpatternreco.adapter.out.persistence;

import io.github.melodist.gfdmpatternreco.application.port.out.LoadSongPort;
import io.github.melodist.gfdmpatternreco.domain.Song;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.EntityNotFoundException;

@RequiredArgsConstructor
@Component
public class SongPersistenceAdapter implements LoadSongPort {

    private final SongRepository songRepository;

    @Override
    public Song loadSong(Long id) {
        SongJpaEntity song = songRepository.findById(id)
                .orElseThrow(EntityNotFoundException::new);

        return Song.withId(song.getId(), song.getTitle(), song.getArtist(), song.getPatterns(), song.getVersion());
    }
}
