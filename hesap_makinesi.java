
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;


public class hesap_makinesi {      
    public static void main(String[] args) {
        
        JFrame pencere = new JFrame();
        pencere.setTitle("hesap makinesi");
        pencere.setSize(600, 550);

        JLabel num1_label = new JLabel();
        num1_label.setText("sayı1 giriniz :");
        num1_label.setBounds(20,45,80,30);
        pencere.add(num1_label);
        JLabel num2_label = new JLabel();
        num2_label.setText("sayı2 giriniz :");
        num2_label.setBounds(20,95,80,30);
        pencere.add(num2_label);

        JLabel imza = new JLabel();
        imza.setText("Onur TURAN");
        imza.setBounds(450, 450, 100, 40);
        pencere.add(imza);

        JLabel sonuc = new JLabel();
        sonuc.setText("sonuç");
        sonuc.setBounds(80, 200, 40, 30);
        pencere.add(sonuc);
        JTextArea sonuc0 = new JTextArea();
        sonuc0.setBounds(130, 200, 100, 30);
        pencere.add(sonuc0);

        JTextArea sayi1 = new JTextArea();
        sayi1.setBounds(100, 50, 140, 20);
        pencere.add(sayi1);
        JTextArea sayi2 = new JTextArea();
        sayi2.setBounds(100, 100, 140, 20);
        pencere.add(sayi2);

        int hizax = 50;
        int hizay = 320;
        int aralıkx = 150;
        int aralıky = 60;

        JButton buton = new JButton("Topla");
        buton.setBounds(hizax,hizay,120,40);
        buton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    Double asayi1 = Double.parseDouble(sayi1.getText().trim());
                    Double bsayi1 = Double.parseDouble(sayi2.getText().trim());
                    sonuc0.setText(String.valueOf(asayi1+bsayi1));
                } catch (NumberFormatException a) {

                    sayi1.setText("lütfen double giriniz");
                    sayi2.setText("lütfen double giriniz");
                }
        }});
        pencere.add(buton);
        JButton buton1 = new JButton("Çıkar");
        buton1.setBounds(hizax+aralıkx,hizay,120,40);
        buton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    Double asayi1 = Double.parseDouble(sayi1.getText().trim());
                    Double bsayi1 = Double.parseDouble(sayi2.getText().trim());
                    sonuc0.setText(String.valueOf(asayi1-bsayi1));
                } catch (NumberFormatException a) {

                    sayi1.setText("lütfen double giriniz");
                    sayi2.setText("lütfen double giriniz");
                }
        }});
        pencere.add(buton1);
        JButton buton2 = new JButton("Çarp");
        buton2.setBounds(hizax,hizay+aralıky,120,40);
        buton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    Double asayi1 = Double.parseDouble(sayi1.getText().trim());
                    Double bsayi1 = Double.parseDouble(sayi2.getText().trim());
                    sonuc0.setText(String.valueOf(asayi1*bsayi1));
                } catch (NumberFormatException a) {

                    sayi1.setText("lütfen double giriniz");
                    sayi2.setText("lütfen double giriniz");
                }
        }});
        pencere.add(buton2);
        JButton buton3 = new JButton("Böl");
        buton3.setBounds(hizax+aralıkx,hizay+aralıky,120,40);
        buton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {

                    Double asayi1 = Double.parseDouble(sayi1.getText().trim());
                    Double bsayi1 = Double.parseDouble(sayi2.getText().trim());
                    sonuc0.setText(String.valueOf(asayi1/bsayi1));
                } catch (NumberFormatException a) {

                    sayi1.setText("lütfen double giriniz");
                    sayi2.setText("lütfen double giriniz");
                }
        }});
        pencere.add(buton3);

        pencere.setLayout(null);
        pencere.setLocationRelativeTo(null);
        pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pencere.setVisible(true);
    }
    
}
