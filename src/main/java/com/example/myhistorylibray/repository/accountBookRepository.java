package com.example.myhistorylibray.repository;

import com.example.myhistorylibray.entity.accountBook;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface accountBookRepository extends JpaRepository<accountBook, Integer> {
//    Page<accountBook> findByTitleContaining(String  searchKeyword, Pageable pageable);
}
