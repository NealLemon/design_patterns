package com.design.behavioral.command;

/**
 * 立正抽象方法
 */
public class AttentionCommand implements Command{

    private TrainingOfficer trainingOfficer;

    public AttentionCommand(TrainingOfficer trainingOfficer) {
        this.trainingOfficer = trainingOfficer;
    }

    @Override
    public void execute() {
        trainingOfficer.attention();
    }
}
