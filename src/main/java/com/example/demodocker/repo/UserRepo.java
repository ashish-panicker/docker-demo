package com.example.demodocker.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import com.example.demodocker.domain.User;

@RepositoryRestResource(path = "users", collectionResourceRel = "User Repository")
public interface UserRepo extends JpaRepository<User, Integer> {

    User findByUserName(String userName);
    
}
