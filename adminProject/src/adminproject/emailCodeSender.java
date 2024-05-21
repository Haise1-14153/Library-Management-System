/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adminproject;

import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

/**
 *
 * @author Azcuna
 */
public class emailCodeSender {
    static Session session = null;
    
    public boolean sendCode(String email,int Code,String msg) {
        final String username = "librarymanagementsystem56@gmail.com";
        final String password = "wgneowiopepjaheo";
        String from = "librarymanagementsystem56@gmail.com";
        
        //create server
        Properties propertise = new Properties();
        propertise.put("mail.smtp.auth", "true");
        propertise.put("mail.smtp.starttls.enable", "true");
        propertise.put("mail.smtp.host","smtp.gmail.com");
        propertise.put("mail.smtp.port","587");
        session= Session.getInstance(propertise,new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
               return new PasswordAuthentication(username, password);
            }
        });
        
        //send message
        try {
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(email));
            message.setSubject("Library Management System Code");
            String text = msg+Code;
            message.setText(text);
            Transport.send(message);
        } catch (MessagingException e) {
            JOptionPane.showMessageDialog(null,"Invalid email address format.","Error",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
}
