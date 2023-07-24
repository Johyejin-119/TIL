package com.company.design.decorator;

public class AudiDecorator implements ICar {
    protected ICar audi;
    protected String modelName;
    protected int modelPrice;

    public  AudiDecorator(ICar audi, String modelName, int modelPrice) {
        this.audi = audi;
        this.modelName = modelName;
        this.modelPrice = modelPrice;
    }

    @Override
    public int getPrice() {
        return audi.getPrice() + modelPrice; // A3, A4, A5 등급별로 가격 상승(+modelPrice)
    }

    @Override
    public void showPrice() {
        System.out.println(modelName + "의 가격은 " + getPrice() +"원 입니다.");
    }
}
