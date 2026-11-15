package inheritance;

import objects.Rectangles;

public class Square extends Rectangles{
    @Override 
    public double calculatePerimeter(){
        return sides * length;
    }

    public void print(String what){
        System.out.println("I am a " + what);
    }
}
