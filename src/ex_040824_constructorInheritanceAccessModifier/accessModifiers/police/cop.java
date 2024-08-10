package ex_040824_constructorInheritanceAccessModifier.accessModifiers.police;

public class cop {
    private int gun;
    private String idCard;

    public cop(int gun, String idCard) {
        this.gun = gun;
        this.idCard = idCard;
    }
    protected void canIShoot(){
        System.out.println("Yes. You cam!");
    }
}
