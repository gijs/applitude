---
title: applitude
layout: default
---

[GitHub](https://github.com/ralfebert/applitude/) |
[Issues](http://ralfebert.lighthouseapp.com/projects/67904/) |

# ![applitude](applitude.png)

applitude is a runtime framework and a domain-specific language for iPhone application development. It is an extended, iPhone-only version of the [Applause](http://code.google.com/p/applause/) project. You can get it from the [GitHub project page](http://github.com/ralfebert/applitude) or by running:

	$ git clone git://github.com/ralfebert/applitude



## Overview

applitude comes with a domain specific language ("DSL") that allows to express frequently needed parts of iPhone applications in a very dense format. This language is made-to-measure to express iPhone apps, so instead of keywords like `if`, `then`, `while` for regular programming languages, it has keywords like `contentprovider`, `tableview`, `section` or `cell`.

For example, this application displays [JSON data](https://github.com/ralfebert/applitude/blob/gh-pages/demo/devices.json) about inventors loaded from an URL:

![Screenshots Inventors demo application](demo.png)

Written manually, you would have to care about many aspects like doing the HTTP requests, parsing the JSON data, showing activity indicators while the app is loading, feeding the data into tables when it gets available, responding to the `UITableViewDataSource` protocol, handling errors, navigating between the views, caching the data, loading images in the background and so on and on.

Instead, you could also write this [`demo.app`](https://github.com/ralfebert/applitude/blob/master/examples/demo/demo.app) document:

	application Demo {
		view:Tabs()
	}

	tabview Tabs {
		tab {
			title: "Inventors"
			view: Inventors()
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

	contentprovider AllInventors returns Inventor[] fetches JSON from
		"http://ralfebert.github.com/applitude/demo/inventors.json" selects ""

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
			}
		}
	}

You can edit this document in a convenient editor featuring code completion and instant error checking by installing the applitude plug-ins into the Eclipse IDE (these plug-ins are available because applitude's DSL is built using the marvelous [Xtext language development framework](http://www.eclipse.org/Xtext/)):

![applitude demo application editor](demo_ide.png)

Then, as soon as you hit save, Objectice C code is generated for `demo.app`. The generated code is small and tidied up by making use of runtime components wherever possible. Have a look at [InventorDetailViewController](https://github.com/ralfebert/applitude/blob/master/examples/demo/Generated/InventorDetailViewController.m) for an example of the kind of code generated for applitude apps.

Last but not least, the runtime components utilized by the generated code are not tied to the DSL at all and you can utilize them in hand-written code as well; the DSL just adds a very convenient layer on top. But why write boring code by hand if you can express it using a more appropriate language?

## Ok, where is the catch?

The project is work in progress. Things will change without prior notice, you will encounter bugs and missing documentation and mostly you will need to help yourself. applitude is not for building iPhone apps the lazy way, you will need to have good knowledge of iPhone development in Objective C and some knowledge of building DSLs with Eclipse Xtext to put this tool to use.

## Getting started

* At first, I recommend to learn about Xtext DSLs, for example by following the tutorial in the [Xtext Getting started documentation](http://www.eclipse.org/Xtext/documentation/).
* I wrote a tutorial for the original Applause project which shows [how to install everything and create a project from scratch](http://www.ralfebert.de/blog/xtext/applause_new_app/). Almost everything still holds true for applitude.
* Import the example projects in Eclipse, inspect the `*.app` documents, run the projects from Xcode, inspect the generated code.

## Demo Example project

[`examples/demo/`](https://github.com/ralfebert/applitude/tree/master/examples/demo) contains the Inventors example which fetches JSON content via HTTP and shows it using tables:

![Screenshots demo application: Inventors](demo.png)

It also contains a reference part (showing the language features) and a test suite (based on [GHUnit](https://github.com/gabriel/gh-unit/), see the Tests target):

![Screenshots demo application: reference and unit tests](demo_reference.png)




## Appendix

### Expression Model Objects

<a name="model_expressions"> </a>

![Expression Model Objects](reference_expressions.png)

## Licenses

applitude is licensed under the [Eclipse Public License v1.0](http://www.eclipse.org/legal/epl-v10.html).

Some runtime components have different licenses:

* ASIHTTPRequest, TouchXML, Reachability, parts of NSDate+Utils: BSD license
* TouchJSON, GHUnit, TextFieldCell: MIT license
* TTGlobalNetwork, UIView+Coordinates, parts of URLUtils: Apache License
* UIImage+Alpha/Resize/RoundedCorner: Other licenses

This document is licensed under <a rel="license" href="http://creativecommons.org/licenses/by-sa/3.0/"><img alt="Creative Commons License" style="border-width:0" src="http://i.creativecommons.org/l/by-sa/3.0/80x15.png" /></a>
