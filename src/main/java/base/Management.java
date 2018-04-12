package base;

/**
 * 用来做全局控制
 */
public class Management {
    public static BaseRole createSnapshot(BaseRole role) {
        // TODO 创建快照
        try {
            BaseRole copy = (BaseRole) role.clone();
            return copy;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static void addBuff(BaseRole role, Buff buff) {
        // TODO
        role.getBuffList().add(buff);
    }
    public static void addDeBuff(EnvValue env) {
        // TODO
    }
}
