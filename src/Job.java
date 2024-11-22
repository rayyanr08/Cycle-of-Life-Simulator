public class Job {
    private int salary;
    private School grades;

    public Job(School grades){
        this.grades = grades;
    }

    public String jobInterest(String interest){
        if (interest.equals("medicine") && grades.getScience()){
            return "You can be a doctor" + "\n" + "You can be a dentist" + "\n" + "You can be a nurse";
        }

        if (interest.equals("math") && grades.getMath()){
            return "You can be a software engineer" + "\n" + "You can be a math teacher" + "\n" + "You can be an accountant";
        }

        if (interest.equals("Humanities") && grades.getEnglish()){
            return "You can be a lawyer" + "\n" + "You can be a social worker" + "\n" + "You can become a journalist";
        }
        return "";
    }

    public void jobPay(String job){
        if (job.equals("doctor")){
            salary= (int)(Math.random() * 400000);
        }

        if (job.equals("dentist")){
            salary = (int)(Math.random() * 300000);
        }

        if (job.equals("nurse")){
            salary = (int)(Math.random() * 130000);
        }

        if (job.equals("software engineer")){
            salary = (int)(Math.random() * 250000);
        }

        if (job.equals("math teacher")){
            salary = (int)(Math.random() * 100000);
        }

        if (job.equals("accountant")){
            salary = (int)(Math.random() * 120000);
        }

        if (job.equals("lawyer")){
            salary = (int)(Math.random() * 160000);
        }

        if (job.equals("social worker")){
            salary = (int)(Math.random() * 90000);
        }

        if (job.equals("journalist")){
            salary = (int)(Math.random() * 140000);
        }

    }

    public String getSalary(){
        return "You make " + salary + " per year.";
    }

}
