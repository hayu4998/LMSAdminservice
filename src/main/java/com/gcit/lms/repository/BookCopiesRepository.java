package com.gcit.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gcit.lms.entity.BookCopies;

@Repository
public interface BookCopiesRepository extends JpaRepository<BookCopies, Integer>{
//	@Query(" FROM Author where authorName like %:authorName%")
//	public List<Author> readAuthorsByAuthorName(@Param("authorName") String authorName);

}