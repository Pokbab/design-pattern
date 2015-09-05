package com.cdg.study.command;

/**
 * 명령 인터페이스
 * 
 * @author Kanghoon Choi
 */
public interface Command {

	/**
	 * 작업수행
	 */
	public void execute();
	
	/**
	 * 작업취소
	 */
	public void undo();
}
