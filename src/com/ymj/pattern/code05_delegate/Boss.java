package com.ymj.pattern.code05_delegate;


/**
 * @Classname Boss
 * @Description TODO
 * @Date 2021/6/11 14:26
 * @Created by yemingjie
 */
public class Boss {

    public void command(String command, Leader leader) {
        leader.doing(command);
    }
}
