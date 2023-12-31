package com.example.projectwork.repository;

import com.example.projectwork.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<Users,Integer> {
    Users findByEmail(String email);
}
