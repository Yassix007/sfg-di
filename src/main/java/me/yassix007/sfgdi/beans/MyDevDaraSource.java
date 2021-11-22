package me.yassix007.sfgdi.beans;

public class MyDevDaraSource {

    private String ipAddress;
    private String userName;
    private String password;


    public MyDevDaraSource(String ipAddress, String userName, String password) {
        this.ipAddress = ipAddress;
        this.userName = userName;
        this.password = password;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
