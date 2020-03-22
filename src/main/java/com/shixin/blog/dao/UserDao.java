package com.shixin.blog.dao;

import com.shixin.blog.domain.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author weizhiwen
 */
public interface UserDao extends JpaRepository<User, Long> {
}
