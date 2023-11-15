package tn.esprit.jobms.services;


import tn.esprit.jobms.entities.Job;

import java.util.List;

public interface IJobSevice {

    public Job addJob(Job job);
    public List<Job> getAllJobs();
    public  Job getJobById(int id);
    public  Job getJobByName(String service);
    public Job updateJobEtat(int id,boolean etat);
}
