// Copyright 2011-2012 Paulo Augusto Peccin. See licence.txt distributed with this file.

package atari.console.savestate;

import java.io.Serializable;

import general.av.video.VideoStandard;
import general.m6502.M6502.M6502State;
import atari.cartridge.Cartridge;
import atari.pia.PIA.PIAState;
import atari.pia.RAM.RAMState;
import atari.tia.TIA.TIAState;

public class ConsoleState implements Serializable {

	public ConsoleState(TIAState tia, PIAState pia, RAMState ram, M6502State cpu, Cartridge cartridge, VideoStandard videoStandard) {
		this.tiaState = tia;
		this.piaState = pia;
		this.ramState = ram;
		this.cpuState = cpu;
		try { 
			this.cartridge = (Cartridge)cartridge.clone(); 
		} catch (CloneNotSupportedException e) {}
		this.videoStandard = videoStandard;
	}

	public TIAState tiaState;
	public PIAState piaState;
	public RAMState ramState;
	public M6502State cpuState;
	public Cartridge cartridge;
	public VideoStandard videoStandard;


	private static final long serialVersionUID = 2L;

}