package lesson_oop6;

public class Report {
    private Note user;

    public Report(Note user) {
        this.user = user;
    }
    public void report(){
		System.out.println("Report for user: " + user.getName());
	}
    
}
