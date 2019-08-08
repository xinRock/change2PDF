package com.jdk8;

import java.util.Arrays;
import java.util.List;

public class Data {
	private static List<PersonModel> list = null;

    static {
        PersonModel wu = new PersonModel("wu qi", 18, "��");
        PersonModel zhang = new PersonModel("zhang san", 19, "��");
        PersonModel wang = new PersonModel("wang si", 20, "Ů");
        PersonModel zhao = new PersonModel("zhao wu", 20, "��");
        PersonModel chen = new PersonModel("chen liu", 21, "��");
        list = Arrays.asList(wu, zhang, wang, zhao, chen);
    }

    public static List<PersonModel> getData() {
        return list;
    }
}
