package self_study;

import java.util.ArrayList;

public class Bed {
    String size;
    ArrayList<Pillow> pillows;

    public Bed(String size, int numOfPillows) {
        this.size = size;
        pillows = new ArrayList<>();
        for (int i = 0; i < numOfPillows; i++) {
            this.pillows.add(new Pillow());
        }
    }
}
class Pillow{


}
class RunnerBed{
    public static void main(String[] args) {
        Bed bed = new Bed("Twin", 3);
        System.out.println(bed.pillows.size());
    }
}
