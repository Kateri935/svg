public class Point {
    public double x=5;

    public double   y=10;

    public String toString(){
        String napis ="x="+ this.x + " y="+y;
        return napis;
    }
public  String toSvg(){
        String napis =
            "<circle r=\"45\" cx=\"" +x+ "\" cy=\""+ y +"\" fill=\"red\" />";
        return napis;
}
public void translate(){
        double dx= 2;
        double dy=4;
       x += dx;
        y += dy;

    }
    public class Segment{
        public double x =point.x;
        public double y =point.y;
    }
}
