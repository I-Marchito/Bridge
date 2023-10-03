package org.example;

public abstract class Personagem {
    protected Rank rank;

    protected int pontosAtributosBase;
    protected int pontosSkillBase;

    public Personagem(int atributosBase, int skillBase) {
        this.pontosAtributosBase = atributosBase;
        this.pontosSkillBase = skillBase;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public void setAtributosBase(int atributosBase) {
        this.pontosAtributosBase = atributosBase;
    }

    public void setSkillBase(int skillBase) {
        this.pontosSkillBase = skillBase;
    }

    public abstract int pontosAtributos();
    public abstract int pontosSkill();
}