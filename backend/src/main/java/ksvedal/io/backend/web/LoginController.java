/*package ksvedal.io.backend.web;

import ksvedal.io.backend.model.LoginRequest;
import ksvedal.io.backend.model.LoginResponse;
import ksvedal.io.backend.repo.UserRepository;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/login")
@EnableAutoConfiguration
public class LoginController {

    private static final Logger LOGGER = LogManager.getLogger(LoginController.class);

    @PostMapping(value = "", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(value = HttpStatus.CREATED)
    public LoginResponse doLogin(final @RequestBody LoginRequest loginRequest){
        LOGGER.info("Logging in..." + loginRequest.getUsername());
        if(loginRequest.getUsername().equalsIgnoreCase("user")
                && loginRequest.getPassword().equalsIgnoreCase("pass")) {
            return new LoginResponse("Success");
        }
        return new LoginResponse("Fail");
    }

}*/

