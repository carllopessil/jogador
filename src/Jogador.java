  public class Jogador {
    private String nome;
    private int xp;
    private int hp;
    private boolean envenenado;

    public Jogador(){
    }
    public Jogador(String nome){
        this.nome = nome;
    }
    public int getXp() {
        return xp;
    }
    public int getHp() {
        return hp;
    }
    public boolean isEnvenenado() {
        return envenenado;
    }
    public void receberDano(int pontos){
        this.hp = this.hp - pontos;
    }
    public void receberCura(int pontos){
        this.hp = this.hp + pontos;
    }
    public void receberExperiencia (int pontos){
        this.hp = this.xp + pontos;
    }
    public void receberAntidoto(){
        if(this.envenenado==true){
        this.envenenado = false;
        }else{
            this.envenenado = true;
        }
    }

}