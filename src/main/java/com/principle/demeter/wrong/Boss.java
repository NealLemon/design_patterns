package com.principle.demeter.wrong;

import com.principle.demeter.Project;

import java.util.ArrayList;
import java.util.List;

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
        //直接模拟有5个项目
        List<Project> projects =  new ArrayList<Project>(5);
        projectManager.showProject(projects);
    }
}
