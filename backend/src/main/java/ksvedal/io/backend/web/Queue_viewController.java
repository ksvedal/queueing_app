package ksvedal.io.backend.web;

import ksvedal.io.backend.model.Queue_view;
import ksvedal.io.backend.repo.Queue_viewRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class Queue_viewController {

    Logger logger = LoggerFactory.getLogger(Queue_view.class);

    @Autowired
    private Queue_viewRepository queueViewRepository;

    @GetMapping("/queue/{subject}")
    public List<Queue_view> getSubjects(@PathVariable("subject") String subject) {
        return queueViewRepository.findQueueBySubject(subject);
    }
}
