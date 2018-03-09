package base;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BaseRole {
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
}
