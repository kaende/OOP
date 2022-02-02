package Trougao;

public class Trougao {
    private double stranicaA;
    private double stranicaB;
    private double stranicaC;

    private boolean daLiJeTrougaoValidan(){
        if(stranicaA <=0 || stranicaB <= 0 || stranicaC <=0){
            return false;
        }
        else if(stranicaA + stranicaB < stranicaC){
            return false;
        }
        else if(stranicaA + stranicaC < stranicaB){
            return false;
        }
        else if (stranicaB + stranicaC < stranicaA){
            return false;
        }
        else{
            return true;
        }
    }

    public Trougao(double stranicaA, double stranicaB, double stranicaC) {
        this.stranicaA = stranicaA;
        this.stranicaB = stranicaB;
        this.stranicaC = stranicaC;
        boolean validan = daLiJeTrougaoValidan();
        if(validan == false){
            System.out.println("Pokusavate kreitati nevalidan trougao");
        }
    }

    public double getStranicaA() {
        return stranicaA;
    }

    public double getStranicaB() {
        return stranicaB;
    }

    public double getStranicaC() {
        return stranicaC;
    }

    public void setStranicaA(double stranicaA) {
        this.stranicaA = stranicaA;
        boolean validan = daLiJeTrougaoValidan();
        if(validan == false){
            System.out.println("Nije validno");
        }
    }

    public void setStranicaB(double stranicaB) {
        this.stranicaB = stranicaB;
        boolean validan = daLiJeTrougaoValidan();
        if(validan == false){
            System.out.println("Nije validno");
        }
    }

    public void setStranicaC(double stranicaC) {
        this.stranicaC = stranicaC;
        boolean validan = daLiJeTrougaoValidan();
        if(validan == false){
            System.out.println("Nije validno");
        }
    }

    public double obim(){
        double o = stranicaA + stranicaB + stranicaC;
        return o;
    }

    public double povrsina(){
        double s = obim() / 2;
        double podKorenaVrednost = s * (s - stranicaA) * (s - stranicaB) * (s - stranicaC);
        double p = Math.sqrt(podKorenaVrednost);
        return p;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Duzina stranice A je: ");
        sb.append(stranicaA);
        sb.append("\n");
        sb.append("Duzina stranice B je: ");
        sb.append(stranicaB);
        sb.append("\n");
        sb.append("Duzina stranice C je: ");
        sb.append(stranicaC);
        sb.append("\n");
        return sb.toString();
    }

}
