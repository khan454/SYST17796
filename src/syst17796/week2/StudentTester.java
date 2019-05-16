/*
    Name:  Jawad Khan
    Assignment:  [assignment name]
    Program: [your program name here]
    Date:  [assignment due date here]

    Description:
    [program description in your own words]
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package syst17796.week2;

/**
 *
 * @author Jawad
 */
public class StudentTester {
    public static void main(String[] args) {
        StudentTemplateClass s1 = new StudentTemplateClass();
        s1.setName("Noor");
        //System.out.println(s1.getName());
        
        StudentTemplateClass s2 = new StudentTemplateClass();
        s2.setName("Nabeel");
        
        StudentTemplateClass s3 = new StudentTemplateClass();
        s3.setName("Ssong");
        
        StudentTemplateClass[] list = new StudentTemplateClass[3];
        list[0] = s1;
        list[1] = s2;
        list[2] = s3;
        
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i].getName());
        }
    }
}
