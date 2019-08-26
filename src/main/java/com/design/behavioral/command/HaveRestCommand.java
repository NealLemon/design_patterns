package com.design.behavioral.command;

/**
 * 抽象出来的 消息命令
 */
public class HaveRestCommand implements Command{

    private TrainingOfficer trainingOfficer;

    public HaveRestCommand(TrainingOfficer trainingOfficer) {
        this.trainingOfficer = trainingOfficer;
    }

    @Override
    public void execute() {
        trainingOfficer.haveRest();
    }
}
