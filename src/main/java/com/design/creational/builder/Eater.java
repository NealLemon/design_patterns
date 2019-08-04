package com.design.creational.builder;

/**
 *  食客
 */
public class Eater {

    private String order;  //点餐
    private EatMode mode;  //堂食还是外带
    private String pay;    //付款
    private String eat;    //就餐
    private String pack;    //打包

    public Eater(EaterBuilder eaterBuilder) {
        this.order = eaterBuilder.order;
        this.mode = eaterBuilder.mode;
        this.pack = eaterBuilder.pack;
        this.eat = eaterBuilder.eat;
        this.pay = eaterBuilder.pay;
    }

    @Override
    public String toString() {
        return "Eater{" +
                "order='" + order + '\'' +
                ", mode=" + mode.getLabel() +
                ", pay='" + pay + '\'' +
                ", eat='" + eat + '\'' +
                ", pack='" + pack + '\'' +
                '}';
    }

    public static class EaterBuilder {
        private String order;//点餐
        private EatMode mode; //堂食还是外带
        private String pay;        //付款
        private String eat;         //就餐
        private String pack;        //打包

        public EaterBuilder builderOrder(String order) {
            this.order = order;
            return this;
        }

        public EaterBuilder builerMode(EatMode eatMode) {
            this.mode = eatMode;
            return this;
        }

        public EaterBuilder builerPay(String pay) {
            this.pay = pay;
            return this;
        }

        public EaterBuilder builerEat(String eat) {
            this.eat = eat;
            return this;
        }

        public EaterBuilder builderPack(String pack) {
            this.pack = pack;
            return this;
        }

        public Eater build() {
            return new Eater(this);
        }
    }
}
