package com.cdg.study.command;

import static org.junit.Assert.*;

import org.junit.Test;

public class CommandTest {

	@Test
	public void test() throws Exception {
		SimpleRemoteControl remote = new SimpleRemoteControl();
		Light light = new Light();
		
		LightOnCommand lightOn = new LightOnCommand(light);

		remote.setCommand(lightOn);
		remote.buttonWasPressed();
	}
}
