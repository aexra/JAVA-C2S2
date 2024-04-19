package Labs.Classes;

import Labs.Enums.IntersectionTypes;

public class MyUltraSuperCoolClassWithOneMethodForThisTask {
    public static IntersectionTypes MyUltraCoolMethodForThisTask(int x1, int y1, int r1, int x2, int y2, int r2) {
        double dist = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        if (r1 != r2 && dist + Math.min(r1, r2) < Math.max(r1, r2)) {
            return (r1 < r2) ? IntersectionTypes.FIS : IntersectionTypes.SIF;
        }
        if (dist == r1 + r2 || ((r1 != r2) && dist == Math.max(r1, r2) - Math.min(r1, r2))) return IntersectionTypes.ONE;
        else if (dist == 0) return IntersectionTypes.SAME;
        else if (dist > r1 + r2) return IntersectionTypes.NO;
        else return IntersectionTypes.TWO;
    }
}
