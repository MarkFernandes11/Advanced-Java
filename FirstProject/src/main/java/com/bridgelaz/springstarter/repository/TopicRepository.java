package com.bridgelaz.springstarter.repository;

import org.springframework.data.repository.CrudRepository;

import com.bridgelaz.springstarter.dto.TopicDTO;

public interface TopicRepository extends CrudRepository<TopicDTO, Long>
{
	
}
