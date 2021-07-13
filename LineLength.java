public class LineLength {
      public static void main(String[]args){
           System.out.println("Welcome to line comparison");
           int x1,x2,y1,y2;
           double dis;
x1=1;x2=4;y1=1;y2=4;
dis=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
System.out.println("distancebetween" + "("+x1+", "+y1+"),"+"("+x2+"+, "+y2+")===>"+dis);
}
}
