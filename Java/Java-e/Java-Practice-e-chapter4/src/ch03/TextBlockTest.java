package ch03;

public class TextBlockTest {

	// text block ����ϱ�, java 13��������
	public static void main(String[] args) {

		String textBlocks = """
				Hello,
				hi,
				how r u""";
		System.out.println(textBlocks);
		System.out.println(getBlockOfHtml());
	}
	
	
	public static String getBlockOfHtml() {
	    return """
	            <html>

	                <body>
	                    <span>example text</span>
	                </body>
	            </html>""";
	
	}

}
