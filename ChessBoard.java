import javax.swing.*;
import java.awt.*;
public class ChessBoard extends JFrame {
    public ChessBoard()
    {
        setTitle("Chess Board");
        setSize(400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(8,8));
        //creating a 8*8 board
        for(int i=0;i<8;i++)
        {
            for(int j=0;j<8;j++)
            {
                JPanel Square = new JPanel();
                if((i+j)%2==0)
                {
                    Square.setBackground(Color.white);
                }
                else
                {
                    Square.setBackground(Color.black);
                }
                add(Square);
            }
        }
        setVisible(true);
    }

    public static void main(String[] args) {
        ChessBoard chess = new ChessBoard();
    }
}
