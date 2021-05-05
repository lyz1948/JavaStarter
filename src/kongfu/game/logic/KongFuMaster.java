package kongfu.game.logic;

public class KongFuMaster extends KongfuPerson implements Secrets {

  public KongFuMaster() {}

  public KongFuMaster(String name) {
    this.name = name;
  }

  @Override
  public void secrets(KongfuPerson p) {
    p.blood -= 300;
  }
}
