package com.example.stademaladie.repositories;


import com.example.stademaladie.beans.ERole;
import com.example.stademaladie.beans.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
