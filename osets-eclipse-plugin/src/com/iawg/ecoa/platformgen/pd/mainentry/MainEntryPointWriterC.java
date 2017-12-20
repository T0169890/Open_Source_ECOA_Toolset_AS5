/*
 * Copyright 2017, BAE Systems Limited and GE Aviation Limited.
 *  
 * This software and its outputs are not claimed to be fit or safe for any purpose. Any user should
 * satisfy themselves that this software or its outputs are appropriate for its intended purpose.
*/
package com.iawg.ecoa.platformgen.pd.mainentry;

import java.nio.file.Path;

import com.iawg.ecoa.SourceFileWriter;
import com.iawg.ecoa.platformgen.PlatformGenerator;
import com.iawg.ecoa.platformgen.common.WriterSupport;
import com.iawg.ecoa.systemmodel.deployment.SM_ProtectionDomain;

public class MainEntryPointWriterC extends SourceFileWriter {
	private SM_ProtectionDomain pd;

	public MainEntryPointWriterC(PlatformGenerator platformGenerator, Path outputDir, SM_ProtectionDomain pd) {
		super(outputDir);
		this.pd = pd;

		setFileStructure();
	}

	@Override
	public void open() {
		super.openFile(outputDir.resolve("main.c"));
	}

	@Override
	protected void setFileStructure() {
		// Set the file structure
		String fileStructure = "#PREAMBLE#" + LF + "#MAIN#" + LF;

		codeStringBuilder.append(fileStructure);
	}

	public void writeMain() {
		String mainEntryText = "#include <stdio.h>" + LF + "#include <unistd.h>" + LF + LF + "#include \"posix_apos_binding.h\"" + LF + LF +

				"#include \"" + pd.getName() + "_PD_Controller.h\"" + LF + LF +

				"int main()" + LF + "{" + LF + "   posix_apos_binding__Initialise();" + LF +

				"   " + pd.getName() + "_PD_Controller__Initialise();" + LF + LF +

				"   printf(\"Returned from PD Controller... error\\n\");" + LF + LF +

				"   while (1)" + LF + "   {" + LF + "      sleep(10);" + LF + "      printf(\"Died!...\\n\");" + LF + "   }" + LF + LF +

				"}" + LF;

		// Replace the #MAIN# tag in string builder
		WriterSupport.replaceText(codeStringBuilder, "#MAIN#", mainEntryText);
	}

	public void writePreamble() {
		String preambleText = "/* File main.c */" + LF;

		// Replace the #PREAMBLE# tag in string builder
		WriterSupport.replaceText(codeStringBuilder, "#PREAMBLE#", preambleText);
	}
}
