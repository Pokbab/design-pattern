package com.cdg.study.command;

import java.util.*;

/**
 * 간단한 리모컨
 * invoker(호출자) 역할
 * 
 * @author Kanghoon Choi
 */
public class SimpleRemoteControl {
	private Command slot;
 
	public void setCommand(Command command) {
		slot = command;
	}
 
	public void buttonWasPressed() {
		slot.execute();
	}
}
