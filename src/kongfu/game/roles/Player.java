package kongfu.game.roles;

import kongfu.game.logic.KongFuMaster;
import kongfu.game.logic.KongfuPerson;

public class Player extends KongFuMaster {
  public Player() {}

  public Player(String name) {
    this.name = name;
  }

  @Override
  public void secrets(KongfuPerson p) {
    super.secrets(p);
    System.out.println(this.getName() + "使用绝招攻击" + p.getName() + "300点血" );
  }

  @Override
  public void commontSkill(KongfuPerson p) {
    super.commontSkill(p);
    System.out.println(this.getName() + "使用普通招式攻击" + p.getName() + "50点血" );
  }

  @Override
  public void bestSkill(KongfuPerson p) {
    super.bestSkill(p);
    System.out.println(this.getName() + "使用击杀招式攻击" + p.getName() + "100点血" );
  }

  @Override
  public String getName() {
    return super.getName();
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }
}
