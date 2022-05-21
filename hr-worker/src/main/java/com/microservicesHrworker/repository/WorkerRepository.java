package com.microservicesHrworker.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservicesHrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker,Long> {

}
