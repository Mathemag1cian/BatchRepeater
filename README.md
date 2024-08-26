# BatchRepeater #
## Overview ##
BatchRepeater is a BurpSuite extension that enhances the functionality of the Repeater tool by allowing users to send multiple selected HTTP requests to the Repeater in a single action. This tool is useful for penetration testers and security professionals who need to quickly and efficiently analyze multiple HTTP requests.

## Features ##
* Send Multiple Requests to Repeater: Adds a context menu option, "Send all to Repeater," that allows users to select multiple HTTP requests and send them to BurpSuite's Repeater tool in one click.

## Installation ##
1. Download the JAR File:
   * Download the BatchRepeater.jar file from the Releases section of this repository.
2. Add the Extension to BurpSuite:
   * Open BurpSuite.
   * Go to the "Extensions" tab.
   * Click "Add" and select the BatchRepeater.jar file.

## Usage ##
1. Right-click on HTTP Requests:
   * In BurpSuite, select one or more HTTP requests from any tool (such as Proxy, Target, etc.).
   * Right-click on the selected requests.
2. Send to Repeater:
   * Choose the "Send all to Repeater" option from the context menu.
   * The selected requests will be sent to the Repeater tool for further analysis.
     
     ![BatchRepeater](https://github.com/user-attachments/assets/fba5de50-1ff7-42b1-93ce-b432e905f99a)
     
## Requirements ##
   * BurpSuite: Professional or Community Edition.
   * Java: Version 21 or higher.

## Project Structure ##
* `BatchRepeater.java`: The main source code for the extension.
* `.gitignore`: Specifies files and directories that should be ignored by Git.
* `pom.xml`: Maven configuration file that manages project dependencies.
* `BatchRepeater.jar`: The compiled extension JAR file.
