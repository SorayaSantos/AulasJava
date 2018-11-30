package io.altar.StateMachine.State;

import io.altar.StateMachine.utils.ScannerUtils;

public interface State {
	
	public static final ScannerUtils scannerUtils = new ScannerUtils();
	public int execute();
	
	
}
