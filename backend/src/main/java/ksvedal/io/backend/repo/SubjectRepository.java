package ksvedal.io.backend.repo;

import ksvedal.io.backend.model.Subject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Subject interface to map subject endpoint to database.
 */
@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {

    /**
     * Find subject by user
     * @param user Username as String to search subjects for.
     * @return List of subjects a user is connected to.
     */
    @Query(value =
            "select subject.id, subject.subject, subject.assignments, subject.active " +
            "from enrollment " +
            "left join user on user.id = enrollment.user_id " +
            "left join subject on subject.id = enrollment.subject_id " +
            "where user.username = :user", nativeQuery = true)
    List<Subject> findSubjectByUser(@Param("user") String user);

    /**
     * Set subject status to active.
     * @param subject Subject to activate.
     */
    @Query(value = "update subject set active = 1 where subject = :subject", nativeQuery = true)
    @Modifying(clearAutomatically = true)
    void setSubjectActive(@Param("subject") String subject);

    /**
     * Set subject status to inactive.
     * @param subject Subject to deactivate
     */
    @Query(value = "update subject set active = 0 where subject = :subject", nativeQuery = true)
    @Modifying(clearAutomatically = true)
    void setSubjectInactive(@Param("subject") String subject);
}
