
public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!\n");

//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
        Point point = new Point( 5,  3);
        System.out.println(point.getX() + " " + point.getY());
//        point.x =7;
        point.setX(7);
        System.out.println(point.getX() + " " + point.getY());
        System.out.println(point.toString());
        System.out.println(point.toSvg());
//        System.out.println(point.translate());
    }

}//aa