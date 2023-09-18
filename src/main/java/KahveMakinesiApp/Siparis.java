package KahveMakinesiApp;

public class Siparis {
    private boolean addMilk;
    private boolean addSugar;
    private int sugarCount;
    private String boyut;


    public boolean isAddMilk() {
        return addMilk;
    }

    public void setAddMilk(boolean addMilk) {
        this.addMilk = addMilk;
    }

    public boolean isAddSugar() {
        return addSugar;
    }

    public void setAddSugar(boolean addSugar) {
        this.addSugar = addSugar;
    }

    public int getSugarCount() {
        return sugarCount;
    }

    public void setSugarCount(int sugarCount) {
        this.sugarCount = sugarCount;
    }

    public String getBoyut() {
        return boyut;
    }

    public void setBoyut(String boyut) {
        this.boyut = boyut;
    }

    public void kahveHazirla(){
        System.out.println();
    }
}
