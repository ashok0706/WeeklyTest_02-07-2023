package com.GEEKSTER.Weekly.Test3.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.GEEKSTER.Weekly.Test3.Repo.JobRepo;
import com.GEEKSTER.Weekly.Test3.model.Job;

import antlr.collections.List;

@RestController
public class jobController {
	@Autowired
	JobRepo jobRepo;
	
	@GetMapping("/getalljobs")
	public Iterable<Job> getalljobs() {
		return jobRepo.findAll();
		
	}
	
	@PostMapping("/addjob")
	public Job addjob(@RequestBody Job job) {
		return jobRepo.save(job);
		}
 
	@PutMapping("/Updatejob")
	public Job updatejobs(Job job) {
		return jobRepo.save(job);
		
	}
	
	@DeleteMapping("/deletejobById/{Id}")
	public Job deletejobById(@PathVariable String id) {
		
		Long Id = Long.valueOf(id);
		
		return  jobRepo.deleteById(Id);
		
	}
}
