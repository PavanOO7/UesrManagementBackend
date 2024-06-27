package Test.demo.services;

import Test.demo.models.UserModel;
import Test.demo.services.UserInterface.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class UserService {

@Autowired
private User user;

    public List<UserModel>  getUserData(){
        List<UserModel> list =  user.findAll();
      return  list;
    }
    public void createUser(UserModel userModel){
        UserModel userModel1 = new UserModel();
        userModel1.setUserName(userModel.getUserName());
        userModel1.setUserID(userModel.getUserID());
        userModel1.setPassword(userModel.getPassword());
        user.save(userModel1);
    }
}
