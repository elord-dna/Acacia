package school.dj;

import base.DeBuff;
import base.EnvValue;
import base.Util;
import java.util.List;

public class DuoMingDeBuff extends DeBuff {
    @Override
    public void triggerAdd(EnvValue env) {
        List<DeBuff> deBuffs = env.deBuffList;
        if (!Util.checkExistDeBuff(deBuffs, this)) {
            deBuffs.add(this);
        }
    }

    @Override
    public void triggerFresh(EnvValue env) {
        List<DeBuff> deBuffs = env.deBuffList;
        if (Util.checkExistDeBuff(deBuffs, this)) {
            // TODO 重新计算时间
        }
    }

    @Override
    public void triggerRemove(EnvValue env) {

    }
}
