package com.learnSphere.services;

import java.util.List;

import org.hibernate.annotations.Comments;

public interface CommentService {
	List<Comments> commentList();
	
	void addComment();
}
