package parking_guidance_system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;



public class CustomerExit extends JFrame implements ActionListener{
    JPanel background;
    JLabel name, plateNo, carColor, entryId, time, amount, ticketId, spot;
    JTextField n, p, c, en, t, a, ticket, spott;
    JButton enter, submit;
    ImageIcon icon = new ImageIcon("src/parking_guidance_system/ParkingIcon.png");
    
    public CustomerExit() {
        
        /* Labels */
        ticketId = new JLabel();
        ticketId.setText("Ticket Id: ");
        ticketId.setForeground(Color.white);
        ticketId.setFont(new Font("Tahoma", Font.BOLD, 20));
        ticketId.setBounds(390, 30, 200, 90);
        
        name = new JLabel();
        name.setText("Name: ");
        name.setForeground(Color.white);
        name.setFont(new Font("Tahoma", Font.BOLD, 20));
        name.setBounds(390, 245, 200, 90);
        
        entryId = new JLabel();
        entryId.setText("Entry Id: ");
        entryId.setForeground(Color.white);
        entryId.setFont(new Font("Tahoma", Font.BOLD, 20));
        entryId.setBounds(390, 190, 200, 90);
        
        plateNo = new JLabel();
        plateNo.setText("Plate Number: ");
        plateNo.setForeground(Color.white);
        plateNo.setFont(new Font("Tahoma", Font.BOLD, 20));
        plateNo.setBounds(390, 300, 200, 90);
        
        carColor = new JLabel();
        carColor.setText("Car Color: ");
        carColor.setForeground(Color.white);
        carColor.setFont(new Font("Tahoma", Font.BOLD, 20));
        carColor.setBounds(390, 355, 200, 90);
        
        time = new JLabel();
        time.setText("Total Time: ");
        time.setForeground(Color.white);
        time.setFont(new Font("Tahoma", Font.BOLD, 20));
        time.setBounds(390, 410, 200, 90);
        
        amount = new JLabel();
        amount.setText("Total Amount: ");
        amount.setForeground(Color.white);
        amount.setFont(new Font("Tahoma", Font.BOLD, 20));
        amount.setBounds(390, 465, 200, 90);
        
        spot = new JLabel();
        spot.setText("Your Spot: ");
        spot.setForeground(Color.white);
        spot.setFont(new Font("Tahoma", Font.BOLD, 20));
        spot.setBounds(615, 30, 200, 90);
        
        /* Text Fields */
        n = new JTextField();
        c = new JTextField();
        en = new JTextField();
        p = new JTextField();
        t = new JTextField();
        a = new JTextField();
        ticket = new JTextField();
        
        ticket.setBounds(510, 60, 50, 30);
        ticket.setFont(new Font("Tahome", Font.BOLD, 16));
        ticket.setForeground(new Color(192, 0, 48));
        ticket.setHorizontalAlignment(JTextField.CENTER);
        ticket.setBackground(Color.white);
        ticket.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        
        n.setBounds(570, 277, 220, 30);
        n.setFont(new Font("Tahome", Font.PLAIN, 16));
        n.setForeground(new Color(192, 0, 48));
        n.setHorizontalAlignment(JTextField.CENTER);
        n.setBackground(Color.white);
        n.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        n.setEditable(false);
        
        p.setBounds(570, 332, 220, 30);
        p.setFont(new Font("Tahome", Font.PLAIN, 16));
        p.setForeground(new Color(192, 0, 48));
        p.setHorizontalAlignment(JTextField.CENTER);
        p.setBackground(Color.white);
        p.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        p.setEditable(false);
        
        c.setBounds(570, 387, 220, 30);
        c.setFont(new Font("Tahome", Font.PLAIN, 16));
        c.setForeground(new Color(192, 0, 48));
        c.setHorizontalAlignment(JTextField.CENTER);
        c.setBackground(Color.white);
        c.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        c.setEditable(false);
        
        en.setBounds(570, 222, 220, 30);
        en.setFont(new Font("Tahome", Font.PLAIN, 16));
        en.setForeground(new Color(192, 0, 48));
        en.setHorizontalAlignment(JTextField.CENTER);
        en.setBackground(Color.white);
        en.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        en.setEditable(false);
        
        t.setBounds(570, 442, 220, 30);
        t.setFont(new Font("Tahome", Font.PLAIN, 16));
        t.setForeground(new Color(192, 0, 48));
        t.setHorizontalAlignment(JTextField.CENTER);
        t.setBackground(Color.white);
        t.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        t.setEditable(false);
        
        a.setBounds(570, 497, 220, 30);
        a.setFont(new Font("Tahome", Font.PLAIN, 16));
        a.setForeground(new Color(192, 0, 48));
        a.setHorizontalAlignment(JTextField.CENTER);
        a.setBackground(Color.white);
        a.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        a.setEditable(false);
        
        spott = new JTextField();
        spott.setBounds(750, 60, 50, 30);
        spott.setFont(new Font("Tahome", Font.BOLD, 16));
        spott.setForeground(new Color(192, 0, 48));
        spott.setHorizontalAlignment(JTextField.CENTER);
        spott.setBackground(Color.white);
        spott.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
        
        /* Buttons */
        enter = new JButton();
        enter.setBounds(465, 600, 250, 50);
        enter.addActionListener(this);
        enter.setText("Thanks");
        enter.setFocusable(false);
        enter.setFont(new Font("Tahoma", Font.BOLD, 20));
        enter.setForeground(Color.white);
        enter.setBackground(new Color(192, 0, 48));
        enter.setBorder(BorderFactory.createEtchedBorder());
        enter.setBorderPainted(false);
        
        submit = new JButton();
        submit.setBounds(515, 120, 140, 60);
        submit.addActionListener(this);
        submit.setText("Submit");
        submit.setFocusable(false);
        submit.setFont(new Font("Tahoma", Font.BOLD, 20));
        submit.setForeground(Color.white);
        submit.setBackground(new Color(192, 0, 48));
        submit.setBorder(BorderFactory.createEtchedBorder());
        submit.setBorderPainted(false);
        
        /* Panel */
        background = new JPanel();
        background.setLayout(null);
        background.setBackground(new Color(40, 43, 48));
        background.setBounds(0, 0, 1200, 800);
        background.add(entryId); background.add(plateNo); background.add(time);
        background.add(name); background.add(carColor); background.add(amount);
        background.add(n); background.add(p); background.add(c);  
        background.add(t); background.add(a); background.add(en); background.add(submit);
        background.add(enter); background.add(ticket); background.add(ticketId);
        background.add(spot); background.add(spott);
        
        /* Frame */
        this.setTitle("Customer Exit");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(350, 100);
        this.setLayout(null);
        this.setSize(1200, 800);
        this.setResizable(false);
        this.setIconImage(icon.getImage());
        this.add(background);
        this.setVisible(true); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == submit) {
            int fileName = Integer.parseInt(ticket.getText());
            String spotName = spott.getText();
            int x = 0;
            
            for (int i = 0; i < 60; i++) {
                File fileThere = new File("D:\\busySpots"+ i);
                if (fileThere.exists())
                x++;    
            }
            
            String [] args = new String[]{"D:\\busySpots"+ x ,"D:\\busySpots"+ (x+1) ,""+ spotName , ""};  
            File sourceFile = new File(args[0]);
            File targetFile = new File(args[1]);
            try (
              // Create input and output files
              Scanner inputSource = new Scanner(sourceFile);
              PrintWriter outputTarget = new PrintWriter(targetFile);
            ) {        
              while (inputSource.hasNext()) {
                String s1 = inputSource.nextLine();
                String s2 = s1.replaceAll(args[2], args[3]);
                outputTarget.println(s2);
              }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(CustomerExit.class.getName()).log(Level.SEVERE, null, ex);
            }
              
            String id = null, name = null, plateNumber = null, color = null, spot = null;
            long timeIn = 0;
            double totalAmount;
            
            File file = new File("D:\\" + fileName);
            
            File file2 = new File("D:\\ParkedCars");
            FileWriter fw2;
            Date thisDate = new Date();
            String currenttime = new SimpleDateFormat("hh:mm").format(thisDate);

            // Create a Scanner for the file
            Scanner input;
            try {
                input = new Scanner(file);
                
                // Read data from a file
                while (input.hasNext()) {
                    id = input.nextLine();
                    name = input.nextLine();
                    plateNumber = input.nextLine();
                    color = input.nextLine();
                    spot = input.nextLine();
                    timeIn = input.nextLong();
//                    spot = input.nextLine();
                }

                en.setText(id);
                n.setText(name);
                p.setText(plateNumber);
                c.setText(color);
                
                Date date = new Date();
                long timeOut = date.getTime();
                int totalTime = (int)((timeOut - timeIn) / 1000);
                int timeHours = (totalTime % 86400) / 3600;
                int timeMin = ((totalTime % 86400) % 3600) / 60;
                totalAmount = (double)totalTime * 20 / 3600;
                    
                t.setText(Integer.toString(timeHours) + ":" + Integer.toString(timeMin));
                a.setText(Double.toString(totalAmount) + "$");
                
                
                fw2 = new FileWriter(file2.getAbsoluteFile(), true);
                BufferedWriter bw2 = new BufferedWriter(fw2);
                bw2.write(currenttime + " / " + Double.toString(totalAmount) + "$");
                bw2.newLine();
                
                bw2.close();
                input.close();
            } catch (FileNotFoundException ex) {
                Logger.getLogger(CustomerExit.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(CustomerExit.class.getName()).log(Level.SEVERE, null, ex);
            }  
        }
        
        if(e.getSource() == enter) {
            this.dispose();
        }
    }
}