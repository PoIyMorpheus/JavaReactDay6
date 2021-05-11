package polymorpheus.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import polymorpheus.hrms.business.abstracts.JobService;
import polymorpheus.hrms.entities.concretes.Job;

import java.util.List;

@RestController
@RequestMapping("/api/jobs")
public class JobsController {

    private JobService jobService;

    @Autowired
    public JobsController(JobService jobService) {
        this.jobService = jobService;
    }

    @GetMapping("/getall")
    public List<Job> getAll(){
        return jobService.getAll();
    }
}
