/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.poly.Helper;

import java.awt.Color;
import javax.swing.JTextField;

/**
 *
 * @author QUANGC
 */
public class notificationError {
    public static void DataAvailable(JTextField field, StringBuilder sb, String errorMeesage){
        if (field.getText().equals("")) {
                sb.append(errorMeesage).append("\n");
                field.setBackground(Color.red);
                field.requestFocus();
            } else {
                field.setBackground(Color.WHITE);
            }
    }
}
