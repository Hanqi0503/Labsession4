/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import javax.swing.ImageIcon;

/**
 *
 * @author hanqi
 */
public class User {
    String FirstName;
    String LastName ;
    String Age ;
    String Email ;
    String Message;
    String Gender;
    String PatientType;
    private ImageIcon Photo;
    public ImageIcon getUserImage() {
        return Photo;
    }

    public void setUserImage(ImageIcon userImage) {
        this.Photo = Photo;
    }
    
    public String getFirstName(){
        return FirstName;
    }
    
    public void setFirstName(String FirstName){
        this.FirstName = FirstName;
    }
    
    public String getLastName(){
        return LastName;
    }
    
    public void setLastName(String LastName){
        this.LastName = LastName;
    }
    
    public String getAge(){
        return Age;
    }
    
    public void setAge(String Age){
        this.Age = Age;
    }
    
    public String getEmail(){
        return Email;
    }
    
    public void setEmail(String Email){
        this.Email = Email;
    }
    
    public String getMessage(){
        return Message;
    }
    
    public void setMessage(String Message){
        this.Message = Message;
    }
    
    public String getGender(){
        return Gender;
    }
    
    public void setGender(String Gender){
        this.Gender = Gender;
    }
    
    public String getPatientType(){
        return PatientType;
    }
    
    public void setPatientType(String PatientType){
        this.PatientType = PatientType;
    }
}
