# rr

![Build](https://github.com/zerolfx/rr/workflows/Build/badge.svg)
[![Version](https://img.shields.io/jetbrains/plugin/v/21572.svg)](https://plugins.jetbrains.com/plugin/21572)
[![Downloads](https://img.shields.io/jetbrains/plugin/d/21572.svg)](https://plugins.jetbrains.com/plugin/21572)

## Template ToDo list
- [x] Create a new [IntelliJ Platform Plugin Template][template] project.
- [X] Get familiar with the [template documentation][template].
- [X] Adjust the [pluginGroup](./gradle.properties), [plugin ID](./src/main/resources/META-INF/plugin.xml) and [sources package](./src/main/kotlin).
- [X] Adjust the plugin description in `README` (see [Tips][docs:plugin-description])
- [X] Review the [Legal Agreements](https://plugins.jetbrains.com/docs/marketplace/legal-agreements.html?from=IJPluginTemplate).
- [x] [Publish a plugin manually](https://plugins.jetbrains.com/docs/intellij/publishing-plugin.html?from=IJPluginTemplate) for the first time.
- [X] Set the `PLUGIN_ID` in the above README badges.
- [ ] Set the [Plugin Signing](https://plugins.jetbrains.com/docs/intellij/plugin-signing.html?from=IJPluginTemplate) related [secrets](https://github.com/JetBrains/intellij-platform-plugin-template#environment-variables).
- [ ] Set the [Deployment Token](https://plugins.jetbrains.com/docs/marketplace/plugin-upload.html?from=IJPluginTemplate).
- [x] Click the <kbd>Watch</kbd> button on the top of the [IntelliJ Platform Plugin Template][template] to be notified about releases containing new features and fixes.

<!-- Plugin description -->
Adds [rr-debugger](https://rr-project.org/) support to CLion. 
Follow the [instruction](https://github.com/rr-debugger/rr/wiki/Using-rr-in-an-IDE#setting-up-clion) from rr to set up the plugin.

Features:
- Add buttons for reverse execution, step over, step into, step out, and continue.
- Works with both classic UI and new UI.
<!-- Plugin description end -->

## Installation

- Using IDE built-in plugin system:
  
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>Marketplace</kbd> > <kbd>Search for "rr"</kbd> >
  <kbd>Install Plugin</kbd>
  
- Manually:

  Download the [latest release](https://github.com/zerolfx/rr/releases/latest) and install it manually using
  <kbd>Settings/Preferences</kbd> > <kbd>Plugins</kbd> > <kbd>⚙️</kbd> > <kbd>Install plugin from disk...</kbd>


---
Plugin based on the [IntelliJ Platform Plugin Template][template].

[template]: https://github.com/JetBrains/intellij-platform-plugin-template
[docs:plugin-description]: https://plugins.jetbrains.com/docs/intellij/plugin-user-experience.html#plugin-description-and-presentation