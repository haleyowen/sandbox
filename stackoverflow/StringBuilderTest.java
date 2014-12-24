public class StringBuilderTest {
	public static void main(String[] args) {

		String relativeDN = "cn=abc,dn=xyz,ou=abc/def";
		String[] stringData = relativeDN.split(",");

		StringBuilder sb = new StringBuilder();
		String prefix = "";
		for (String stringoutput : stringData) {
			sb.append(prefix);
			prefix=",";
			sb.append(stringoutput);
		}
		System.out.println(sb.toString());
	}
}