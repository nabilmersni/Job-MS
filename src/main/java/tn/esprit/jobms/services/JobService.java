package tn.esprit.jobms.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.jobms.entities.Job;
import tn.esprit.jobms.repositories.JobRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class JobService implements IJobSevice{

    JobRepository jobRepository;

    @Override
    public Job addJob(Job job) {
        return jobRepository.save(job);
    }

    @Override
    public List<Job> getAllJobs() {
        return jobRepository.findAll();
    }

    @Override
    public Job getJobById(int id) {
        return jobRepository.findById(id).orElse(null);
    }

    @Override
    public Job getJobByName(String service) {
        return jobRepository.findByService(service);
    }

    @Override
    public Job updateJobEtat(int id, boolean etat) {
        Job job = jobRepository.findById(id).orElse(null);
        if(job == null){
            throw new RuntimeException("job not found");
        }
        job.setEtat(etat);
        return jobRepository.save(job);
    }
}
