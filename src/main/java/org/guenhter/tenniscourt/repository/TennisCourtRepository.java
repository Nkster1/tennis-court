package org.guenhter.tenniscourt.repository;

import org.guenhter.tenniscourt.domain.TennisCourt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TennisCourtRepository extends JpaRepository<TennisCourt, Long> {
}
