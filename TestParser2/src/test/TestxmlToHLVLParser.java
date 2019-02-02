package test;

import org.junit.jupiter.api.Test;
import utils.ParsingParameters;
import xmlToHLVLParser.VariamosXMLToHlvlParser;

class TestxmlToHLVLParser {

	private VariamosXMLToHlvlParser parser;
	
	@Test
	void test() {
		
		int i=1;
		ParsingParameters params= new ParsingParameters();
		
		params.setInputPath("test-data/xmlToHLVLFiles");
		params.setOutputPath("test-data/HLVLFiles/");
		params.setTargetName("testXmlToHLVL"+i);
		
		parser = new VariamosXMLToHlvlParser(params);
		parser.loadArrayLists();
		try {
			parser.parse();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
