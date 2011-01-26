// © 2009, 2010 Devin Ross, Ralf Ebert
// Adapted from https://github.com/devinross/tapkulibrary
// Made available under MIT License, http://www.opensource.org/licenses/mit-license.php

#import "TextFieldCell.h"

#import "LogUtils.h"

@implementation TextFieldCell
@synthesize textField = fTextField, onReturn = fOnReturn;

- (id) init {
	if (self = [super initWithStyle:UITableViewCellStyleDefault reuseIdentifier:nil]) {
		self.textField = [[UITextField alloc] initWithFrame:CGRectZero];
		[self addSubview:self.textField];
		self.textField.font = [UIFont boldSystemFontOfSize:16.0];
		self.textField.delegate = self;
    }
    return self;
}

- (void) layoutSubviews {
    [super layoutSubviews];

	CGRect r = CGRectInset(self.bounds, 16, 13);
	r.origin.x += 120;
	r.size.width -= 120;
	r.size.height += 5;
	self.textField.frame = r;
}

- (void)willTransitionToState:(UITableViewCellStateMask)state{
	[super willTransitionToState:state];
	[self setNeedsDisplay];
}

- (void)setSelected:(BOOL)selected animated:(BOOL)animated {
	[super setSelected:NO animated:NO];
	if (selected) {
		[self.textField becomeFirstResponder];
	}
}

- (BOOL)textFieldShouldReturn:(UITextField *)textField {
	[textField willChangeValueForKey:@"text"];
	[textField didChangeValueForKey:@"text"];
	[self.onReturn performWithObject:textField];
	return YES;
}

- (void)dealloc {
	LogDealloc;
	self.onReturn = nil;
	self.textField = nil;
	[super dealloc];
}

@end
