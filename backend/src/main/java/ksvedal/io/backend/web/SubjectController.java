package ksvedal.io.backend.web;

import ksvedal.io.backend.model.Subject;
import ksvedal.io.backend.model.User;
import ksvedal.io.backend.repo.SubjectRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class SubjectController {

    Logger logger = LoggerFactory.getLogger(Subject.class);

    @Autowired
    private SubjectRepository subjectRepository;

    @GetMapping("/subject")
    public List<Subject> getSubjects() { return subjectRepository.findAll(); }

    @GetMapping("/subject/{user}")
    public List<Subject> getSubjectByUser(@PathVariable("user") String user) {
        return subjectRepository.findSubjectByUser(user);
    }
}
