package Enum.EnumConstructor;

import Enum.EnumConstructor.Month;

public class Main {
    public static void main(String[] args) {
        Month name;
        name = Month.FEBRUARY;

        System.out.println("Month : " + name);
        System.out.println("Days  : " + name.getDays());
    }
}
