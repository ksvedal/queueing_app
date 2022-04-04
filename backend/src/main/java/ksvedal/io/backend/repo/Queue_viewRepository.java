package ksvedal.io.backend.repo;

import ksvedal.io.backend.model.Queue_view;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Queue view repository to map queue view endpoints do a custom database view.
 */
@Repository
public interface Queue_viewRepository extends JpaRepository<Queue_view, Long> {

    /**
     * Find queue by selected subject
     * @param subject Subject as String to find the queue of.
     * @return List of queued users and extra info.
     */
    @Query(value = "select * from queue_view where subject = :subject", nativeQuery = true)
    List<Queue_view> findQueueBySubject(@Param("subject") String subject);
}