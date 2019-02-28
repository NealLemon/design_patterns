package com.principle.singleresponsibility.wrong;

/**
 * @ClassName EmergencyCall
 * @Description 紧急呼叫类
 * @Author Neal
 * @Date 2019/2/28 15:37
 * @Version 1.0
 */
public class EmergencyCall {

    /**
     * 拨打紧急电话
     * @param type
     */
    public void call(int type) {
        if(type == 110) {
            System.out.println("拨打报警电话");
        }else if(type == 120) {
            System.out.println("拨打火警电话");
        }else if(type == 119) {
            System.out.println("拨打急救电话");
        }else{
            System.out.println("未知呼叫");
        }
    }

}
