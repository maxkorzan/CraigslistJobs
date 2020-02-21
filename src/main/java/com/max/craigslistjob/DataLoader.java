package com.max.craigslistjob;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    JobRepository repository;

    @Override
    public void run(String ... strings) throws Exception{
        Job job;

        job = new Job("Junior Developer","Coding on team projects","Dec 21, 2019","Oracle","555-555-5555", "www.oracle.com");
        repository.save(job);

        job = new Job("Front-End Developer","Making our sites pretty","Nov 21, 2019","Apple","555-555-5555", "www.apple.com");
        repository.save(job);

        job = new Job("Full Stack Developer","Manange all aspects of our product","Jan 15, 2020","Motivation Industries","555-555-5555", "www.motivation.com");
        repository.save(job);

        job = new Job("Project Manager","Run the game. Take over the world.","Feb 16, 2020","Facebook","555-555-5555", "www.facebook.com");
        repository.save(job);

        job = new Job("Front-End Developer","Making our sites pretty","Nov 21, 2019","Apple","555-555-5555", "www.apple.com");
        repository.save(job);

        job = new Job("Junior Developer","Coding on team projects","Dec 21, 2019","Oracle","555-555-5555", "www.oracle.com");
        repository.save(job);

        job = new Job("Project Manager","Run the game. Take over the world.","Feb 16, 2020","Facebook","555-555-5555", "www.facebook.com");
        repository.save(job);



    }
}
