import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;



class MyCalc extends WindowAdapter implements ActionListener {




    Frame f ;
    Label l1,l2;
    JButton  b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    JButton badd,bsub,bmult,bdiv,bmod,bcalc,bclr,bpts,bneg,bback,bBackG;


    double xd;
    String result;
    double num1,num2,check;






        MyCalc() {
            f = new Frame("Einfacher Rechner");
            l1 = new Label();
            l2 = new Label();



            //---------- Set Background -------------
            l1.setBackground(Color.lightGray);
            l1.setBounds(50, 50, 270, 60);

            l2.setBackground(Color.lightGray);
            l2.setBounds(40, 50, 250, 60);

            f.setBackground(new Color(0, 36, 107));








            //---------- Set Button of Number -------------

            b1 = new JButton("1");
            b1.setFocusPainted(false);
            b1.setBounds(50, 340, 50, 50);


            b2 = new JButton("2");
            b2.setFocusPainted(false);
            b2.setBounds(120, 340, 50, 50);

            b3 = new JButton("3");
            b3.setFocusPainted(false);
            b3.setBounds(190, 340, 50, 50);

            b4 = new JButton("4");
            b4.setFocusPainted(false);
            b4.setBounds(50, 270, 50, 50);

            b5 = new JButton("5");
            b5.setFocusPainted(false);
            b5.setBounds(120, 270, 50, 50);

            b6 = new JButton("6");
            b6.setFocusPainted(false);
            b6.setBounds(190, 270, 50, 50);

            b7 = new JButton("7");
            b7.setFocusPainted(false);
            b7.setBounds(50, 200, 50, 50);

            b8 = new JButton("8");
            b8.setFocusPainted(false);
            b8.setBounds(120, 200, 50, 50);

            b9 = new JButton("9");
            b9.setFocusPainted(false);
            b9.setBounds(190, 200, 50, 50);

            b0 = new JButton("0");
            b0.setFocusPainted(false);
            b0.setBounds(120, 410, 50, 50);



            //---------- Set button -------------

            badd = new JButton("+");
            badd.setBounds(260, 340, 50, 50);

            bsub = new JButton("-");
            bsub.setBounds(260, 270, 50, 50);

            bmult = new JButton("*");
            bmult.setBounds(260, 200, 50, 50);

            bdiv = new JButton("/");
            bdiv.setBounds(260, 130, 50, 50);

            bmod = new JButton("%");
            bmod.setBounds(190, 130, 50, 50);

            bcalc = new JButton("=");
            bcalc.setBounds(245, 410, 65, 50);

//            --------------------------------------
            bclr = new JButton("CE");
            bclr.setBounds(50, 130, 65, 50);

            bpts = new JButton(".");
            bpts.setBounds(190, 410, 50, 50);

            bneg = new JButton("+/-");
            bneg.setBounds(50, 410, 50, 50);

            bback = new JButton("Back");
            bback.setBounds(120, 130, 50, 50);


            bBackG = new JButton("Change Background");
            bBackG.setBounds(85,480,165,50);
//            ----------- Add ActionListener ---------

            b0.addActionListener(this);
            b1.addActionListener(this);
            b2.addActionListener(this);
            b3.addActionListener(this);
            b4.addActionListener(this);
            b5.addActionListener(this);
            b6.addActionListener(this);
            b7.addActionListener(this);
            b8.addActionListener(this);
            b9.addActionListener(this);


            badd.addActionListener(this);
            bsub.addActionListener(this);
            bmult.addActionListener(this);
            bdiv.addActionListener(this);

            bmod.addActionListener(this);

            bcalc.addActionListener(this);
            bclr.addActionListener(this);
            bpts.addActionListener(this);
            bneg.addActionListener(this);
            bback.addActionListener(this);

            bBackG.addActionListener(this);


//            ------------ Add to Frame ------------
            f.addWindowListener(this);

            f.add(l1);
            f.add(l2);

            f.add(b0);
            f.add(b1);
            f.add(b2);
            f.add(b3);
            f.add(b4);
            f.add(b5);
            f.add(b6);
            f.add(b7);
            f.add(b8);
            f.add(b9);

            f.add(badd);
            f.add(bsub);
            f.add(bmult);
            f.add(bdiv);
            f.add(bmod);
            f.add(bcalc);
            f.add(bclr);
            f.add(bpts);
            f.add(bneg);
            f.add(bback);

//            f.add(bBackG);

            f.setSize(360, 500);
            f.setLayout(null);
            f.setVisible(true);
            f.setResizable(false);
            f.setLocationRelativeTo(null);


        }
//        --------- for Closing The Window ---------
     public void windowClosing(WindowEvent e){
                f.dispose();
     }
     public void actionPerformed(ActionEvent e){
            String z,zt;

//   ------------ Number ------------
         if(e.getSource()==b1) {
             zt = l1.getText();
             z = zt + "1";
             l1.setText(z);

         }

         if(e.getSource()==b2){
             zt=l1.getText();
             z=zt+"2";
             l1.setText(z);
         }
         if(e.getSource()==b3){
             zt=l1.getText();
             z=zt+"3";
             l1.setText(z);
         }
         if(e.getSource()==b4){
             zt=l1.getText();
             z=zt+"4";
             l1.setText(z);
         }
         if(e.getSource()==b5){
             zt=l1.getText();
             z=zt+"5";
             l1.setText(z);
         }
         if(e.getSource()==b6){
             zt=l1.getText();
             z=zt+"6";
             l1.setText(z);
         }
         if(e.getSource()==b7){
             zt=l1.getText();
             z=zt+"7";
             l1.setText(z);
         }
         if(e.getSource()==b8){
             zt=l1.getText();
             z=zt+"8";
             l1.setText(z);
         }
         if(e.getSource()==b9){
             zt=l1.getText();
             z=zt+"9";
             l1.setText(z);
         }
         if(e.getSource()==b0){
             zt=l1.getText();
             z=zt+"0";
             l1.setText(z);
         }


             if(e.getSource()==bpts){  //ADD DECIMAL PTS
                 zt=l1.getText();
                 z=zt+".";
                 l1.setText(z);
             }

             if(e.getSource()==bneg){ //Negativ
                 zt= l1.getText();
                 z="-"+zt;
                 l1.setText(z);

             }

             if (e.getSource()==bback){  //FOR  BACKSPACE
                 zt=l1.getText();
                 try{
                     z=zt.substring(0,zt.length()-1);
                 }catch (StringIndexOutOfBoundsException f){return;}
                 l1.setText(z);
             }


             if (e.getSource()==badd){ //FOR ADDITION

                 try{
                     num1=Double.parseDouble(l1.getText());

                 }catch (NumberFormatException f){
                     l1.setText("Invalid Format");
                 return;
                 }
                 z="";
                 l1.setText(z);
                 check=1;
             }


             if (e.getSource()==bsub){    //FOR SUBTRACTION
                 try {
                     num1=Double.parseDouble(l1.getText());
                 }catch (NumberFormatException f){
                     l1.setText("Invalid Format");
                     return;
                 }
                 z="";
                 l1.setText(z);
                 check=2;
             }


             if (e.getSource()==bmult){    //FOR MULTIPLICATION
                 try {
                     num1=Double.parseDouble(l1.getText());
                 }catch (NumberFormatException f){
                     l1.setText("Invalid Format");
                     return;
                 }
                 z="";
                 l1.setText(z);
                 check=3;
             }

             if (e.getSource()==bdiv){     //FOR DIVISION
                 try {
                     num1=Double.parseDouble(l1.getText());
                 }catch (NumberFormatException f){
                     l1.setText("Invalid Format");
                     return;
                 }
                 z="";
                 l1.setText(z);
                 check=4;
             }

             if(e.getSource()==bmod){      //FOR MOD/REMAINDER
                 try{
                     num1=Double.parseDouble(l1.getText());
                 }catch(NumberFormatException f){
                     l1.setText("Invalid Format");
                     return;
                 }
                 z="";
                 l1.setText(z);
                 check=5;
             }

             // Result Button

             if (e.getSource()==bcalc){
                 try {
                     num2=Double.parseDouble(l1.getText());
                 }catch (Exception f){
                     l1.setText("Enter Number First");
                     return;
                 }
                if (check==1){
                    xd = num1+num2;
                 result = num1 + " + " + num2 + " = " + xd;}

                 else if (check==2){
                     xd = num1-num2;
                 result = num1 + " - " + num2 + " = " + xd;}

                 else if (check==3){
                     xd = num1*num2;
                 result = num1 + " * " + num2 + " = " + xd;}

                 else if  (check==4){
                     xd = num1/num2;
                 result = num1 + " / " + num2 + " = " + xd;}

                 else if (check==5){
                     xd = num1 % num2;
                 result = num1 + " % " + num2 + " = " + xd;}

                 else{
                     result = "Enter Number";
                 }

                 l1.setText(result);
             }
             //FOR CLEARING THE LABEL and Memory
             if (e.getSource()==bclr){
                 num1=0;
                 num2=0;
                 xd=0;
                 z="";
                 l1.setText(z);
             }



     }

    public static void main(String args[]){
            new MyCalc();


    }


}



