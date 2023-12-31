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
    int id;
    String FirstName;
    String LastName ;
    int Age ;
    String Email ;
    String Message;
    String Gender;
    String PatientType;
    private ImageIcon Photo;
    public User(int id, String name, int age) {
    this.id = id;
    this.FirstName = FirstName;
    this.LastName = LastName;
    this.Age = age;
}
    public User( String FirstName, String Lastname, int age) {
//    this.id = id;
    this.FirstName = FirstName;
    this.LastName = Lastname;
    this.Age = age;
}
    public ImageIcon getUserImage() {
        return Photo;
    }

    public void setUserImage(ImageIcon userImage) {
        this.Photo = userImage;
    }
    
    public String getFirstName(){
        return FirstName;
    }
    
    public void setFirstName(String FirstName){
        this.FirstName = FirstName;
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getLastName(){
        return LastName;
    }
    
    public void setLastName(String LastName){
        this.LastName = LastName;
    }
    
    public int getAge(){
        return Age;
    }
    
    public void setAge(int Age){
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
    public User() {
}
}
