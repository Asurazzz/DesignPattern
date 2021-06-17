package com.ymj.pattern.code08_adapter.objectadapter;

/**
 * @Classname PowerAdapter
 * @Description TODO
 * @Date 2021/6/17 10:29
 * @Created by yemingjie
 */
public class PowerAdapter implements DC5{

    private AC220 ac220;
    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int outputDC5V() {
        int adapterInput = ac220.outputAC220V();
        // 变压器
        int adapterOutput =  adapterInput / 44;
        System.out.println("使用 PowerAdapter 输入 AC:"+adapterInput+"V"+"输出 DC:"+adapterOutput+"V");
        return adapterOutput;
    }
}
