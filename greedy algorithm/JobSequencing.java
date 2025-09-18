import java.util.*;
public class JobSequencing {
    public static class Job {
        int id;
        int deadline;
        int profit;
        public Job(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }
    public static ArrayList<Integer> sequenceJobs(int jobsGiven[][]) {
        ArrayList<Job> jobsInfo = new ArrayList<>();
        for(int i = 0; i < jobsGiven.length; i++) {
            jobsInfo.add(new Job(i, jobsGiven[i][0], jobsGiven[i][1]));
        }
        Collections.sort(jobsInfo, (obj1, obj2) -> obj2.profit - obj1.profit);
        ArrayList<Integer> sequence = new ArrayList<>();
        int time = 0;
        for(int i = 0; i < jobsInfo.size(); i++) {
            Job currJob = jobsInfo.get(i);
            if(currJob.deadline > time) {
                sequence.add(currJob.id);
                time++;
            }
        }
        return sequence;
    }
    public static void main(String[] args) {
        int jobsGiven[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};
        ArrayList<Integer> result = sequenceJobs(jobsGiven);
        for(int i = 0; i< result.size(); i++) {
            System.out.print(result.get(i) + " ");
        }
    }
}