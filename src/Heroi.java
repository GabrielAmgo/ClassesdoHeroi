public class Heroi {
    public String nome;
    public int idade;
    public Tipo tipo;
    public String ataque;

    public void atacar(Tipo tipo){
        switch (tipo) {
            case MAGO:
                ataque = "magia";
                break;
            case GUERREIRO:
                ataque = "espada";
                break;
            case MONGE:
                ataque = "artes marciais";
                break;
            case NINJA:
                ataque = "shuriken";
                break;
        }
        System.out.println("O "+ tipo + " atacou usando usando " + ataque);
    }
}
