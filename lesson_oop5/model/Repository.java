package lesson_oop5.model;

import java.util.List;

/**
 * Repository
 */
public interface Repository {
    List<User>getAllUsers();
    String CreateUser(User user);
    void UpdateUser(User user ,Fields field, String param);
    void DeleteUser(String userId);
   
    
}
