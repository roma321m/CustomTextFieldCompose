<h1 align="left">Custom Text Field Compose</h1></br>

<p align="left">
  <a href="https://jitpack.io/#roma321m/CustomTextFieldCompose/1.0.2"><img alt="License" src="https://badgen.net/badge/Jitpack/1.0.2/orange?icon=github"/></a>
  <a href="https://github.com/roma321m"><img alt="Profile" src="https://badgen.net/badge/Github/roma321m/green?icon=github"/></a>
</p><br>

<p align="left">
Custom text fields is built with Jetpack Compose and Material 3 design system.
</p><br>

## Password Text Field
<p align="left">
<img src="https://raw.githubusercontent.com/roma321m/CustomTextFieldCompose/main/readme/Outlined%20Password.gif" width="268"/>
<img src="https://raw.githubusercontent.com/roma321m/CustomTextFieldCompose/main/readme/Filled%20Password.gif" width="268"/>
</p>

## Email Text Field
<p align="left">
<img src="https://raw.githubusercontent.com/roma321m/CustomTextFieldCompose/main/readme/Outlined%20Email.gif" width="268"/>
<img src="https://raw.githubusercontent.com/roma321m/CustomTextFieldCompose/main/readme/Filled%20Email.gif" width="268"/>
</p>
  
## Download
<a href="https://jitpack.io/#roma321m/CustomTextFieldCompose/1.0.2"><img alt="License" src="https://badgen.net/badge/Jitpack/1.0.2/orange?icon=github"/></a>

### Gradle

Add the dependency below to your module's `build.gradle` file:
```gradle
dependencies {
    implementation 'com.github.roma321m:CustomTextFieldCompose:1.0.2'
}
```
Add a repository in your `settings.gradle` file:
```
dependencyResolutionManagement {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
## Usage

There are two required parameters: `value` and `onValueChange`.

```kotlin
var outlinedPassword by remember { mutableStateOf("") }
OutlinedPasswordTextField(
  value = outlinedPassword,
  onValueChange = { newValue ->
    outlinedPassword = newValue
    }
)
```

You can control most of the other field same as in the regular OutlinedTextField and TextField.

# License
```xml
Designed and developed by 2022 roma321m (Roman Michailov)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
