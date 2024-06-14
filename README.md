# pop-back-stack-issue

If `popBackStack()` function of nav-controller is used to pop the last screen on user action, it can pop more than one screen when the button is clicked multiple times fast. 

<p align="center">
  <img width="296" height="600"  src="https://github.com/raheemadamboev/pop-back-stack-issue/blob/main/banner_1.gif" />
</p>

`navigateUp()` of nav-controller should be used when the last screen needs to be popped on user action. This function won't pop more than one screen when the button is clicked multiple times fast.

<p align="center">
  <img width="296" height="600"  src="https://github.com/raheemadamboev/pop-back-stack-issue/blob/main/banner_2.gif" />
</p>

## Download demo

[Download demo](https://github.com/raheemadamboev/pop-back-stack-issue/blob/main/app-debug.apk)
