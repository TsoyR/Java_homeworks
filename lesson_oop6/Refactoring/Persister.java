package lesson_oop6.Refactoring;

package lesson_oop6;

/**
 * Persister
 */
public class Persister {

    private User user;
	
	public Persister(User user){
		this.user = user;
	}
	
	public void save(){
		System.out.println("Save user: " + user.getName());
	}
}
