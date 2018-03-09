package base;

public abstract class Skill {
    private String name;
    private String suffix;
    private boolean mustHit = false;
    private boolean mustCrt = false;
    private double exCrt = 0;
    private double exCrtEff = 0;
    private double exOvercome = 0;
    // 奇穴或者装备提供
    private double damageAddPercent = 0;

    private int baseDamageMin = 0;
    private int baseDamageMax = 0;
    private double damageCoe = 0;

    public boolean isMustHit() {
        return mustHit;
    }
    public boolean isMustCrt() {
        return mustCrt;
    }
    public double getExCrt() {
        return exCrt;
    }
    public double getExCrtEff() {
        return exCrtEff;
    }
    public double getExOvercome() {
        return exOvercome;
    }

    public double getDamageAddPercent() {
        return damageAddPercent;
    }

    public void setDamageAddPercent(double damageAddPercent) {
        this.damageAddPercent = damageAddPercent;
    }

    public int getBaseDamageMin() {
        return baseDamageMin;
    }

    public void setBaseDamageMin(int baseDamageMin) {
        this.baseDamageMin = baseDamageMin;
    }

    public int getBaseDamageMax() {
        return baseDamageMax;
    }

    public void setBaseDamageMax(int baseDamageMax) {
        this.baseDamageMax = baseDamageMax;
    }

    public double getDamageCoe() {
        return damageCoe;
    }

    public void setDamageCoe(double damageCoe) {
        this.damageCoe = damageCoe;
    }

    public abstract void onTrigger(BaseRole role, EnvValue env);
}
