package base;

import java.util.HashMap;
import java.util.List;
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
    // 检验是否存在同名buff
    public static boolean checkExistBuff(List<Buff> buffList, Buff buff) {
        for (Buff b : buffList) {
            if (b.getName().equals(buff.getName())) {
                return true;
            }
        }
        return false;
    }
    // 检验是否存在同名debuff
    public static boolean checkExistDeBuff(List<DeBuff> deBuffList, DeBuff deBuff) {
        for (DeBuff d : deBuffList) {
            if (d.getName().equals(deBuff.getName())) {
                return true;
            }
        }
        return false;
    }
}
