package io.github.melodist.gfdmpatternreco.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VersionRepository extends JpaRepository<VersionJpaEntity, Long> {
}
