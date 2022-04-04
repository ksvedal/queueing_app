package ksvedal.io.backend.web;

import ksvedal.io.backend.model.Subject;
import ksvedal.io.backend.repo.SubjectRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Subject controller.
 */
@org.springframework.web.bind.annotation.RestController
public class SubjectController {

    Logger logger = LoggerFactory.getLogger(Subject.class);

    @Autowired
    private SubjectRepository subjectRepository;

    /**
     * Get all subjects
     * @return List of all subjects.
     */
    @GetMapping("/administrator/subject")
    public List<Subject> getAllSubjects() { return subjectRepository.findAll(); }

    /**
     * Get subjects a user is enrolled in.
     * @param user User to search subjects for.
     * @return List of subjects for the user.
     */
    @GetMapping("/subject/{user}")
    public List<Subject> getSubjectByUser(@PathVariable("user") String user) {
        return subjectRepository.findSubjectByUser(user);
    }

    /**
     * Add a subject.
     * @param subject Subject to add.
     * @return Success-message as String.
     */
    @RequestMapping(value = "/administrator/subject/add", method = RequestMethod.POST)
    public String addSubject(@RequestBody Subject subject) {
        subjectRepository.save(subject);
        return "Success";
    }

    /**
     * Add a student to a subject.
     * @param subject Subject name to add the student to.
     * @param user Username to add.
     * @return Success-message as String.
     */
    @RequestMapping(value = "/administrator/subject/addStudent", method = RequestMethod.POST)
    public String addStudentToSubject(@RequestParam String subject, @RequestParam String user) {
        // SOMETHING
        return "" + user + " enrolled in " + subject;
    }

    /**
     * Set a subject status as active.
     * @param subject Subject to activate.
     * @return Success-message as String.
     */
    @RequestMapping(value = "/administrator/subject/status/active", method = RequestMethod.POST)
    public String setSubjectActive(@RequestParam String subject) {
        subjectRepository.setSubjectActive(subject);
        return "" + subject + " is now active";
    }

    /**
     * Set a subject status as inactive.
     * @param subject Subject to inactivate.
     * @return Success-message as String.
     */
    @RequestMapping(value = "/administrator/subject/status/inactive", method = RequestMethod.POST)
    public String setSubjectInactive(@RequestParam String subject) {
        subjectRepository.setSubjectInactive(subject);
        return "" + subject + " is now inactive";
    }
}
