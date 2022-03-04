public abstract class AbstractClazz {
  // classes abstratas não podem ser instanciadas;

  // template method
  public final void processos() {
    processo1();
    processo2();
  }

  public abstract void processo1();

  public abstract void processo2();
}