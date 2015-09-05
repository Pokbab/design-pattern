package com.cdg.study.command;

/**
 * 여러개의 명령을 한번에 실행시키기 위한 매크로명령
 * 
 * @author Kanghoon Choi
 */
public class MacroCommand implements Command {

	private Command[] commands;

	public MacroCommand(Command[] commands) {
		this.commands = commands;
	}

	public void execute() {
		for (Command command : commands) {
			command.execute();
		}
	}

	/**
	 * NOTE: these commands have to be done backwards to ensure proper undo functionality
	 */
	public void undo() {
		for (int i = commands.length - 1; i >= 0; i--) {
			commands[i].undo();
		}
	}
}
