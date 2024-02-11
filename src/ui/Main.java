package ui;

public class Main {
    private static final int displayHeigth = 50;
    private static final int  displayWidth = 100;

    public static void main(String[] args) {
        char[][] displayMatrix = new char[displayHeigth][displayWidth];
        Sprite ship = new Ship(50,25,'o');
        Sprite ship2 = new Ship(30,10,'o');


       for(int n=0;n<30;n++){
            for(int i=0;i<displayHeigth;i++){
                for(int j=0;j<displayWidth;j++){
                    displayMatrix[i][j] = '-';
                }
            }

            for(Point point:ship.getDisplayPoints()){
                displayMatrix[point.getY()][point.getX()] = point.getDisplayPixel();
            }
            for(Point point:ship2.getDisplayPoints()){
                displayMatrix[point.getY()][point.getX()] = point.getDisplayPixel();
            }

            for(int i=0;i<displayHeigth;i++){
                for(int j=0;j<displayWidth;j++){
                    System.out.print(displayMatrix[i][j]);
                }
                System.out.println();

            }
            clearScreen();
            ship.setCenterX(ship.getCenterX()+1);
        }


    }
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}