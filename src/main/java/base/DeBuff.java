package base;

public abstract class DeBuff {
    private String name;
    private int level = 0;
    private int maxLevel;

    // 快照属性
    private BaseRole snapshot;

    public String getName() {
        return name;
    }

    public abstract void triggerAdd(EnvValue env);
    public abstract void triggerFresh(EnvValue env);
    public abstract void triggerRemove(EnvValue env);
}
