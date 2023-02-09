package lesson_oop5;

import lesson_oop5.controllers.UserController;
import lesson_oop5.model.FileOperation;
import lesson_oop5.model.FileOperationImpl;
import lesson_oop5.model.Repository;
import lesson_oop5.model.RepositoryFile;
import lesson_oop5.utils.Validate;
import lesson_oop5.views.ViewUser;

public class Main {   
    public static void main(String[] args) {
        FileOperation fileOperation = new FileOperationImpl("users.txt");
        Repository repository = new RepositoryFile(fileOperation);
        Validate validate = new Validate();
        UserController controller = new UserController(repository,validate);
        ViewUser view = new ViewUser(controller, validate);
        view.run();
    }
}

