package com.principle.demeter.right;

import com.principle.demeter.Project;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ProjectManager
 * @Description  项目经理类
 * @Author Neal
 * @Date 2019/3/1 15:47
 * @Version 1.0
 */
public class ProjectManager {

    /**
     * 展示项目
     */
    public void showProject() {
        //直接模拟有5个项目
        List<Project> projects =  new ArrayList<Project>(5);
        for(Project project : projects) {
            System.out.println("每个项目的内容是 : " + project);
        }
    }
}
