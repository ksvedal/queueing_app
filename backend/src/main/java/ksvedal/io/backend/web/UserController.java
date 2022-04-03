package ksvedal.io.backend.web;

import ksvedal.io.backend.model.User;
import ksvedal.io.backend.repo.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
//@RequestMapping("api/users")
public class UserController {

    Logger logger = LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user")
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/student/status/check")
    public String studentStatusCheck() {
        return "Authorized student";
    }

    @GetMapping("/administrator/status/check")
    public String administratorStatusCheck() {
        return "Authorized administrator";
    }
}
