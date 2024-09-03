/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.ndt.engexercise;

import com.ndt.exercise.Configure;
import com.ndt.exercise.ManageMember;
import com.ndt.exercise.Member;
import java.text.ParseException;

/**
 *
 * @author pc
 */
public class EngExercise {

    public static void main(String[] args) throws ParseException {
        Member m1 = new Member("Nguyen Duy Tan", "Ben Tre", "Nam", "01/04/2003", "12/04/2015", 0);
        Member m2 = new Member("Tran Tuan Kiet", "Ben Luc", "Nam", "01/07/2003", "12/04/2015", 0);
        Member m3 = new Member("Tran Nguyen Minh Liem", "Ben Thanh", "Nam", "30/60/2002", "12/04/2017", 0);
        Member m4 = new Member("Tran Hoang Quan", "Ben Nha Be", "Nam", "23/09/2007", "12/04/2019", 0);
        Member m5 = new Member("Lam Thuy Chi", "Ben Ninh Kieu", "Nu", "19/12/2000", "12/04/2022", 0);
        ManageMember listMb = new ManageMember();
        listMb.addMember(m1, m2, m3, m4, m5);

        int choose;

        do {
            System.out.println("1.Xem danh sach thanh vien.");
            System.out.println("2.Dang ki thanh vien.");
            System.out.println("3.Tim thanh vien theo id.");
            System.out.println("4.Tim thanh vien theo tu khoa.");
            System.out.println("5.Xoa thanh vien.");
            System.out.println("0.Ket thuc.");
            System.out.print("Ban chon: ");
            choose = Configure.sc.nextInt();
            Configure.sc.nextLine();
            switch (choose) {
                case 1 ->
                    listMb.showMembers();
                case 2 ->
                    listMb.subscribeMember();
                case 3 ->
                    listMb.findIDMember();
                case 4 ->
                    listMb.findMember();
                case 5 ->
                    listMb.removeMember();
            }

        } while (choose != 0);

    }
}
