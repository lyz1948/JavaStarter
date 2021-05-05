package kongfu.game.logic;

public class KongfuPerson extends Person {

  public KongfuPerson() {}

  public KongfuPerson(String name) {
    this.name = name;
  }

  protected int blood = 1000;

  public void commontSkill(KongfuPerson p) {
    p.blood -= 50;
  }

  public void bestSkill(KongfuPerson p) {
    p.blood -= 100;
  }

  public int getBlood() {
    return blood;
  }

  public void setBlood(int blood) {
    this.blood = blood;
  }
}
