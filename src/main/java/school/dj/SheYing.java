package school.dj;

import base.BaseRole;
import base.DeBuff;
import base.EnvValue;
import base.Skill;
import school.dj.buff.SheYingDeBuff;

public class SheYing extends Skill {
    private int form = 0; // 0: 12s, 1: 14s
    private String buffName = "sheying";
    @Override
    public void onTrigger(BaseRole role, EnvValue env) {
        EnvValue envSnap = null;
        if (env.cw) {
            shiSui(env);
        } else {
            if (env.hasDeBuff(this.buffName)) {
                env.deBuffMap.get(this.buffName).triggerFresh(env);
            } else {
                env.deBuffMap.put(this.buffName, new SheYingDeBuff(role));
            }
        }
    }

    private void shiSui(EnvValue env) {
        if (env.deBuffMap.containsKey(this.buffName)) {
            DeBuff deBuff = env.deBuffMap.get(this.buffName);
            SheYingDeBuff sy = (SheYingDeBuff) deBuff;
            sy.triggerShiSui(env);
        }
    }
}
