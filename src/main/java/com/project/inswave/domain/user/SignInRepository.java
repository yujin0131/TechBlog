package com.project.inswave.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository(value="SignInRepository")
public interface SignInRepository extends JpaRepository<User, Long> {

	Optional<User> findByinsNum(int insNum);
}
