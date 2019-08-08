package com.jdk8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;

import com.jdk8.Data;
import com.jdk8.PersonModel;

public class App {

	
	 /**
     * 过滤所有的男性
     */
    public static void fiterSex(){
        List<PersonModel> data = Data.getData();

        //old
        List<PersonModel> temp=new ArrayList<>();
        for (PersonModel person:data) {
            if ("男".equals(person.getSex())){
                temp.add(person);
            }
        }
        System.out.println(temp);
        //new
        List<PersonModel> collect =  (List<PersonModel>) data
                .stream()
                .filter(person -> "男".equals(person.getSex()));
        System.out.println(collect);
        
    }
    
    /**
     * 过滤所有的男性 并且小于20岁
     */
    public static void fiterSexAndAge(){
        List<PersonModel> data = Data.getData();

        //old
        List<PersonModel> temp=new ArrayList<>();
        for (PersonModel person:data) {
            if ("男".equals(person.getSex())&&person.getAge()<20){
                temp.add(person);
            }
        }

        //new 1
        List<PersonModel> collect = (List<PersonModel>) data
                .stream()
                .filter(person -> {
                    if ("男".equals(person.getSex())&&person.getAge()<20){
                        return true;
                    }
                    return false;
                })
                ;
        //new 2
        List<PersonModel> collect1 = (List<PersonModel>) data
                .stream()
                .filter(person -> ("男".equals(person.getSex())&&person.getAge()<20))
                ;

    }

}
