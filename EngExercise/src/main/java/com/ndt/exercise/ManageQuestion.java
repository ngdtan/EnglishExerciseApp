/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ndt.exercise;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pc
 */
public class ManageQuestion {

    private List question = new ArrayList<>();

//    public void DocDs() throws FileNotFoundException {
//        File f = new File("src/main/resources/question.txt");
//        try ( Scanner sc = new Scanner(f)) {
//            while (sc.hasNext()) {
//                Question q = new MultiChoice();
//                q.setContent(sc.nextLine());
//                Choice c = new Choice();
//
//            }
//        }
//
//    }

    /**
     * @return the question
     */
    public List getQuestion() {
        return question;
    }

    /**
     * @param question the question to set
     */
    public void setQuestion(List question) {
        this.question = question;
    }

}
