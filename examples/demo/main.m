//
//  main.m
//  example
//
//  Created by Ralf Ebert on 07.11.10.
//  Copyright 2010 __MyCompanyName__. All rights reserved.
//

#import <UIKit/UIKit.h>

int main(int argc, char *argv[]) {

    NSAutoreleasePool * pool = [[NSAutoreleasePool alloc] init];
    int retVal = UIApplicationMain(argc, argv, nil, @"DemoAppDelegate");
    [pool release];
    return retVal;
}
