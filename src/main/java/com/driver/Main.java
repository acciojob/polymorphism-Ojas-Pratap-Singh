package com.driver;

public class Main {

    public class Product{
        public int product(int x , int y){
            return x*y;
        }
        public int product(int x , int y ,int z){
            return x*y*z;
        }
        public double product(double x, double y) {
            return x*y;
        }

    }

    public  void main(String[] args){
        Product p =new Product();
        p.product(2,3);
        p.product(2,3,5);
        p.product(2.5,2.5);
    }

}
