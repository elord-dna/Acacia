package school.dj.buff;

import base.BaseRole;
import base.DeBuff;
import base.EnvValue;

public class SheYingDeBuff extends DeBuff {
    public SheYingDeBuff() {
        super("sheying");
    }
    public SheYingDeBuff(BaseRole role) {
        super("sheying", role);
    }

    @Override
    public void triggerAdd(EnvValue env) {

    }

    @Override
    public void triggerFresh(EnvValue env) {

    }

    @Override
    public void triggerRemove(EnvValue env) {

    }

    public void triggerShiSui(EnvValue env) {
        // TODO 触发食髓
    }
}
