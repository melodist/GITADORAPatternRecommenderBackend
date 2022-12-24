package io.github.melodist.gfdmpatternreco.application.port.out;

import io.github.melodist.gfdmpatternreco.domain.Version;

import java.util.List;

public interface LoadAllVersionPort {

    List<Version> loadAllVersion();
}
