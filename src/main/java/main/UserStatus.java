package main;

public enum UserStatus {
    //public static String HELLO = "hello"; // юзер впервые отправил боту /start
    //public  static String GETGROUPID = "get_group_id"; // ждем от юзера код группы
    //public static String DEFAULT = "default"; //главное меню

    HELLO("HELLO"),
    GET_GROUPID("GET_GROUPID"),
    DEFAULT("DEFAULT"),
    NOT_EXISTS("NOT_EXISTS"),
    GET_LESSON1("GET_LESSON1"),
    GET_LESSON2("GET_LESSON2"),
    GET_LESSON3("GET_LESSON3"),
    GET_LESSON4("GET_LESSON4"),
    GET_LESSON5("GET_LESSON5"),
    GET_LESSON6("GET_LESSON6"),
    GET_LESSON7("GET_LESSON7"),
    GET_LESSON_NAME("GET_LESSON_NAME"),
    GET_HOMETASK("GET_HOMETASK"),
    GET_GROUPNAME("GET_GROUPNAME"),
    GET_FIRSTLESSON_NUMBER("GET_FIRSTLESSON_NUMBER"),
    GET_SUPPORT_TEXT("GET_SUPPORT_TEXT"),
    SETTINGS("SETTINGS"),
    EDIT_LESSON1("EDIT_LESSON1"),
    EDIT_LESSON2("EDIT_LESSON2"),
    EDIT_LESSON3("EDIT_LESSON3"),
    EDIT_LESSON4("EDIT_LESSON4"),
    EDIT_LESSON5("EDIT_LESSON5"),
    EDIT_LESSON6("EDIT_LESSON6"),
    EDIT_LESSON7("EDIT_LESSON7"),
    EDIT_FIRSTLESSON_NUMBER("EDIT_FIRSTLESSON_NUMBER"),
    GET_WEEKDAY("GET_WEEKDAY"),
    CLOSE_EDITING("CLOSE_EDITING"),
    GET_WEEK_TYPE("GET_WEEK_TYPE");
    private final String code;

    UserStatus(final String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
