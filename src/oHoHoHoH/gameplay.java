package oHoHoHoH;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class gameplay<lengthofsnake> extends JPanel implements KeyListener, ActionListener {

    private int[] snakeXlength = new int[750];
    private int[] snakeYlength = new int[750];


    private boolean left = false;
    private boolean right = false;
    private boolean up = false;
    private boolean down = false;

    private  ImageIcon rightmouth;
    private  ImageIcon downmouth;
    private  ImageIcon upmouth;
    private  ImageIcon leftmouth;

    private lengthofsnake = 3 ;

    private Timer timer;
    private int delay = 100;

    private ImageIcon snakeimage;

    private  ImageIcon titleImage;



    public gameplay(){
        addKeyListener( this );
        setFocusable( true );
        setFocusTraversalKeysEnabled( false );
        timer = new Timer(delay, this);
        timer.start();

    }
    public void paint(Graphics graphics){

        // draw title Image border

        graphics.setColor( Color.BLUE );
        graphics.drawRect( 24, 10, 851, 55 );

        // draw title Image

      //  titleImage = new ImageIcon( *snaketitle.jpg* );
        titleImage.paintIcon( this, graphics, 25, 11 );

        graphics.setColor( Color.BLUE );
        graphics.drawRect( 24, 74, 851, 577 );

        // draw Background for gameplay

        graphics.setColor( Color.BLACK );
        graphics.fillRect( 25, 75, 850, 575 );

        rightmouth = new ImageIcon( "rightmouth.png" );
        rightmouth.paintIcon( this, graphics, snakeXlength[0], snakeYlength[0] );

        graphics.dispose();

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {

    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}
