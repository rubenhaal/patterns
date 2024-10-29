package designpatterns.examples.patterns.creationals.builder.model;

public class Pizza {
    private String dough;
    private String sauce;
    private String cheese;
    private String topping;

    private Pizza(Builder builder) {
        this.cheese = builder.cheese;
        this.dough = builder.dough;
        this.sauce = builder.sauce;
        this.topping= builder.topping;
    }

    public static class Builder{
        private String dough;
        private String sauce;
        private String cheese;
        private String topping;

        public void setDough(String dough) {
            this.dough = dough;
        }

        public void setSauce(String sauce) {
            this.sauce = sauce;
        }

        public void setCheese(String cheese) {
            this.cheese = cheese;
        }

        public void setTopping(String topping) {
            this.topping = topping;
        }

        public Pizza build(){
            return new Pizza(this);
        }
    }


}
