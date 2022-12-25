package school.mjc.stage0.loops.task5;

public class Cross {
    public void printCross(int sideLength) {
        if(sideLength < 3){
            return;
        }
        int middlePoint = sideLength / 2 + 1;
        for (int i = 1; i <= sideLength; i++) {
            for (int j = 1; j <= sideLength; j++) {
                if(j == middlePoint || i == middlePoint){
                    System.out.print(8);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
