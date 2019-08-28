package com.design.behavioral.chain;

/**
 * 审查接口
 */
public interface Investigation {

    /**
     * 审核接口
     * @param person  审核的人
     * @return
     */
    boolean investigate(Person person);
}
