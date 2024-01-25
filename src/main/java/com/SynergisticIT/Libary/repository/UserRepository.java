package com.SynergisticIT.Libary.repository;

import com.SynergisticIT.Libary.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
