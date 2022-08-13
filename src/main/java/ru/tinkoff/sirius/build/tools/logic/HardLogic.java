package ru.tinkoff.sirius.build.tools.logic;

public class HardLogic {

    Logic logic;

    public HardLogic(Logic logic) {
        this.logic = logic;
    }

    public double score(People people) {
        double pd = logic.score(people);
        if (pd > 0.5 && people.age > 90) {
            return 0.5;
        }else{
            return pd;
        }
    }

}
