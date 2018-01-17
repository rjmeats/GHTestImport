
public class HWHelper2 {

	static String getHelperString() {
		return "Helper2 says hello - branch1 version" + "\r\n" + 
				HWBranch1Helper.getHelperString();
	}
}
