package com.principle.demeter.right;


/**
 * @ClassName Boss
 * @Description BOSS类
 * @Author Neal
 * @Date 2019/3/1 15:46
 * @Version 1.0
 */
public class Boss {

    /**
     * 让项目经理汇报项目
     * @param projectManager  项目经理
     */
    public void showMeProject(ProjectManager projectManager) {
        projectManager.showProject();
    }
}
