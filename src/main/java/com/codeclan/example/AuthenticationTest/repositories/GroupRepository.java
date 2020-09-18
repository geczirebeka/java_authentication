package com.codeclan.example.AuthenticationTest.repositories;

import com.codeclan.example.AuthenticationTest.models.Group;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GroupRepository extends JpaRepository<Group, Long> {
    Group findByName(String name);
}
