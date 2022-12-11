package io.github.melodist.gfdmpatternreco.adapter.out.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

interface SongRepository extends JpaRepository<SongJpaEntity, Long> {
}
