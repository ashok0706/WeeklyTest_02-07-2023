package com.GEEKSTER.Weekly.Test3.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GEEKSTER.Weekly.Test3.model.Job;

@Repository
public interface JobRepo extends JpaRepository<Job, Long>{

}
