package ksvedal.io.backend.repo;

import ksvedal.io.backend.model.Subject;
import ksvedal.io.backend.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class SubjectRepositoryTest {

    @Autowired
    private SubjectRepository subjectRepositoryTest;
    @Autowired
    private UserRepository userTest;

    @Test
    void findSubjectByUser() {
        /**
        User user = new User(1L, 1L, "rita", "rita");
        userTest.save(user);

        Subject subject = new Subject(1L, "rowing", 8, 1);
        subjectRepositoryTest.save(subject);

        List<Subject> testSubject = subjectRepositoryTest.findSubjectByUser("rita");**/
    }

    @Test
    void setSubjectActive() {
    }
}