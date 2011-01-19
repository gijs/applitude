---
title: iApplause
layout: default
---

# iApplause

iApplause is an iPhone-centric version of the [Applause](http://code.google.com/p/applause/) Xtext DSL for mobile development, very much extended and tailored to suit my own needs.

## Introduction

iApplause provides a short, crisp domain specific language to describe the boring parts of iPhone applications, which usually are manually coded over and over again, like this:

	application HelloWorld {
		view:DeviceList(Devices())
	}

	entity Device {
		String name
	}

	contentprovider Devices returns Device[] fetches JSON from "http://localhost/devices"

	tableview DeviceList(Device[] devices) {
		title: "iOS Devices"
		section {
			cell Default foreach devices as device { text: device.name }
		}
	}

iApplause is developed using the marvelous [Xtext language development framework](http://www.eclipse.org/Xtext/), so it comes with an Eclipse IDE plug-in to edit these documents. And there is a code generator which generates iPhone applications from such a DSL document.

## How to get started

At first, a warning: the project currently is very much work in progress and therefore not very well documented yet; you will find loose ends and corners. You'll only get something out of it if you're seriously into Xtext DSLs and iPhone development; if you're looking for an out-of-the-box solution to generate iPhone apps I recommend looking elsewhere.

It works great for my own projects and I'm making it open source because I'm standing on the shoulders of giants here; I would never have taken that road without the Xtext project and the initial Applause code being open source; both very much spurred my interest in using DSL languages for my day-to-day development work.

I recommend learning about the Xtext framework first, for example by reading the [Xtext Getting started documentation](http://www.eclipse.org/Xtext/documentation/).

I wrote a tutorial for the original Applause project which shows [how to install everything and create a project from scratch](http://www.ralfebert.de/blog/xtext/applause_new_app/). Almost everything still holds true for iApplause.

There also is a working example project at `examples/helloworld/helloworld.applause`.

## Download

You can download the project in either:

<div class="download">
  <a href="http://github.com/ralfebert/iApplause/zipball/master">
    <img border="0" width="90" src="http://github.com/images/modules/download/zip.png"></a>
  <a href="http://github.com/ralfebert/iApplause/tarball/master">
    <img border="0" width="90" src="http://github.com/images/modules/download/tar.png"></a>
</div>

You can also clone the project with [Git](http://git-scm.com) by running:

	$ git clone git://github.com/ralfebert/iApplause

Or get the source code on the [GitHub project page](http://github.com/ralfebert/iApplause)

## License

Mostly BSD / EPL, see source headers