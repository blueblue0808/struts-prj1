package cn.edu.zjut.service;
import cn.edu.zjut.bean.UserBean;
//import cn.edu.zjut.service.IUserService;
public class UserService{
    public boolean login(UserBean loginUser) {
        if (loginUser.getUsername().equals(loginUser.getPassword())){
            return true;
        }
        return false;
    }
    public boolean register(UserBean loginUser) {
        if (loginUser.getUsername().equals(loginUser.getPassword())
                &&loginUser.getRepassword().equals(loginUser.getPassword())
                &&loginUser.getUsername()!=""){
            return true;
        }
        return false;
    }
}
