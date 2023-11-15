package tn.esprit.jobms.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.jobms.entities.Job;

public interface JobRepository extends JpaRepository<Job,Integer> {

    Job findByService(String service);
}
