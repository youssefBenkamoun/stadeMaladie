package com.example.stademaladie.repositories;

import com.example.stademaladie.beans.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
