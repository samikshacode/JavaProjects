import javax.swing.*;
public class SwingApp {  
    SwingApp(){  
    JFrame f = new JFrame();
    
    JLabel firstname = new JLabel("First Name"); 
    firstname.setBounds(20, 50, 80, 20); 
    JLabel lastname = new JLabel("last Name"); 
    lastname.setBounds(20, 80, 80, 20); 
    JLabel dob = new JLabel(" date of birth"); 
    dob.setBounds(20, 110, 80, 20); 

    JTextField firstnameTF=new JTextField();
    firstnameTF.setBounds(120, 50, 100, 20);
    JTextField lastnameTF=new JTextField();
    lastnameTF.setBounds(120, 80, 100, 20);
    JTextField dobTF=new JTextField();
    dobTF.setBounds(120, 110, 100, 20);
   
    JButton submit=new JButton("Submit");
    submit.setBounds(20, 160, 100, 30);
    JButton rst=new JButton("Reset");
    rst.setBounds(120,160,100,30);    

    f.add(firstname);
    f.add(lastname);
    f.add(dob);
    f.add(firstnameTF);
    f.add(lastnameTF);
    f.add(dobTF);
    f.add(submit);
    f.add(rst);
    f.setSize(300,300);
    f.setLayout(null);
    f.setVisible(true);
    }
    public static void main(String[] args)
    {
        SwingApp s=new SwingApp(); 
    }

    
}