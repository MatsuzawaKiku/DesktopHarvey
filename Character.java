import java.awt.*;

public class Character extends Component {
    static int X;
    static int Y;
    static Image harvey;

    //constructor
    public Character(int x, int y, Image image){
        this.X = x;
        this.Y = y;
        this.harvey = image;

    }
}
