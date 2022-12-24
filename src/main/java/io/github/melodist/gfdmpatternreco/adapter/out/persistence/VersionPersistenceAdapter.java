package io.github.melodist.gfdmpatternreco.adapter.out.persistence;

import io.github.melodist.gfdmpatternreco.application.port.out.CreateVersionPort;
import io.github.melodist.gfdmpatternreco.application.port.out.LoadAllVersionPort;
import io.github.melodist.gfdmpatternreco.domain.Version;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;


@RequiredArgsConstructor
@Component
public class VersionPersistenceAdapter implements CreateVersionPort, LoadAllVersionPort {

    private final VersionRepository versionRepository;

    @Override
    public void createVersion(String versionName) {
        versionRepository.save(VersionJpaEntity.createVersionJpaEntity(versionName));
    }

    @Override
    public List<Version> loadAllVersion() {
        return versionRepository.findAll()
                .stream()
                .map(versionJpaEntity ->
                        Version.createVersion(versionJpaEntity.getVersionName()))
                .collect(Collectors.toList());
    }
}
