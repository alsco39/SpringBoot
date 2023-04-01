package com.example.board.entity.repository;

import com.example.board.entity.BoardEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BoardRepository extends CrudRepository<BoardEntity, Long> {
}
