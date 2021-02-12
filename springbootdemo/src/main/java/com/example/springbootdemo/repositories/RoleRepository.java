package com.example.springbootdemo.repositories;

import com.example.springbootdemo.entities.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface RoleRepository extends JpaRepository<Roles,Long> {
    Roles findByRole(String role);
}
