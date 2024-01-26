package cn.edu.zjut.bean;

import java.util.Date;

public class UserBean {
    private String username="";
    private String password="";
    private String repassword="";
    private String name="";
    private String sex="";
    //private String birthday="";
    private Date birthday=null;
    private String address="";
    private String phone="";
    private String email="";
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username= username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getSex() {
        return sex;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

//    public String getBirthday() {
//        return birthday;
//    }

    public Date getBirthday() {
        return birthday;
    }
    public String getRepassword() {
        return repassword;
    }

//    public void setBirthday(String birthday) {
//        this.birthday = birthday;
//    }
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }
}
