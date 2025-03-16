package ex_170824.Enum;

public enum colors {

    RED("#ff0000"),
    GREEN("#f0d0d0d"),
    BLUE("#f0d0d0d");


    private final String hexValue;

    colors(String hexValue) {
        this.hexValue = hexValue;
    }

    public String getValue(){
        return hexValue;
    }
}
