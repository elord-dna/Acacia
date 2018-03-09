package school.dj;

import base.BaseRole;
import base.EnvValue;
import base.Skill;

public class XieXin extends Skill {
    public XieXin() {}
    public XieXin(BaseRole role) {
        int[] talent = role.getTalent();
        switch (talent[0]) {
            case 1: break;
            case 2: break;
            case 3: break;
            default: break;
        }
    }

    @Override
    public void onTrigger(BaseRole role, EnvValue env) {
        String result = role.castResult(this, env);
        switch (result) {
            case "hit": break;
            case "ct": break;
            case "insight": break;
            case "miss": break;
            default: break;
        }
    }
}
