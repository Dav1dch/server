package com.goWithU.springboot01.dao;

import com.goWithU.springboot01.Entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
    public Teacher findByOpenId(String OpenId);
}
