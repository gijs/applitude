// © 2011 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

application ExtensionsTest {
	view:Table()
}

type String mapsTo "NSString"

entity Inventor {
	String name
	Inventor inspiredBy
	Inventor[] knows
}

contentprovider AllInventors returns Inventor[] fetches JSON from "..." selects ""
contentprovider OneInventor returns Inventor fetches JSON from "..." selects ""

tableview Table {
	Inventor[] inventors = AllInventors()
	Inventor[] inventor = OneInventor()
	
	section {
		cell Default for i1 in inventors { text: i1 }	
		cell Default for i2 in inventor.knows { text: i2 }	
		cell Default for i3 in inventor.inspiredBy.knows { text: i3 }	
	}
}
