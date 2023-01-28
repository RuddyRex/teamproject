package pl.wwsis.microblog.service;

import pl.wwsis.microblog.model.user;
import pl.wwsis.microblog.model.post;

import java.util.List;

public interface MicroblogService {
	List<post> getAllPostsFromUser(user User);
	
}
