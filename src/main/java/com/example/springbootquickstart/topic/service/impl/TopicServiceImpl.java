package com.example.springbootquickstart.topic.service.impl;

import com.example.springbootquickstart.topic.model.Topic;
import com.example.springbootquickstart.topic.service.TopicService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicServiceImpl implements TopicService {
    private final List<Topic> topics = Arrays.asList(
            new Topic("spring", "Spring Framework", "Spring Framework Description"),
            new Topic("java", "Core Java", "Core Java Description"),
            new Topic("javascript", "JavaScript", "JavaScript Description")
    );

    @Override
    public List<Topic> getAllTopics() {
        return topics;
    }
}
