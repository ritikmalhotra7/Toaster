# Toaster
#### This library will help you to customise your toast :bread: into a crispier one
#### Current latest version : 1.0.0 

> Step 1. Add it in your root build.gradle at the end of repositories:
```gradle
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  ```
  > Step 2. Add the dependency
  ```gradle
  dependencies {
	        implementation 'com.github.ritikmalhotra7:Toaster:Tag'
	}
  ```
  #### Here are some features you can enjoy with this library :wink:
- msg => message for the toast : String default => ""
- duration => duration for your toast : Int default => Toast.LENGTH_SHORT
- textColor => text color inside toast : Int default => getColor(ctx, R.color.white) i.e #FFFFFFFF
- toastColor => background color of toast : Int default => getColor(ctx, R.color.toast_background) i.e #666666
- cornerRadius => radius for corners of toast : Float default => 50f
- strokeWidth => stroke width of toast : Int default => 0
- strokeColor => stroke color of toast : Int default => getColor(ctx, R.color.black) i.e #FF000000
- iconDrawable => drawable icon for toast : Drawable? default => null

This is a very simple library, there is a single function in which you have to pass your requirments and see the magic :magic_wand: 
```koltin
 Toaster().customToast(...)
 ```
