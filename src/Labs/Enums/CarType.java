package Labs.Enums;

public enum CarType {
    LIGHT("Легковой", "[A|B|E|K|M|H|O|P|C|T|Y|X]{1}[0-9]{3}[A|B|E|K|M|H|O|P|C|T|Y|X]{2}[0-9]{2,3}RUS"),
    CARGO("Грузовой", "[A|B|E|K|M|H|O|P|C|T|Y|X]{1}[0-9]{3}[A|B|E|K|M|H|O|P|C|T|Y|X]{2}[0-9]{2,3}RUS"),
    TANK("Танк", "[A|B|E|K|M|H|O|P|C|T|Y|X]{1}[0-9]{3}[A|B|E|K|M|H|O|P|C|T|Y|X]{2}[0-9]{2,3}RUS"),
    BUS("Автобус", "[A|B|E|K|M|H|O|P|C|T|Y|X]{1}[0-9]{3}[A|B|E|K|M|H|O|P|C|T|Y|X]{2}[0-9]{2,3}RUS");

    public String signFormat;
    public String description;
    CarType(String _description, String _signFormat) {
        this.signFormat = _signFormat;
        this.description = _description;
    }
    public String toString() {
        return this.description;
    }
}
