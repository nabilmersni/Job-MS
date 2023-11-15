package tn.esprit.jobms.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.jobms.entities.Job;
import tn.esprit.jobms.services.JobService;

import java.util.List;

@RestController
@RequestMapping("/jobs")
@AllArgsConstructor
public class JobController {

    JobService jobService;

    @GetMapping
    public List<Job> getAllJobs() {
        return jobService.getAllJobs();
    }

    @GetMapping("/{id}")
    public Job getJobById(@PathVariable int id) {
        return jobService.getJobById(id);
    }

    @GetMapping("/byService/{service}")
    public Job getJobByService(@PathVariable String service) {
        return jobService.getJobByName(service);
    }

    @PutMapping("/{id}/updateEtat")
    public Job updateJobEtat(@PathVariable int id, @RequestParam boolean etat) {
        return jobService.updateJobEtat(id, etat);
    }

}
