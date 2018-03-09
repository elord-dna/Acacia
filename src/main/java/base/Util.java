package base;

import java.util.HashMap;
import java.util.Map;

public class Util {
    static Map<Integer, Double> requiredStrainMap = new HashMap<Integer, Double>() {
        {
            put(96, 0.15); put(97,0.25); put(98,0.35);
        }
    };
    static Map<Integer, Double> requiredHitMap = new HashMap<Integer, Double>() {
        {
            put(96, 1.06); put(97,1.1); put(98,1.2);
        }
    };
    public static double getRequiredStrain(int target) {
        return requiredStrainMap.get(target);
    }
    public static double getRequiredHit(int target) {
        return requiredHitMap.get(target);
    }
}
