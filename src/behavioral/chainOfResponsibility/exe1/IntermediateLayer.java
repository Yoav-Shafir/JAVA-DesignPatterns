package behavioral.chainOfResponsibility.exe1;

public class IntermediateLayer implements HelpInterface {

	final int INTERMEDIATE_LAYER_HELP = 2;
	HelpInterface successor;

	public IntermediateLayer(HelpInterface s) {
		successor = s;
	}

	@Override
	public void getHelp(int helpConstant) {
		if (helpConstant != INTERMEDIATE_LAYER_HELP) {
			successor.getHelp(helpConstant);
		} else {
			System.out.println("This is the intermediate layer handling the case.");
		}
	}
}
