package ex_280724_classObject;

public class buildingBluePrint2 {
    public static void main(String[] args) {

        //  Class - Attribute / properties - data Types - primitive or non primitive.
        // Class - Behaviour /Methods - functions -

        // object - real entity - class -
        // ClassName classRef = new ClassName();

        // new ClassName(); - Object
        // classRef - Class Ref
        // ClassName = Class Name which blueprint you are using

        buildingBluePrint dlf = new buildingBluePrint();
        dlf.name = "DLF Pvt Builder";
        dlf.noOfRooms = 100;

        dlf.useLift();

        buildingBluePrint prestige = new buildingBluePrint();
        prestige.name = "Prestige Pvt Builder";
        prestige.noOfRooms = 100;

        prestige.activities();


    }
}

