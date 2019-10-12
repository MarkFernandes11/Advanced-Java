package com.bridgelaz.springstarter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelaz.springstarter.dto.TopicDTO;
import com.bridgelaz.springstarter.service.TopicService;

@RequestMapping("/topics")
@RestController
public class TopicsController {
	@Autowired
	private TopicService topicService;

	@GetMapping("/all-Topics")
	public List<TopicDTO> topics() 
	{
		return topicService.getAllTopics();
	}
		
	@GetMapping("/all-Topics/{id}")
	public TopicDTO getTopicById(@PathVariable long id) 
	{
		return topicService.getTopicById(id);
	}

	@PostMapping("/add")
	public String addTopic(@RequestBody TopicDTO topicDTO) {
		topicService.addTopic(topicDTO);
		return "Added success";
	}
	
	@PutMapping("/topics/{id}")
	public String updateTopic(@RequestBody TopicDTO topicDTO, @PathVariable long id) 
	{
		topicService.updateTopic(id, topicDTO);
		return "Successfully updated";
	}
	
	@DeleteMapping("/topics/{id}")
	//@RequestMapping(method = RequestMethod.DELETE,value = "/topics/{id}" )
	public String deleteTopic(@PathVariable long id) 
	{
		topicService.deleteTopic(id);
		return "Successfully deleted";
	}
}
