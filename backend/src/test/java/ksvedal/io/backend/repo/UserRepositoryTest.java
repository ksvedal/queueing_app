package ksvedal.io.backend.repo;

import ksvedal.io.backend.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class UserRepositoryTest {

    @Autowired
    private UserRepository underTest;

    @Test
    void findUserByUsername() {
        User user = new User(1L, 1L, "rita", "rita");
        underTest.save(user);

        User testUser = underTest.findUserByUsername("rita");

        assertEquals(testUser.getId(), user.getId());
        assertEquals(testUser.getUsername(), user.getUsername());
        assertEquals(testUser.getAuthorization_level(), user.getAuthorization_level());
        assertEquals(testUser.getPassword(), user.getPassword());
    }
}