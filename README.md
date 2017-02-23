Realtime Analytics for Gmail Accounts
------

## Introduction

Tempora is a simple web application that displays analytics about your Gmail account.

It uses OAuth 2.0 to connect to your Gmail account and fetch the necessary data.

## Disclaimer

Tempora does not connect to any third-party service other than Google, and all the data is stored in memory.

## Running the application

Tempora is a Java Web Application built using [Vaadin 7](https://vaadin.com) and uses [Gradle](https://gradle.org) as a build tool.

To run the application:

```shell
$ ./gradlew bootRun  
```

The command will download all the necessary dependencies and run the application on port `8080`.

## Licence

```
Copyright 2017 Faissal Elamraoui

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