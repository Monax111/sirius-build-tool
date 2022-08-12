package ru.tinkoff.sirius.build.tools.logic;

import ru.tinkoff.sirius.build.tools.logic.People.Education;
import ru.tinkoff.sirius.build.tools.logic.People.Sex;

public class Logic {

    /**
     * рассчитываем PD - вероятность не возврата денег, взятых в кредит, данным человеком 1 - человек точно не вернет
     * деньги 0 - человек точно вернет деньги
     */
    public double score(People people) {
        if (people.age < 18) {
            throw new RuntimeException("Нельзя выдавать кредит несовершеннолетним");
        }
        double pd = ((people.age - 18.0) / 100);

        if (people.sex == Sex.MALE) {
            pd += 0.05;
        }


        if (
            people.education == Education.ELEMENTARY
            && pd > 0.3
        ) {
            return 0.3;
        }

        return pd;
    }

}
