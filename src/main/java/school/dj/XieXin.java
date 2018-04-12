package school.dj;

import base.BaseRole;
import base.EnvValue;
import base.Skill;

public class XieXin extends Skill {
    public XieXin() {}
    public XieXin(BaseRole role) {
        int[] talent = role.getTalent();
        switch (talent[0]) {
            // xie du, change this into another skill, use delegate instead
            case 1: break;
            // add 10 percent
            case 2:
                setDamageAddPercent(getDamageAddPercent() + 0.1);
                break;
            // add 10 percent ct and 10 percent cte
            case 3:
                setExCrt(getExCrt() + 0.1);
                setExCrtEff(getExCrtEff() + 0.1);
                break;
            default: break;
        }
    }

    @Override
    public void onTrigger(BaseRole role, EnvValue env) {
        String result = role.castResult(this, env);
        EnvValue envSnap = null; // copy
        switch (result) {
            case "hit":
                buMing();
                kuCan(env);
                duoMing(env);
                break;
            case "ct":
                buMing();
                weiHou();
                kuCan(env);
                duoMing(env);
                break;
            case "insight":
                buMing();
                kuCan(env);
                duoMing(env);
                break;
            case "miss": break;
            default: break;
        }
    }

    private void buMing() {
        // TODO buMing buff
    }
    private void weiHou() {
        // TODO weiHou buff
    }
    private void duoMing(EnvValue env) {
        // TODO duoMing
    }
    private void kuCan(EnvValue env) {
        // TODO kuCan
    }
}
