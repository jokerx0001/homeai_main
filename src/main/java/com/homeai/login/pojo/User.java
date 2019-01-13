package com.homeai.login.pojo;

public class User {

    private String name;
    private int age;
    private String sex;
    private int sysLv;

    public User() {

    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return the sysLv
     */
    public int getSysLv() {
        return sysLv;
    }

    /**
     * @param sysLv the sysLv to set
     */
    public void setSysLv(int sysLv) {
        this.sysLv = sysLv;
    }

}
