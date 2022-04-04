package ksvedal.io.backend.web;

import ksvedal.io.backend.model.User;
import ksvedal.io.backend.repo.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
//@RequestMapping("api/users")
public class UserController {

    Logger logger = LoggerFactory.getLogger(UserController.class);

    /**
     * User controller.
     */
    @Autowired
    private UserRepository userRepository;

    /**
     * Get all users.
     * @return List of all users.
     */
    @GetMapping("/administrator/user")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    /**
     * Check if user entered is student.
     * @return Success-message as String.
     */
    @GetMapping("/student/status/check")
    public String studentStatusCheck() {
        return "Authorized student";
    }

    /**
     * Check if selected user is administrator.
     * @return Success-message as String.
     */
    @GetMapping("/administrator/status/check")
    public String administratorStatusCheck() {
        return "Authorized administrator";
    }
}
