package ksvedal.io.backend.web;

import ksvedal.io.backend.model.Queue;
import ksvedal.io.backend.repo.QueueRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Queue controller.
 */
@org.springframework.web.bind.annotation.RestController
public class QueueController {

    Logger logger = LoggerFactory.getLogger(Queue.class);

    @Autowired
    private QueueRepository queueRepository;

    /**
     * Add student to queue of a subject
     * @param subject Subject name as String to add student to the queue of.
     * @param user Student to add to queue.
     * @return Success message as String.
     */
    @RequestMapping(value = "/queue/addStudentToSubjectQueue", method = RequestMethod.POST)
    public String addStudentToSubjectQueue(@RequestParam String subject, @RequestParam String user) {
        return "Not a functional endpoint";
    }
}