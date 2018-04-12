package base;

public abstract class DeBuff {
    private String name;
    private int level = 0;
    private int maxLevel = 1;

    // 快照属性
    private BaseRole snapshot;

    public DeBuff() {}
    public DeBuff(String name) {
        this.name = name;
    }
    public DeBuff(String name, BaseRole role) {
        this.name = name;
        this.snapshot = role;
    }

    public String getName() {
        return name;
    }

    public BaseRole getSnapshot() {
        return snapshot;
    }

    public void setSnapshot(BaseRole snapshot) {
        this.snapshot = snapshot;
    }

    public abstract void triggerAdd(EnvValue env);
    public abstract void triggerFresh(EnvValue env);
    public abstract void triggerRemove(EnvValue env);
}
