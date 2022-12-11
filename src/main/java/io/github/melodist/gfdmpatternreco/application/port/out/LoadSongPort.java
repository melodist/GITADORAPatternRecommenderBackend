package io.github.melodist.gfdmpatternreco.application.port.out;

import io.github.melodist.gfdmpatternreco.domain.Song;

public interface LoadSongPort {

    Song loadSong(Long id);
}
