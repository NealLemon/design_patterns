package com.design.behavioral.command;


import java.util.ArrayList;
import java.util.List;

public class CommandTest {

    public static void main(String[] args) {
        TrainingOfficer trainingOfficer = new TrainingOfficer();
        HaveRestCommand haveRestCommand  = new HaveRestCommand(trainingOfficer);
        AttentionCommand attentionCommand = new AttentionCommand(trainingOfficer);

        //教练抽风经常多次稍息立正我们就把这些命令封装成一组
        List<Command> commandList = new ArrayList<>();
        commandList.add(haveRestCommand);
        commandList.add(attentionCommand);
        commandList.add(haveRestCommand);
        commandList.add(attentionCommand);
        for (Command command : commandList) {
            command.execute();
        }
    }
}
