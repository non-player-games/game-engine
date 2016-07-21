package com.npg.repository;

import com.npg.model.gameobj.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by samskim on 7/20/16.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
