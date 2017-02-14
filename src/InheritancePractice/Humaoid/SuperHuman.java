package InheritancePractice.Humaoid;

public class SuperHuman extends Humanoid{
    private String power;
    private String nickname;
    
    public void usePower(){
        System.out.println("You used your power");
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
