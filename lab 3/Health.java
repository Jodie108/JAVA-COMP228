package test;

public class Health extends Insurance {



    @Override

    public void setInsuranceCost(double cost) {
        this.type = this.getClass().getName();
        this.monthlyCost = cost;
    }

    @Override
    public void displayInfo() {
        System.out.println("insurance type:" + getType() + ",monthly cost:" + getMonthlyCost());
    }


}
