package com.homeai.entity;

public class AccountInfo {

    private String account;
    private String password;

    public AccountInfo(String account, String password) {
        this.account = account;
        this.password = password;
    }

    /**
     * @return the account
     */
    public String getAccount() {
        return account;
    }
    /**
     * @param account the account to set
     */
    public void setAccount(String account) {
        this.account = account;
    }
    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }
    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
