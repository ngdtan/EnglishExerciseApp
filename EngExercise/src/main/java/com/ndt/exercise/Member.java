/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ndt.exercise;

import java.text.ParseException;

import java.util.Date;

/**
 *
 * @author pc
 */
public class Member {

    public static int dem = 0;
    private int idMember = ++dem;
    private String name;
    private String homeTown;
    private String gender;
    private Date dateOfBirth;
    private Date joinDate;
    private double pointOfMember = 0;

    public Member() {
    }

    public Member(String name, String homeTown, String gender, Date dateOfBirth, Date joinDate, double pointOfMember) {
        this.name = name;
        this.homeTown = homeTown;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.joinDate = joinDate;
        this.pointOfMember = pointOfMember;
    }

    public Member(String name, String homeTown, String gender, String dateOfBirth, String joinDate, double pointOfMenber) throws ParseException {
        this(name, homeTown, gender, Configure.f.parse(dateOfBirth), Configure.f.parse(joinDate), pointOfMenber);
    }

    public void output() {
        System.out.printf("Ma hoc vien: %d\n", this.idMember);
        System.out.printf("Ho ten: %s\n", this.name);
        System.out.printf("Que quan: %s\n", this.homeTown);
        System.out.printf("Gioi tinh: %s\n", this.gender);
        System.out.printf("Ngay sinh: %s\n", Configure.f.format(this.dateOfBirth));
        System.out.printf("Ngay tham gia: %s\n\n", Configure.f.format(this.joinDate));
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
     * @return the homeTown
     */
    public String getHomeTown() {
        return homeTown;
    }

    /**
     * @param homeTown the homeTown to set
     */
    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the dateOfBirth
     */
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @return the joinDate
     */
    public Date getJoinDate() {
        return joinDate;
    }

    /**
     * @param joinDate the joinDate to set
     */
    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    /**
     * @return the pointOfMember
     */
    public double getPointOfMember() {
        return pointOfMember;
    }

    /**
     * @param pointOfMember the pointOfMember to set
     */
    public void setPointOfMember(double pointOfMember) {
        this.pointOfMember = pointOfMember;
    }

    /**
     * @return the idMember
     */
    public int getIdMember() {
        return idMember;
    }

    /**
     * @param idMember the idMember to set
     */
    public void setIdMember(int idMember) {
        this.idMember = idMember;
    }
}
