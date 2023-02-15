package lesson_oop6;

/**
 * User
 */
public class User {

    private String name;
	
	public User(String name){
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public void save(){
		Persister persister = new Persister(this);
		persister.save();
	}
	
	public void report(){
		Report report = new Report(this);
        report.report();
	}
}