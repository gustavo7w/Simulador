package com.simulador;

import java.util.LinkedList;
import java.util.Queue;

public class Main
{
    static Queue<Job> jobs = new LinkedList<>();

    public static void main(String[] args)
    {
        int jobsNumber = 100;
        Worker worker = new Worker("Worker1", 1);
        createJobs(jobsNumber);


        for (Job job : jobs)
        {
            worker.doJob(job);
        }
        System.out.println(worker.getName() + " demorou " + worker.getWorkingTimeInMinutes() / 60 + " horas para resolver " + jobsNumber + " atendimentos");
    }

    static void createJobs(int size)
    {
        for (int i = 0; i < size; i++)
        {
            Job job = new Job(i);
            jobs.add(job);
        }
    }
}
