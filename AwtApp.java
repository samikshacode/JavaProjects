import java.awt.*;  
public class AwtApp extends Frame {  
AwtApp(){
     Label firstname = new Label("First Name");  
     firstname.setBounds(20, 50, 80, 20);  
     Label lastname = new Label("last Name"); 
     lastname.setBounds(20, 80, 80, 20); 
     Label dob = new Label(" date of birth"); 
     dob.setBounds(20, 110, 80, 20); 

    TextField firstnameTF=new TextField();
    firstnameTF.setBounds(120, 50, 100, 20);
    TextField lastnameTF=new TextField();
    lastnameTF.setBounds(120, 80, 100, 20);
    TextField dobTF=new TextField();
    dobTF.setBounds(120, 110, 100, 20);
   
    Button submit=new Button("Submit");
    submit.setBounds(20, 160, 100, 30);
    Button rst=new Button("Reset");
    rst.setBounds(120,160,100,30);    

    add(firstname);
    add(lastname);
    add(dob);
    add(firstnameTF);
    add(lastnameTF);
    add(dobTF);
    add(submit);
    add(rst);
    setSize(300,300);
    setLayout(null);
    setVisible(true);
}
public static void main(String[] args) {  
    
    AwtApp a = new AwtApp();  
      
    }  
}