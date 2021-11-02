package exercicios.invoice;

public class Invoice {
    private String numPeca, descPeca;
    private int qntItem;
    private double precoItem;

    public Invoice(String numPeca, String descPeca, int qntItem, double precoItem) {
        this.numPeca = numPeca;
        this.descPeca = descPeca;
        this.qntItem = qntItem;
        this.precoItem = precoItem;
    }

    public double getInvoiceAmount(){
        double total;
        if (qntItem < 0){
            return total = 0;
        }
        if (precoItem < 0.0){
            return total = 0.0;
        }
        total = this.qntItem * this.precoItem;
        return total;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "numPeca='" + numPeca + '\'' +
                ", descPeca='" + descPeca + '\'' +
                ", qntItem=" + qntItem +
                ", precoItem=" + precoItem +
                '}';
    }

    public String getNumPeca() { return numPeca; }

    public void setNumPeca(String numPeca) { this.numPeca = numPeca; }

    public String getDescPeca() { return descPeca; }

    public void setDescPeca(String descPeca) { this.descPeca = descPeca; }

    public int getQntItem() { return qntItem; }

    public void setQntItem(int qntItem) { this.qntItem = qntItem; }

    public double getPrecoItem() { return precoItem; }

    public void setPrecoItem(double precoItem) { this.precoItem = precoItem; }
}
