#import "org_apertium_lttoolbox_process_Node.h"

// Automatically generated by xmlvm2obj. Do not edit!


#import "org_apertium_lttoolbox_process_Transition.h"


@implementation org_apertium_lttoolbox_process_Transition;

+ (void) initialize
{
    if (strcmp(class_getName(self), "org_apertium_lttoolbox_process_Transition") == 0) {
    }
}

- (id) init
{
    if (self = [super init]) {
        org_apertium_lttoolbox_process_Transition_dest = (id) [NSNull null];
        org_apertium_lttoolbox_process_Transition_next = (id) [NSNull null];
    }
    return self;
}

- (void) dealloc
{
    [org_apertium_lttoolbox_process_Transition_dest release];
    [org_apertium_lttoolbox_process_Transition_next release];
    [super dealloc];
}

- (int) _GET_output_symbol
{
    return org_apertium_lttoolbox_process_Transition_output_symbol;
}

- (void) _PUT_output_symbol: (int) v
{
    org_apertium_lttoolbox_process_Transition_output_symbol = v;
}

- (org_apertium_lttoolbox_process_Node*) _GET_dest
{
    return [[org_apertium_lttoolbox_process_Transition_dest retain] autorelease];
}

- (void) _PUT_dest: (org_apertium_lttoolbox_process_Node*) v
{
    [v retain];
    [org_apertium_lttoolbox_process_Transition_dest release];
    org_apertium_lttoolbox_process_Transition_dest = v;
}

- (org_apertium_lttoolbox_process_Transition*) _GET_next
{
    return [[org_apertium_lttoolbox_process_Transition_next retain] autorelease];
}

- (void) _PUT_next: (org_apertium_lttoolbox_process_Transition*) v
{
    [v retain];
    [org_apertium_lttoolbox_process_Transition_next release];
    org_apertium_lttoolbox_process_Transition_next = v;
}

- (void) __init_org_apertium_lttoolbox_process_Transition__
{
    XMLVMElem _stack[1];
    XMLVMElem _locals[1];
    int _sp = 0;
    XMLVMElem _op1, _op2, _op3;
    NSAutoreleasePool* _pool = [[NSAutoreleasePool alloc] init];
    _locals[0].o = self;
    label0:;
    _stack[_sp++].o = _locals[0].o;
    _sp -= 1;
    [((super)) __init_java_lang_Object__];
    label1:;
    [_pool release];
    return;
}



@end

