// © 2009, 2010 Devin Ross, Ralf Ebert
// Made available under MIT License, http://www.opensource.org/licenses/mit-license.php

#import "Action.h"

@interface TextFieldCell : UITableViewCell<UITextFieldDelegate> {
	UITextField *fTextField;
	NSObject<Action> *fOnReturn;
}

@property (retain, nonatomic) UITextField *textField;
@property (retain, nonatomic) NSObject<Action> *onReturn;

@end
