package com.bno.movie.repository;

import com.bno.movie.entity.ViewBoardListEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViewBoardListRepository extends JpaRepository<ViewBoardListEntity, String> {

    Page<ViewBoardListEntity> findAllByOrderByCreateAt(Pageable pageable);
}
