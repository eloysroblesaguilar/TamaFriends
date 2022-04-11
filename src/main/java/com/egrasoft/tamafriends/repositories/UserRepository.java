package com.egrasoft.tamafriends.repositories;

import com.egrasoft.tamafriends.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
