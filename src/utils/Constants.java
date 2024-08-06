package utils;

import java.time.LocalDate;

public class Constants {
    public static final int MAX_NAME_LENGTH = 99;
    public static final int MIN_BIRTH_YEAR = 1900;
    public static final int MAX_BIRTH_YEAR = LocalDate.now().getYear();
    public static final int MAX_ADDRESS_LENGTH = 299;
    public static final double MIN_HEIGHT = 50;
    public static final double MAX_HEIGHT = 300;
    public static final double MIN_WEIGHT = 5;
    public static final double MAX_WEIGHT = 1000;

    public static final int STUDENT_CODE_LENGTH = 10;
    public static final int MAX_SCHOOL_NAME_LENGTH = 199;
    public static final int MIN_START_YEAR = 1900;
    public static final int MAX_START_YEAR = LocalDate.now().getYear();
    public static final double MIN_GPA = 0;
    public static final double MAX_GPA = 10;
}
