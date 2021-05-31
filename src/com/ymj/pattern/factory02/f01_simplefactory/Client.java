package com.ymj.pattern.factory02.f01_simplefactory;

public class Client {
    public static void main(String[] args) {
        Product product = SimpleFactory.makeProduct(Const.PRODUCT_A);
        product.show();

    }

    // �����Ʒ
    public interface Product {
        void show();
    }

    /**
     * �����Ʒ��ProductA
     */
    static class ConcreteProduct1 implements Product {

        @Override
        public void show() {
            System.out.println("�����Ʒ1��ʾ������");
        }
    }

    /**
     * �����Ʒ��ProductA
     */
    static class ConcreteProduct2 implements Product {

        @Override
        public void show() {
            System.out.println("�����Ʒ2��ʾ������");
        }
    }

    final class Const {
        static final int PRODUCT_A = 0;
        static final int PRODUCT_B = 1;
        static final int PRODUCT_C = 2;
    }

    static class SimpleFactory {
        public static Product makeProduct(int kind) {
            switch (kind) {
                case Const.PRODUCT_A:
                    return new ConcreteProduct1();
                case Const.PRODUCT_B:
                    return new ConcreteProduct2();

            }
            return null;
        }
    }


}
