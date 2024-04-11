package by.bsu.composite1;


public class Elf extends Unit {
  private static final int MIN_DAMAGE = 8;
  private static final int MAX_DAMAGE = 10;
  private boolean doubleShot;

  public Elf() {
    setMinDamage(MIN_DAMAGE);
    setMaxDamage(MAX_DAMAGE);
  }

  @Override
  public Component add(Component component) {
    return this;
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
