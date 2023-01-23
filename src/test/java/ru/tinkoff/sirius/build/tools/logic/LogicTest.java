package ru.tinkoff.sirius.build.tools.logic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.tinkoff.sirius.build.tools.logic.People.Education;
import ru.tinkoff.sirius.build.tools.logic.People.Sex;

class LogicTest {

    Logic logic = new Logic();

    @Test
    public void whenAgeLess18ThenThrowException() {

        People people = new People(
            "Semen",
            11,
            Education.ELEMENTARY,
            Sex.MALE
        );
        Assertions.assertThrows(RuntimeException.class, () -> {
            logic.score(people);
        });
    }

    @Test
    public void whenNormalPeopleThenCalcPd() {

        People people = new People(
            "Ivan",
            55,
            Education.MASTER,
            Sex.MALE
        );
        double pd = logic.score(people);
        Assertions.assertEquals(0.42, pd);
    }

    @Test
    public void whenWomanThenPdLess() {

        People people = new People(
            "Marina",
            55,
            Education.MASTER,
            Sex.FEMALE
        );
        double pd = logic.score(people);
        Assertions.assertEquals(0.37, pd);
    }

    @Test
    public void whenEducationIsThenPdLess() {

        People people = new People(
            "Petrovich",
            60,
            Education.ELEMENTARY,
            Sex.MALE
        );
        double pd = logic.score(people);
        Assertions.assertEquals(0.3, pd);
    }

}