package com.bridgelaz.springstarter.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelaz.springstarter.dto.TopicDTO;
import com.bridgelaz.springstarter.repository.TopicRepository;

@Service
public class TopicService 
{	
	@Autowired
	private TopicRepository topicRepository;
	
	public List<TopicDTO> getAllTopics() {
		//return topics;
		List<TopicDTO> topics = new ArrayList<TopicDTO>(); 
		topicRepository.findAll().forEach(topics::add);
		
		return topics;
	}

	public TopicDTO getTopicById(long id) {
//		for(TopicDTO data : topics)
//		{
//			if(data.getId() == id)
//			{
//				System.out.println(data);
//			}
//			else 
//			{
//				System.out.println("Id not found");
//			}
//			
//		}

		//return topics.stream().filter(t -> t.getId() == (id)).findFirst().get();
		
//		Optional<TopicDTO> topic = topicRepository.findById(id);
//		
//		return topic;
		return null;
	}

	public void addTopic(TopicDTO topicDTO) {
		//topics.add(topicDTO);
		
		topicRepository.save(topicDTO);
	}

	public void updateTopic(long id, TopicDTO topicDTO) 
	{
//		for(int i = 0; i < topics.size(); i++)
//		{
//			TopicDTO top = topics.get(i);
//			if(top.getId() == id)
//			{
//				topics.set(i,topicDTO);
//				return;
//			}
//		}
		topicRepository.save(topicDTO);
	}

	public void deleteTopic(long id) 
	{
		//topics.removeIf(t -> (t.getId() == id));
		
//		for(int i=0; i<topics.size() ; i++)
//		{
//			TopicDTO topic = topics.get(i);
//			if(topic.getId() == id)
//			{
//				topics.remove(i);
//				return;
//			}
//		}
		
		topicRepository.deleteById(id);
	}

}
