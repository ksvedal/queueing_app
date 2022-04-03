package ksvedal.io.backend.repo;

import ksvedal.io.backend.model.Queue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QueueRepository extends JpaRepository<Queue, Long> {  }