package com.gcit.lms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.gcit.lms.entity.Author;
import com.gcit.lms.entity.Borrower;

@Repository
public interface BorrowerRepository extends JpaRepository<Borrower, Integer>{
	@Query(" FROM Author where authorName like %:authorName%")
	public List<Author> readAuthorsByAuthorName(@Param("authorName") String authorName);

}