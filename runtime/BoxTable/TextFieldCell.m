//
//  Created by Devin Ross on 7/1/09.
//
/*

 tapku.com || http://github.com/devinross/tapkulibrary

 Permission is hereby granted, free of charge, to any person
 obtaining a copy of this software and associated documentation
 files (the "Software"), to deal in the Software without
 restriction, including without limitation the rights to use,
 copy, modify, merge, publish, distribute, sublicense, and/or sell
 copies of the Software, and to permit persons to whom the
 Software is furnished to do so, subject to the following
 conditions:

 The above copyright notice and this permission notice shall be
 included in all copies or substantial portions of the Software.

 THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 OTHER DEALINGS IN THE SOFTWARE.

 */

#import "TextFieldCell.h"

#import "Row.h"
#import "LogUtils.h"

@implementation TextFieldCell
@synthesize textField = _textField, onReturn = _onReturn;

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

- (Property *) model {
	return _binding.model;
}

- (void) setModel:(Property *) model {
	[_binding unbind];
	if (model != nil) {
		_binding = [model bindTo:[[Property alloc] initWithObject:self.textField property:@"text"]];
	}
}

- (void)dealloc {
	NSLog(@"✝ %@", self);
	self.onReturn = nil;
	self.textField = nil;
	[super dealloc];
}

- (BOOL)textFieldShouldReturn:(UITextField *)textField {
	self.model.value = self.textField.text;
	[self.onReturn performWithObject:textField];
	return YES;
}

@end
