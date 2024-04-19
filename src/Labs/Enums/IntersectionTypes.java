package Labs.Enums;

public enum IntersectionTypes {
    NO("Нет пересечений"),
    ONE("Одно пересечение"),
    TWO("Два пересечения"),
    SAME("Окружности совпадают"),
    FIS("Первая окружность вложена во вторую"),
    SIF("Вторая окружность вложена в первую");

    public String desc;
    IntersectionTypes(String desc) {
        this.desc = desc;
    }
}
