package Labs.Enums;

public enum IntersectionTypes {
    NO("No intersections"),
    ONE("One intersection"),
    TWO("Two intersection"),
    SAME("Circles are the same"),
    FIS("First one nested in the second one"),
    SIF("Second one nested in the first one");

    public String desc;
    IntersectionTypes(String desc) {
        this.desc = desc;
    }
}
