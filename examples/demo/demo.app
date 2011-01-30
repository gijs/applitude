// © 2011 Ralf Ebert
// Made available under Eclipse Public License v1.0, http://www.eclipse.org/legal/epl-v10.html

application Demo {
	view:Tabs()
}

tabview Tabs {
	tab {
		title: "Inventors"
		view: Inventors()
		icon: "lightbulb.png"
	}
	tab {
		title: "Reference"
		view: Reference()
		icon: "book.png"
	}
}

type String mapsTo "NSString"

entity Inventor {
	String name
	String imageUrl
	Invention[] inventions
}

entity Invention {
	String name
}

contentprovider AllInventors stores Inventor[] fetches JSON from "http://applitude.org/demo/inventors.json" selects ""

tableview Inventors {
	Inventor[] inventors = AllInventors()

	title: "Inventors"

	section {
		cell Default for inventor in inventors {
			text: inventor.name
			image: inventor.imageUrl
			action: InventorDetail(inventor)
		}
	}
}

tableview InventorDetail(Inventor inventor) {
	title: inventor.name
	style: Grouped

	section {
		cell Value2 {
			text: "Name"
			details: inventor.name
		}
	}

	section {
		title: "Inventions"
		cell Default for invention in inventor.inventions {
			text: invention.name
			action: InventionDetail(invention)
		}
	}
}

tableview InventionDetail(Invention invention) {
	title: invention.name
	style: Grouped
}





tableview Reference {
	title: "Reference"
	titleImage: "applitude.png"

	section {
		cell Default {
			text: "Cell styles"
			action: ReferenceCellStyles()
		}
		cell Default {
			text: "cell foreach"
			action: ReferenceCellForeach()
		}
		cell Default {
			text: "section + cell foreach"
			action: ReferenceSectionCellForeach()
		}
		cell Default {
			text: "Error handling"
			action: ReferenceErrorHandling()
		}
		cell Default {
			text: "Custom Content Providers"
			action: ReferenceCustomContentProviders()
		}
		cell Default {
			text: "Entity models"
			action: ReferenceEntityModels()
		}
	}

}

tableview ReferenceCellStyles {
	title: "Cell styles"

	section {
		cell Default { text: "Style Default" }
		cell Subtitle { text: "Style" details: "Subtitle" }
		cell Value1 { text: "Style" details: "Value1" }
		cell Value2 { text: "Style" details: "Value2" }
	}

}

tableview ReferenceCellForeach {
	Inventor[] inventors = AllInventors()

	title: "cell foreach"

	section {
		cell Default for inventor in inventors {
			text: inventor.name
			accessory: Link
			action: InventorDetail(inventor)
		}
	}

}

tableview ReferenceSectionCellForeach {
	Inventor[] inventors = AllInventors()

	title: "section/cell foreach"

	section for inv in inventors {
		title: inv.name
		cell Default for invention in inv.inventions {
			text: invention.name
			action: InventionDetail(invention)
		}
	}

}

contentprovider Error returns Inventor[] fetches JSON from "http://localhost/none.json" selects ""

tableview ReferenceErrorHandling {
	Inventor[] inventors = Error()

	title: "Error handling"
	style: Grouped

	section {
		cell Default for inventor2 in inventors {
			text: inventor2.name
		}
	}

	section for inv in inventors {
		title: inv.name
		cell Default for invention in inv.inventions {
			text: invention.name
			action: InventionDetail(invention)
		}
	}

}

contentprovider Date returns String class DateContentProvider
contentprovider StoredDate stores String class DateContentProvider

tableview ReferenceCustomContentProviders {
	Inventor[] date = Date()
	Inventor[] storedDate = StoredDate()
	
	section {
		title: "Custom Content"
		cell Default { text: date }
	}

	section {
		title: "Custom Content (stored)"
		cell Default { text: storedDate }
	}
	
}


entity Login {
	String username
	String password
}

contentprovider MyLogin returns Login

tableview ReferenceEntityModels {
	Login login = MyLogin()

	style: Grouped
	title: "Login"
	section {
		cell Value1 { text: "Username" details:login.username }
		cell Value1 { text: "Password" details:login.password }
	}
}