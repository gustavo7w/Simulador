package com.simulador;


public class Job
{
    private int jobId;
    private int necessaryTimeInMinutes;

    public Job(int jobId)
    {
        this.jobId = jobId;
    }

    public int getJobId()
    {
        return jobId;
    }

    public int getNecessaryTimeInMinutes()
    {
        return necessaryTimeInMinutes;
    }

    public void setNecessaryTimeInMinutes(int necessaryTimeInMinutes)
    {
        this.necessaryTimeInMinutes = necessaryTimeInMinutes;
    }
}
