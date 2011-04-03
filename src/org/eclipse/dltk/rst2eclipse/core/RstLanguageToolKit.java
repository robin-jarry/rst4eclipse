package org.eclipse.dltk.rst2eclipse.core;

import org.eclipse.dltk.core.AbstractLanguageToolkit;
import org.eclipse.dltk.core.IDLTKLanguageToolkit;

public class RstLanguageToolKit extends AbstractLanguageToolkit {

	private static RstLanguageToolKit INSTANCE;
	
	private RstLanguageToolKit() {
	}
	
	public static IDLTKLanguageToolkit getDefault() {
		if (INSTANCE == null) {
			INSTANCE = new RstLanguageToolKit();
		}
		return INSTANCE;
	}
	
	@Override
	public String getLanguageContentType() {
		return "org.eclipse.dltk.rst2eclipse.content-type";
	}

	@Override
	public String getLanguageName() {
		return "ReStructuredText";
	}

	@Override
	public String getNatureId() {
		return RstNature.RST_NATURE;
	}

}
