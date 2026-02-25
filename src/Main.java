
public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!\n");

//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
        Point point = new Point();
        System.out.println(point.x + " " + point.y);
        point.x =7;
        System.out.println(point.x + " " + point.y);
        System.out.println(point.toString());
        System.out.println(point.toSvg());
    }
}