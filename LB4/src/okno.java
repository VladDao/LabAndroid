import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 
public class okno extends JFrame {
    private int count = 0;
 
    private JTextField fio = new JTextField(20);
    private JLabel metka = new JLabel("Ваше имя");
    private JLabel metkaDva = new JLabel(" ");
    
    class PushingListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            Object button = e.getSource();
 
            if(button instanceof JButton){
                count++;
                ((JButton)button).setText("Нажато " + count + " Раз");
                metkaDva.setText("Спасибо, "+fio.getText()+"!");
            }
        }
    }
    class Knopka implements ActionListener {

        public void actionPerformed(ActionEvent e) {
        Object button2 = e.getSource();
            if (button2 instanceof JButton) {
                okno.getFrames()[0].setSize(500,500);
            }

        }
    }


 
    public okno(String title)
      {
        super(title);
        SozdatxOkno();
      }
 
    private void SozdatxOkno(){
        
    	JButton button = new JButton(" Нажми меня ");
        button.setBounds(65,60,150,40);
        
        button.addActionListener(new PushingListener());

        JButton button2 = new JButton(" Нажми меня ");
        button2.setBounds(100,100,150,401);
        button2.addActionListener(new Knopka());
        metka.setBounds(15,15,95,30);
        metkaDva.setBounds(15,115,200,30);
        
        fio.setBounds(120, 15, 100, 30);
        
        getContentPane().setLayout(null);
        getContentPane().add(button);
        getContentPane().add(button2);
        getContentPane().add(metka);
        getContentPane().add(metkaDva);
        getContentPane().add(fio);
                
        setLocationRelativeTo(null);
      }
}