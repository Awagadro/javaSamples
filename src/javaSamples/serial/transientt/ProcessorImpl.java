package javaSamples.serial.transientt;

public class ProcessorImpl implements Processor {

	@Override
	public String process(String code, String name) {
		return code = " : " + name;
	}

}
