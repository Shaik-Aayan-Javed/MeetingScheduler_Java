# MeetingScheduler_Java
This repo contains a Web app which displays a Schedule. It uses HTML, CSS, JavaScript and Java [API].

# What is it?
This Web App basically displays if N meetings can happen in an NxN grid [N-Queens Algorithm {backtracking}].
The backend logic is written in Java, and using spring-boot it turns it into a REST API. 
The Frontend calls this API thourgh the "fetch()" method in JavaScript to access the raw JSON 
data. The JSON data is processed and displayed.

# Flow Chart

                                  User opens browser
                                          ↓
                                  http://localhost:8080/index.html
                                          ↓
                                  Spring Boot serves HTML
                                          ↓
                                  User clicks button
                                          ↓
                                  JS calls /schedule
                                          ↓
                                  Java backend runs algorithm
                                          ↓
                                  Returns JSON
                                          ↓
                                  Frontend updates UI
                                  

# How to Use it?
You type a number N which is greater than 0 in the input field, then it displays a NxN schedule Grid where the green cell containing "M "stands for Meeting, 
and the red cell containing nothing for empty. Since the main logic revolves around backtracking, the greater the number the longer it is going to take to display 
the output. For some cases of N, where getting the desired output is not possible, you will get an alert message stating that it is not 
possible to have N meetings in an NxN schedule grid.

# Technologies Used
For Front-End : HTML, CSS, JavaScript DOM

For Back-End : Java API [Spring-Boot libraries] and JavaScript fetch() method.


# AI Tools I Used
ChatGPT : I didnt know how to connect my backend to frontend, after prompting around, i found out that using 
          spring-boot might be the simplest modern method without linking it to a Database Server. It walked me through everything.
          Ofcourse this goes without saying but, it usually took a couple of prompts for it to understand where my issues where,
          but thats expexcted.


# How to Run?
Step 1: Download the folder

Step 2: Open the folder in desired IDE [I used VS Code]

Step 3: If you get errors in the DemoApplication.java or SchedulerController.java file, it might be because
        the maven dependencies are not downloaded.
        
          What you can do to solve this issue is: 
        
            Method 1:
  
                Step i:       Open terminal in the demo folder [MEETINGROOMPROJECT_J/demo] and run mvnw.cmd clean install
      
                Step ii:      Reload VS Code, by doing Ctrl+Shift+P and search Java: Clean Java Language Server Workspace
      
            Method 2:
            
                directly run mvnw.cmd spring-boot:run in the demo folder

            Note: I have not used method 2, so idk if it works, but for method 1, it works [i used it].
                  Also, for using Spring-Boot I used ChatGPT, it helped me a ton, if ever both the methods dont workout, then using ChatGPT
                  might be the next best thing to do [Sorry, this is my first time using Spring-Boot ever, 
                  so idk about any other issue that might pop-up].




Godspeed
