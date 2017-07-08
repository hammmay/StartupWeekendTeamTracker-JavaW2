# Startup Weekend Team Tracker

#### By Laura Hamilton

## Description

This application is a demonstration of creating and viewing Java objects inside other Java objects through the use of classes, strings, arrays, methods, conditional behavior-driven programing, and JUnit testing. The page will allow users to create teams, view the teams that were created, add new members to the teams, and view those members added to the team. The page will also allow the user to view a page about the event the teams are being created for.

## Code Specs

|Behavior - Plain English|Input|Output|
|---|---|---|
|On the homepage, a user clicks on the Event Details link and is taken to an event details page where they can view information about the event|User clicks on "Event Details"|The user is taken to the event details page|
|On the homepage, a user adds a team using the "Add A Team" field and button and they are taken to a success page that tells them the team was added and gives them the option to go back to the homepage|User enters "Team 1" in the "Add A Team" field|The user is taken to a success page letting them know the team was added|
|On the success page for a team addition, the user clicks on the "Back To The Teams List" link and is taken back to the homepage where the team they just added is listed|User clicks on "Back To The Teams List" after adding a team called "Team 1"|The user is taken to the homepage and sees Team 1 listed as a team|
|On the homepage, a user clicks on the name of a team they created and is taken to a page where they can see a list of the team members, if any have been added already, and use a field to add additional members to that team|User clicks on "Team 1"|The user is taken to the Team 1 page and a they see a blank list of team members and a field to add members to the team|
|On a team page, a user adds a member to the team using the "Add A Member" field and button and they are taken to a success page that tells them the member was added and gives them the option to go back to the homepage|User enters "Member A" in the "Add A Member" field|The user is taken to a success page letting them know the member was added|
|On the success page for a member addition, the user clicks on the "Back To The Teams List" link and is taken back to the homepage where the team they just added a member to is listed|User clicks on "Back To The Teams List" after adding a member called "Member A"|The user is taken to the homepage and sees Team 1 still listed as a team|

## Setup

Start by cloning this repository, and run it through the terminal with the command $ gradle run. Once running, follow the listening path provided through the terminal and view it through your browser in localhost:
(Note: you must have the right programs installed on your computer already to run the program. Please refer to the Technologies Used section below for the program list)

## Technologies Used

Java
Gradle
JUnit
Spark
VelocityTemplateEngine

### Legal

Copyright (c) 2017 Laura Hamilton laurahamilton9@gmail.com

This software is licensed under the MIT license.

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
