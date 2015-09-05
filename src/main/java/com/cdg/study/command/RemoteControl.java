package com.cdg.study.command;


/**
 * 리모컨 invoker(호출자) 역할
 * 
 * @author Kanghoon Choi
 */
public class RemoteControl {

	private Command[] onCommands;
	private Command[] offCommands;
	private Command undoCommand;

	public RemoteControl() {
		onCommands = new Command[4];
		offCommands = new Command[4];

		Command noCommand = new NoCommand();
		for (int i = 0; i < 4; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
	}

	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}

	public void onButtonWasPushed(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}

	public void offButtonWasPushed(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
	public void undoButtonWasPushed(int slot) {
		undoCommand.undo();
	}

	public String toString() {
		StringBuffer stringBuff = new StringBuffer();
		stringBuff.append("\n------ Remote Control -------\n");
		for (int i = 0; i < onCommands.length; i++) {
			stringBuff.append("[slot " + i + "] " + onCommands[i].getClass().getName() + "    " + offCommands[i].getClass().getName() + "\n");
		}
		return stringBuff.toString();
	}
}
