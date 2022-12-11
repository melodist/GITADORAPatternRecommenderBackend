package io.github.melodist.gfdmpatternreco.application.service;

import io.github.melodist.gfdmpatternreco.adapter.out.persistence.SongPersistenceAdapter;
import io.github.melodist.gfdmpatternreco.application.port.out.LoadSongPort;
import io.github.melodist.gfdmpatternreco.domain.Song;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SongService implements LoadSongPort {

    private final SongPersistenceAdapter songPersistenceAdapter;

    @Override
    public Song loadSong(Long id) {
        return songPersistenceAdapter.loadSong(id);
    }
}
