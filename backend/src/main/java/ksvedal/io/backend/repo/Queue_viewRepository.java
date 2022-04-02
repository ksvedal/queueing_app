package ksvedal.io.backend.repo;

import ksvedal.io.backend.model.Queue_view;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Queue_viewRepository extends JpaRepository<Queue_view, Long> {

    @Query(value = "select * from queue_view where subject = :subject", nativeQuery = true)
    List<Queue_view> findQueueBySubject(@Param("subject") String subject);
}