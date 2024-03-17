package Labs.Enums;

public enum CarType {
    LIGHT("[A|B|E|K|M|H|O|P|C|T|Y|X]{1}[0-9]{3}[A|B|E|K|M|H|O|P|C|T|Y|X]{2}[0-9]{2,3}RUS"),
    CARGO("[A|B|E|K|M|H|O|P|C|T|Y|X]{1}[0-9]{3}[A|B|E|K|M|H|O|P|C|T|Y|X]{2}[0-9]{2,3}RUS"),
    TANK("[A|B|E|K|M|H|O|P|C|T|Y|X]{1}[0-9]{3}[A|B|E|K|M|H|O|P|C|T|Y|X]{2}[0-9]{2,3}RUS"),
    BUS("[A|B|E|K|M|H|O|P|C|T|Y|X]{1}[0-9]{3}[A|B|E|K|M|H|O|P|C|T|Y|X]{2}[0-9]{2,3}RUS");

    public String signFormat;
    CarType(String _signFormat) {
        this.signFormat = _signFormat;
    }
}
