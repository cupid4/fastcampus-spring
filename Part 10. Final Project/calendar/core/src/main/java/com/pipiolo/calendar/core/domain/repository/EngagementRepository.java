package com.pipiolo.calendar.core.domain.repository;

import com.pipiolo.calendar.core.domain.entity.Engagement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface EngagementRepository extends JpaRepository<Engagement, Long> {

    List<Engagement> findAllByAttendeeIdInAndSchedule_EndAtAfter(
            List<Long> attendeeIds,
            LocalDateTime startAt
    );

    List<Engagement> findAllByAttendeeId(Long id);
}
