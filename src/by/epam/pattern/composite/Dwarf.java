package by.epam.pattern.composite;

public class Dwarf extends Unit {
  private static final int MIN_DAMAGE = 5;
  private static final int MAX_DAMAGE = 5;
  private int arrowResistence = 4;

  public Dwarf() {
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
