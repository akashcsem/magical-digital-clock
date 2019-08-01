
import java.awt.Image;
import java.net.URL;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.ImageIcon;


public class NewJFrame extends javax.swing.JFrame {

    public void changeIcon() {
        URL url = getClass().getResource("image2.png");
        ImageIcon icon = new ImageIcon(url);
        Image image = icon.getImage(); 
        this.setIconImage(image);
    }
    int timeRun = 0;
    public NewJFrame() {
        initComponents();
        changeIcon();
        new Thread() {
            public void run() {
                while (timeRun == 0) {
                    Calendar cal = new GregorianCalendar();
                    
                    int hour = cal.get(Calendar.HOUR);
                    int min = cal.get(Calendar.MINUTE);
                    int sec = cal.get(Calendar.SECOND);
                    int AM_PM = cal.get(Calendar.AM_PM);
                    
                    int year = cal.get(Calendar.YEAR);
                    int month =  cal.get(Calendar.MONTH);
                    int day =  cal.get(Calendar.DATE);
                    String date = "";
                    if(day<10)
                        date += "0";
                    date += day + "-"; 
                    if(month<10)
                        date += "0";
                    date += month + "-" + year;
                    String day_night = "AM";
                    String name = "";
                    
                    if(AM_PM == 1)
                        day_night = "PM";
                    String time = "";
                    if (hour<10)
                        time = "0";
                    time += hour + ":";
                    if(min<10)
                        time += "0";
                    time += min + ":";
                    if(sec<10)
                        time += "0";
                    time += sec + " " + day_night;
                    
                    if (sec%6 > 0)
                        name += "A";
                    if (sec%6 > 1)
                        name += "K";
                    if (sec%6 > 2)
                        name += "A";
                    if (sec%6 > 3)
                        name += "S";
                    if (sec%6 > 4)
                        name += "H";
                    Clock.setText(time);
                    Name.setText(name);
                    Date.setText(date);
                }
            }
        }.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Clock = new javax.swing.JLabel();
        Name = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DIGITAL  CLOCK");
        setAlwaysOnTop(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(389, 136));
        jPanel1.setMinimumSize(new java.awt.Dimension(389, 136));

        Clock.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Clock.setForeground(new java.awt.Color(30, 195, 107));
        Clock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Clock.setText(" ");

        Name.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        Name.setForeground(new java.awt.Color(0, 0, 255));
        Name.setText(" ");

        Date.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Date.setForeground(new java.awt.Color(204, 0, 51));
        Date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Date.setText(" ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Clock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Clock, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Name, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(471, 183));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
 
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Clock;
    private javax.swing.JLabel Date;
    private javax.swing.JLabel Name;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
