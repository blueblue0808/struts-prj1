package cn.edu.zjut.action;
import com.opensymphony.xwork2.ActionSupport;
import cn.edu.zjut.bean.UserBean;
import cn.edu.zjut.service.UserService;
//import cn.edu.zjut.service.IUserService;
public class UserAction extends ActionSupport{
    private UserBean loginUser;
    //private IUserService userService = null;
    public UserBean getLoginUser() {
        return loginUser;
    }
    public void setLoginUser(UserBean loginUser) {
        this.loginUser = loginUser;
    }
//    public void setUserService(IUserService userService) {
//        this.userService = userService;
//    }
//    public String execute() {
//        UserService userServ = new UserService();
//        if (userServ.login(loginUser)) {
//            return "success";
//        }
//        return "fail";
//    }
//    public String execute() {
//        if (userService.login(loginUser)) {
//            return "success";
//        }
//        return "fail";
//    }
//public String execute() {
//    if (userService.register(loginUser)) {
//        return "regsuccess";
//    }
//    return "regfail";
//}
//用于验证
public void validateLogin() {
    String username = loginUser.getUsername();
    String pwd = loginUser.getPassword();
    if (username == null || username .equals("")) {
        this.addFieldError("loginUser.username", "请输入您的用户名！");
    }
    if (pwd == null || pwd.equals("")) {
        this.addFieldError("loginUser.password", "请输入您的密码！");
    }
}
    public String login() {  //用于登录
        UserService userServ = new UserService();
        if (userServ.login(loginUser)) {
            this.addActionMessage("登录成功！");
            return "success"; }
//        return "fail";
        else {
            this.addActionError("用户名或密码错误，请重新输入！");
            return "fail";
        }
    }
    public String register() {  //用于注册
        UserService userServ = new UserService();
        if (userServ.register(loginUser)) {
            return "regsuccess"; }
        return "regfail";
    }

    //用于通配符Action
//    public String login() {  //用于登录
//        UserService userService = new UserService();
//        if (userService.login(loginUser)) {
//            return "loginsuccess"; }
//        return "loginfail";
//    }
//    public String register() {  //用于注册
//        UserService userService = new UserService();
//        if (userService.register(loginUser)) {
//            return "registersuccess"; }
//        return "registerfail";
//    }


}
