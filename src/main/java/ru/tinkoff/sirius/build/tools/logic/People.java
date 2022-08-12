package ru.tinkoff.sirius.build.tools.logic;

public class People {

    String name;
    Integer age;
    Education education;
    Sex sex;

    public People(String name, Integer age, Education education, Sex sex) {
        this.name = name;
        this.age = age;
        this.education = education;
        this.sex = sex;
    }


    public enum Education{
        ELEMENTARY,
        SECONDARY,
        MASTER
    }

    public enum Sex{
        MALE,
        FEMALE
    }
}
