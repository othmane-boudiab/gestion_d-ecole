package com.student.repository;

import com.student.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {

    @Query("select a from Admin a where a.email = :email and a.password = :password")
    public Admin login(@Param("email") String email, @Param("password") String password);
}
