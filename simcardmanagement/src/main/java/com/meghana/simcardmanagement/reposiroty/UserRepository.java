package com.meghana.simcardmanagement.reposiroty;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.meghana.simcardmanagement.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
