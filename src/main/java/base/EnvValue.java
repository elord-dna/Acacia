package base;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnvValue {
    public int duration = 300;
    public int target = 98;
    public boolean cw = false;
    public boolean water = false;
    public boolean thunder = false;
    public List setEffect = new ArrayList();
    public List<DeBuff> deBuffList = new ArrayList<>();
    public Map<String, DeBuff> deBuffMap = new HashMap<>(); // 用map代替list便于查找

    double strainRequire = 0.35;
    double hitRequire = 1.2;
    public void setTarget(int target) {
        this.target = target;
        strainRequire = Util.getRequiredStrain(target);
    }
    public boolean hasDeBuff(String name) {
        return deBuffMap.containsKey(name);
    }

    public double getStrainRequire() {
        return  strainRequire;
    }
    public double getHitRequire() {
        return hitRequire;
    }

    public List<DeBuff> getDeBuffList() {
        return deBuffList;
    }
}
