package me.yassix007.sfgdi.beans;

public class MyDaraSource {

    private String ipAddress;
    private String userName;
    private String password;
    private String envVariable;

    public String getEnvVariable() {
        return envVariable;
    }

    public void setEnvVariable(String envVariable) {
        this.envVariable = envVariable;
    }

    public MyDaraSource(String ipAddress, String userName, String password, String envVariable) {
        this.ipAddress = ipAddress;
        this.userName = userName;
        this.password = password;
        this.envVariable = envVariable;
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
