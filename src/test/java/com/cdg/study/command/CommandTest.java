package com.cdg.study.command;

import static org.junit.Assert.*;

import org.junit.Test;

public class CommandTest {

	@Test
	public void test() throws Exception {
		RemoteControl remoteControl = new RemoteControl();
		
		Light livingRoomLight = new Light("거실");
		Light kitchenLight = new Light("주방");
		Stereo stereo = new Stereo("거실");
		
		LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
		LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
		LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
		
		StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		
		remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
		remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
		remoteControl.setCommand(2, stereoOn, stereoOff);
		
		System.out.println(remoteControl);
		
		remoteControl.onButtonWasPushed(0);
		remoteControl.offButtonWasPushed(0);
		remoteControl.undoButtonWasPushed(0);
		
		remoteControl.onButtonWasPushed(1);
		remoteControl.offButtonWasPushed(1);
		remoteControl.undoButtonWasPushed(1);
		
		remoteControl.onButtonWasPushed(2);
		remoteControl.offButtonWasPushed(2);
		remoteControl.undoButtonWasPushed(2);
		
		remoteControl.onButtonWasPushed(3);
		remoteControl.offButtonWasPushed(3);
	}
	
	@Test
	public void testMacro() throws Exception {
		RemoteControl remoteControl = new RemoteControl();
		
		Light livingRoomLight = new Light("거실");
		Stereo stereo = new Stereo("거실");
		
		LightOnCommand lightOn = new LightOnCommand(livingRoomLight);
		LightOffCommand lightOff = new LightOffCommand(livingRoomLight);
		
		StereoOnWithCDCommand stereoOn = new StereoOnWithCDCommand(stereo);
		StereoOffCommand stereoOff = new StereoOffCommand(stereo);
		
		Command[] partyOn = { lightOn, stereoOn};
		Command[] partyOff = { lightOff, stereoOff};
  
		MacroCommand partyOnMacro = new MacroCommand(partyOn);
		MacroCommand partyOffMacro = new MacroCommand(partyOff);
 
		remoteControl.setCommand(0, partyOnMacro, partyOffMacro);
  
		System.out.println(remoteControl);
		System.out.println("--- Pushing Macro On---");
		remoteControl.onButtonWasPushed(0);
		System.out.println("--- Pushing Macro Off---");
		remoteControl.offButtonWasPushed(0);
	}
}
