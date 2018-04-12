package base;

public abstract class Buff {
    private String name;
    private int damage = 0;
    private int attackAddPercent;
    private int attackAddBase;
    private int critAddPercent;
    private int critAddBase;
    private int hitAddPercent;
    private int hitAddBase;

    private int level;
    private int maxLevel;

    public String getName() {
        return name;
    }

    public abstract void triggerAdd(BaseRole role);
    public abstract void triggerFresh(BaseRole role);
    public abstract void triggerRemove(BaseRole role);
}
