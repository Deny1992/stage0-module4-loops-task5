package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        if(height < 3){
            return;
        }
        int width = 0;
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j < height; j++) {
                if(j >= width && j < height - width) {
                    System.out.print(8);
                }else {
                    System.out.print(" ");
                }
            }
            if(i > height / 2){
                width--;
            }
            else if(i < height / 2 || height % 2 != 0){
                width++;
            }
            System.out.println();
        }
    }
}
