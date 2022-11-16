package com.example.springbootquickstart.topic.controller;

import com.example.springbootquickstart.topic.model.Topic;
import com.example.springbootquickstart.topic.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class TopicController {
    private final TopicService topicService;
    @Autowired
    public TopicController(TopicService topicService) {
        this.topicService = topicService;
    }

    @RequestMapping(path = "/topics", method = RequestMethod.GET)
    public List<Topic> getAllTopics() {
        return topicService.getAllTopics();
        /*
        return Arrays.asList(
                new Topic("spring", "Spring Framework", "Spring Framework Description"),
                new Topic("java", "Core Java", "Core Java Description"),
                new Topic("javascript", "JavaScript", "JavaScript Description")
        );
         */
    }
}
