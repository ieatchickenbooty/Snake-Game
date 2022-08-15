package oHoHoHoH;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        JFrame obj = new JFrame(  );
        gameplay gameplay = new gameplay();


        obj.setBounds( 10,10, 905, 700 );
        obj.setBackground( Color.GRAY );
        obj.setResizable( false );
        obj.setVisible( true );
        obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE  );
        obj.add( gameplay );
    }
}
