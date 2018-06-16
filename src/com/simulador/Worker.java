package com.simulador;

public class Worker
{
    private String name;
    private int level;
    private int workingTimeInMinutes;

    public Worker(String name, int level)
    {
        this.name = name;
        this.level = level;
        this.workingTimeInMinutes = 0;
    }

    public void doJob(Job job)
    {
        int necessaryTimeInMinutes = Util.calculateDefaultNecessaryTimeInMinutes();
        job.setNecessaryTimeInMinutes(necessaryTimeInMinutes);
        this.workingTimeInMinutes += necessaryTimeInMinutes;

        System.out.println("Atendimento " + job.getJobId() + " demorou " + job.getNecessaryTimeInMinutes() + " minutos");
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getLevel()
    {
        return level;
    }

    public void setLevel(int level)
    {
        this.level = level;
    }

    public int getWorkingTimeInMinutes()
    {
        return workingTimeInMinutes;
    }

    public void setWorkingTimeInMinutes(int workingTimeInMinutes)
    {
        this.workingTimeInMinutes = workingTimeInMinutes;
    }
}
