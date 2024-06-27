package Test.demo.services.UserInterface;

import Test.demo.models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface User extends JpaRepository<UserModel,String>  {


}
