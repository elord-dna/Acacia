package base;

import java.util.ArrayList;
import java.util.List;

public class EnvValue {
    public int duration = 300;
    public int target = 98;
    public boolean cw = false;
    public boolean water = false;
    public boolean thunder = false;
    public List setEffect = new ArrayList();

    double strainRequire = 0.35;
    double hitRequire = 1.2;
    public void setTarget(int target) {
        this.target = target;
        strainRequire = Util.getRequiredStrain(target);
    }
    public double getStrainRequire() {
        return  strainRequire;
    }
    public double getHitRequire() {
        return hitRequire;
    }

}
