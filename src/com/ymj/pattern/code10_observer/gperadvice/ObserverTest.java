package com.ymj.pattern.code10_observer.gperadvice;

/**
 * @Classname ObserverTest
 * @Description
 * 优点： 1、观察者和被观察者之间建立了一个抽象的耦合。 2、观察者模式支持广播通信。
 * 缺点： 1、观察者之间有过多的细节依赖、提高时间消耗及程序的复杂度。 2、使用要得当，要避免循环调用。
 * @Date 2021/6/17 11:24
 * @Created by yemingjie
 */
public class ObserverTest {
    public static void main(String[] args) {
        GPer gper = GPer.getInstance();
        Teacher tom = new Teacher("Tom");
        Teacher mic = new Teacher("Mic");

        gper.addObserver(tom);
        gper.addObserver(mic);

        //
        Question question = new Question();
        question.setUserName("小明");
        question.setContent("观察者模式适用于哪些场景？");

        gper.publishQuestion(question);
    }
}
