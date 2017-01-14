/**
 * Rohan is awesome and made the program Car1
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.*;
public class Car extends JFrame{
    //Declaring Variables
    int xPosition;
    JLabel carImage;
    JButton moveButton;
    JButton redButton;
    JButton blueButton;
    JButton blackButton;
    JButton restartButton;
    int color;
    //Declaring Functions
    public void carMove(){
        xPosition = carImage.getX();
        carImage.setLocation(xPosition + 20, 250);
    }
    public void changeColor(int color){
        if(color == 0){
           carImage.setIcon(new ImageIcon("/Users/Rohan/Downloads/car-64.png"));
        }
        if(color == 1){
            carImage.setIcon(new ImageIcon("/Users/Rohan/Downloads/car-64 (1).png"));
        }
        if(color == 2){
            carImage.setIcon(new ImageIcon("/Users/Rohan/Downloads/car-64 (2).png"));
        }
        this.color = color;
    }
    public void getColor(){
        if(this.color == 0){
            System.out.println("Black");
        }
        if(this.color == 1){
            System.out.println("Blue");
        }
        if(this.color == 2){
            System.out.println("Red");
        }
    }
    public Car(){
        //Defining Variables
        carImage = new JLabel(new ImageIcon("/Users/Rohan/Downloads/car-64.png"));
        moveButton = new JButton("Move");
        redButton = new JButton("Red");
        blueButton = new JButton("Blue");
        blackButton = new JButton("Black");
        restartButton = new JButton("Restart");
        //Initializing
        carImage.setVisible(true);
        setSize(2000,1000);
        carImage.setLayout(null);
        setLayout(null);
        carImage.setLocation(10,250);
        carImage.setSize(64,64);
        add(carImage);
        moveButton.setLayout(null);
        moveButton.setSize(100,100);
        moveButton.setLocation(500,100);
        add(moveButton);
        moveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                carMove();
            }
        });
        redButton.setLayout(null);
        redButton.setSize(100,100);
        redButton.setLocation(610,100);
        add(redButton);
        redButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeColor(2);
            }
        });
        blueButton.setLayout(null);
        blueButton.setSize(100,100);
        blueButton.setLocation(720,100);
        add(blueButton);
        blueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeColor(1);
            }
        });
        blackButton.setLayout(null);
        blackButton.setSize(100,100);
        blackButton.setLocation(830,100);
        add(blackButton);
        blackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                changeColor(0);
            }
        });
        restartButton.setSize(100,100);
        restartButton.setLocation(340,100);
        add(restartButton);
        restartButton.setLayout(null);
        restartButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                carImage.setLocation(10,250);
            }
        });
        setVisible(true);
    }
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2 = (Graphics2D) g;
        Line2D lin = new Line2D.Float(0, 340, 2000, 340);
        g2.draw(lin);
    }
}
