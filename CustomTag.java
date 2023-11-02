package com.example;

import java.io.IOException;
import jakarta.servlet.jsp.tagext.TagSupport;

//public class CustomTag extends TagSupport {
//
//	@Override
//	public int doStartTag() {
//		try {
//			DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
//			pageContext.getOut().print(df.format(LocalDateTime.now()));
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		return SKIP_BODY;
//	}
//}

public class CustomTag extends TagSupport {
	@Override
	public int doStartTag() {
		try {
			pageContext.getOut().print("This text come custom tag");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return SKIP_BODY;
	}
}
