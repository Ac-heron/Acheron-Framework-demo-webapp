package com.herohuang.model;

public class Customer {
    private Long id;
    private String name;
    private String contact;
    private String telephone;
    private String email;
    private String remark;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public static void main(String[] args) {
        int[] num = new int[]{27,35,36,33,30,36,43,33,41,32,38,35,42};
        for (int i : num) {
            String  result= String.valueOf(((i -15)*3.5 + 22.5));
            System.out.println("输入工龄："+i+"---> 输出结果："+result+"\n");
        }
    }
}
