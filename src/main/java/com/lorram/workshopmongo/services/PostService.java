package com.lorram.workshopmongo.services;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lorram.workshopmongo.domain.Post;
import com.lorram.workshopmongo.repository.PostRepository;
import com.lorram.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repository;
	
	public Post findById(String id) {
		Optional<Post> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(id));
	}
	
	public List<Post> findByTitle(String text) {
		return repository.searchTitle(text);
	}
	
	public List<Post> complexSearch(String text, LocalDate minDate, LocalDate maxDate) {
		maxDate = maxDate.plusDays(1);
		return repository.complexSearch(text, minDate, maxDate);
	}
	
}
