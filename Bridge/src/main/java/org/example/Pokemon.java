package org.example;

public class Pokemon extends Personagem {
    public Pokemon(int pontosAtributosBase, int pontosSkillBase) {
        super(pontosAtributosBase, pontosSkillBase);
    }

    @Override
    public int pontosAtributos() {
        return this.pontosAtributosBase + this.rank.aumentoAtributo();
    }

    @Override
    public int pontosSkill() {
        return this.pontosSkillBase + this.rank.aumentoSkill();
    }
}
