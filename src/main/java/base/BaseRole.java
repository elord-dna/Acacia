package base;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BaseRole implements Cloneable {
    // 基础值
    private String school;
    private int basicAttack = 0;
    private int spunk = 0; // yq
    private int crit = 0;
    private int critEff = 0;
    private int hit = 0; // mz
    private int haste = 0; // js
    private int strain = 0; // xt, ws
    private int overcome = 0; // pf
    private int delay = 100;
    private int[] talent = {0,0,0,0,0,0,0,0,0,0,0,0};
    // 自身buff列表
    private List<Buff> buffList = new ArrayList<>();

    // 最终值
    private int fAttack;
    private double fCrit;
    private double fCritEff;
    private double fHit;
    private double fStrain;
    private double fOvercome;
    private int fHaste;

    Random random = new Random();

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getBasicAttack() {
        return basicAttack;
    }

    public void setBasicAttack(int basicAttack) {
        this.basicAttack = basicAttack;
    }

    public int getSpunk() {
        return spunk;
    }

    public void setSpunk(int spunk) {
        this.spunk = spunk;
    }

    public int getCrit() {
        return crit;
    }

    public void setCrit(int crit) {
        this.crit = crit;
    }

    public int getCritEff() {
        return critEff;
    }

    public void setCritEff(int critEff) {
        this.critEff = critEff;
    }

    public int getHit() {
        return hit;
    }

    public void setHit(int hit) {
        this.hit = hit;
    }

    public int getHaste() {
        return haste;
    }

    public void setHaste(int haste) {
        this.haste = haste;
    }

    public int getStrain() {
        return strain;
    }

    public void setStrain(int strain) {
        this.strain = strain;
    }

    public int getOvercome() {
        return overcome;
    }

    public void setOvercome(int overcome) {
        this.overcome = overcome;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public List<Buff> getBuffList() {
        return buffList;
    }

    public void setBuffList(List<Buff> buffList) {
        this.buffList = buffList;
    }

    public int getfAttack() {
        return fAttack;
    }

    public void setfAttack(int fAttack) {
        this.fAttack = fAttack;
    }

    public double getfCrit() {
        return fCrit;
    }

    public void setfCrit(double fCrit) {
        this.fCrit = fCrit;
    }

    public double getfCritEff() {
        return fCritEff;
    }

    public void setfCritEff(double fCritEff) {
        this.fCritEff = fCritEff;
    }

    public double getfHit() {
        return fHit;
    }

    public void setfHit(double fHit) {
        this.fHit = fHit;
    }

    public double getfStrain() {
        return fStrain;
    }

    public void setfStrain(double fStrain) {
        this.fStrain = fStrain;
    }

    public double getfOvercome() {
        return fOvercome;
    }

    public void setfOvercome(double fOvercome) {
        this.fOvercome = fOvercome;
    }

    public int getfHaste() {
        return fHaste;
    }

    public void setfHaste(int fHaste) {
        this.fHaste = fHaste;
    }

    public int[] getTalent() {
        return talent;
    }

    public void setTalent(int[] talent) {
        this.talent = talent;
    }

    public String castResult(Skill skill, EnvValue target) {
        if (skill.isMustCrt()) {
            return "ct";
        }
        double ranVal = random.nextDouble();
        double insightRate = target.getStrainRequire() - fStrain;
        if (insightRate < 0) {
            insightRate = 0;
        }
        double missRate = target.getHitRequire() - fHit;
        if (missRate < 0 || skill.isMustHit()) {
            missRate = 0;
        }
        if (ranVal < missRate) {
            return "miss";
        }
        if (ranVal < missRate + insightRate) {
            return "insight";
        }
        if (ranVal < missRate + insightRate + fCrit + skill.getExCrt()) {
            return "ct";
        }
        return "hit";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
