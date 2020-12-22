# Android Custom Keyboard

A simplistic Android system keyboard implementation giving dummy suggestions,
based on https://github.com/blackcj/AndroidCustomKeyboard.

## Installation

1. Create a new project in Android Studio. Select "Empty Activity" as initial project.
1. Replace the project's *src* folder with the *src* folder of this repository.
1. You should be able to run the project on your AVD device.
1. This gives the error *Could not identify launch activity: Default Activity not found*, because no Activity is defined in the project.
1. However, the new Keyboard is available and can be selected. In your AVD device, go to settings -> system -> language -> on-screen keyboard and press *Manage on-screen keyboards*. Here you can add the new *Sample Soft Keyboard*.
