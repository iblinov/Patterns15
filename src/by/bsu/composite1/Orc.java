package by.bsu.composite1;

public class Orc extends Unit {
  private static final int MIN_DAMAGE = 5;
  private static final int MAX_DAMAGE = 8;
  private int arrowResistence = 4;

  public Orc() {
    setMinDamage(MIN_DAMAGE);
    setMaxDamage(MAX_DAMAGE);
  }

  @Override
  public Component add(Component component) {
    throw new UnsupportedOperationException();
  //  return false;
  }

  @Override
  public boolean delete(Component component) {
    return false;
  }

  @Override
  public Component getChild() {
    return null;
  }

  @Override
  public int offence() {
    return RandomIntGenerator.generate(MIN_DAMAGE, MAX_DAMAGE);
  }

  @Override
  public boolean defence(int hit) {
    return false;
  }
}
