package com.blog.board_back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blog.board_back.entity.SearchLogEntity;

@Repository
public interface SearchRepository extends JpaRepository<SearchLogEntity, Integer> {
  
}
