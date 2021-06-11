package com.ymj.pattern.code05_delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * @Classname Leader
 * @Description TODO
 * @Date 2021/6/11 14:20
 * @Created by yemingjie
 */
public class Leader implements IEmployee{


    private Map<String,IEmployee> targets = new HashMap<String,IEmployee>();

    public Leader() {
        targets.put("��¼", new EmployeeA());
        targets.put("����", new EmployeeB());
    }

    /**
     * //��Ŀ�����Լ����ɻ�
     * @param command
     */
    @Override
    public void doing(String command) {
        targets.get(command).doing(command);
    }
}
