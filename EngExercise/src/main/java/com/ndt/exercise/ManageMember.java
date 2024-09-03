/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ndt.exercise;

import static com.ndt.exercise.Configure.sc;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 *
 * @author pc
 */
public class ManageMember {

    private List<Member> list = new ArrayList<>();
    private boolean check = true;
    public ManageMember() {
    }

    public void subscribeMember() throws ParseException {
        System.out.print("Ho ten: ");
        String name = Configure.sc.nextLine();
        System.out.print("Que quan: ");
        String homeTown = Configure.sc.nextLine();
        System.out.print("Gioi tinh: ");
        String gender = Configure.sc.nextLine();
        System.out.print("Ngay sinh: ");
        Date dateOfBirth = Configure.f.parse(sc.nextLine());
        System.out.print("Ngay tham gia: ");
        Date joinDate = Configure.f.parse(sc.nextLine());
        Member m = new Member(name, homeTown, gender, dateOfBirth, joinDate, 0);
        System.out.println("Dang ky thanh cong!\n");
        this.list.add(m);
    }

    public void addMember(Member... h) {
        this.list.addAll(Arrays.asList(h));
    }

    public void removeMember() {
        System.out.print("Nhap id thanh vien muon xoa: ");
        int idMember = Configure.sc.nextInt();
        Configure.sc.nextLine();
        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i).getIdMember() == idMember) {
                this.list.remove(i);
                System.out.println("Xoa thanh cong!");
                this.list.forEach(h -> h.output());
                check = true;
            }
        }
        if (check == false) {
            System.out.println("Khong tim thay thanh vien!");
        }
        
    }

    public void showMembers() {
        this.list.forEach(h -> h.output());
    }

    public void findIDMember() {
        System.out.print("Nhap id thanh vien muon tim: ");
        int idMember = Configure.sc.nextInt();
        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i).getIdMember() == idMember) {
                this.list.get(i).output();
                check = true;
            }
        }
        if(check == false){
            System.out.println("Khong tim thay thanh vien!");
        }
    }

    public void findMember() {
        System.out.print("Nhap tu khoa thanh vien muon tim: ");
        String m = Configure.sc.nextLine();
        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i).getName().equalsIgnoreCase(m) || this.list.get(i).getHomeTown().equalsIgnoreCase(m) || this.list.get(i).getGender().equalsIgnoreCase(m)) {
                this.list.get(i).output();
                check = true;
            }
        }
        if(check == false)
            System.out.println("Khong tim thay thanh vien!");
    }

    /**
     * @return the list
     */
    public List<Member> getList() {
        return list;
    }

    /**
     * @param list the list to set
     */
    public void setList(List<Member> list) {
        this.list = list;
    }
}
