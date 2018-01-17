
public class HWHelper2 {

	static String getHelperString() {
		String s = "Helper2 says hello - branch1 version" + "\r\n" + 
				HWBranch1Helper.getHelperString();
		s += "\r\n" + "change made to master";
		return s;
	}
	
}
