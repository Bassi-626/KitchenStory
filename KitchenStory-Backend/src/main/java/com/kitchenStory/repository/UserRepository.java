package com.kitchenStory.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.kitchenStory.models.User;

public interface UserRepository extends PagingAndSortingRepository<User,Integer>{
}
