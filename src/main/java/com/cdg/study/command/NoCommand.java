package com.cdg.study.command;

/**
 * 아무것도 하지않는 명령을 표현. 널객체(Null Object).
 * 
 * @author Kanghoon Choi
 */
public class NoCommand implements Command {
	@Override
	public void execute() {
	}

	@Override
	public void undo() {
	}
}
