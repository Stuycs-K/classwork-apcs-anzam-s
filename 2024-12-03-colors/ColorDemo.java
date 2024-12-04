public class ColorDemo{
  public static final String CLEAR_SCREEN =  "\u001b[2J";
  public static final String HIDE_CURSOR =  "\u001b[?25l";
  public static final String SHOW_CURSOR =  "\u001b[?25h";

  public static void go(int r,int c){
    System.out.print("\u001b[" + r + ";" + c + "f");
  }

  public static void main(String[] args) {
    for(int r = 0; r < 256; r+=16){
      for(int g = 0; g <= 256; g+=16){
        for(int b = 0; b <= 256; b+=16){
          go(r, g);
          System.out.print("\u001b[38;2;"+r+";"+g+";"+b+";7m.");
        }
      }
        System.out.println();
    }

    System.out.println(CLEAR_SCREEN);
    System.out.print("\u001b[0m");

    System.out.print("\u001b[36m");
    System.out.println("Hello World");
    System.out.print("\u001b[0m");

    for (int r = 0; r < 16; r++) {
      for (int g = 0; g < 16; g++) {
          for (int b = 0; b < 16; b++) {
              go(r, g);
              System.out.print("\u001b[38;2;" + (r * 16) + ";" + (g * 16) + ";" + (b * 16) + "m\u2588");
          }
      }
    }  

    System.out.print("\u001b[0m");
  }
}