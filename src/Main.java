//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Heroi heroi = new Heroi();
        heroi.atacar(Tipo.MAGO);
        heroi.atacar(Tipo.MONGE);
        heroi.atacar(Tipo.GUERREIRO);
        heroi.atacar(Tipo.NINJA);
    }
}