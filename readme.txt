//this project have done following mvc architecture
    here, 1.servlet folder is controller
          2.model itself mdeloer
          3.web app is a view
          4.dao is for layer where jdbc code are writeen


//working mechanism

GetData->
1.servlet folder 
    a.it contain 'GetData' file which will recive data and 
    client request from   browser
    b.provide data to user for fteching in browser

//-----------------------------------------//
#note all the file should open in vscode
//Pre Request
1.first install maven extenstion,community liver server extension in vscode
2.Download maven  zip from maven official page
3.add maven bin and home dir file to enviroment variable
4.Download apache tom cat server zip file from its official page
5.you can either put it in enviornment variable or not
6.Go to apache tomcat dir
7.find conf folder from dir and add roles to use manager-gui
8.you can acess it though going to bin folder on dir in cmd and satrt->startup.bat and close->shutdown.bat
9.localhost://8080/manager
10.To check whether tom cat server is running or not localhost://8080/ after step 7

//configuring file with maven
while creating maven project give,
    id:uniqueId,
    atificatedId:project name

after creating file with maven
0.use mvn install to generate war file
1.add apache tomcat to going server->community->right click-> add new server->use disk->browse tomcat extract file
2.start tomcat server
3.After starting tomcat server there is two method to deploy your project
    1.right click on tom cat server -> add deployment server -> file->browse war file
        a. if edit option any optional then no
    2.directly go to war file right click run on server-> choose Tom cat server-> option no
        a.go to managerpanel choose your app or  for localhost://8080/your page name
    3.go to run on debug mode
        a.use break point to debug

//maven command
1.mvn install
    create targe folder war file including pom.xml file which required for maven project
2.mvn package
    create only target folder and inside target war files and other folder etc which may can compile of source code
3.mv clean 
    delete target director 
4.mvn deploy
    if you have make changes in source code it going to rebuild target war files and deploy with your changes in local repo

//adding jar files(mysql connector) in 
//navigate maven->dependcy->check all jar file there
	to add jar file in dependency
		a.go to mvnrepositary.com ->search-> jar file(mysql connector) ->choose and select version and copy dependency
		b.go to root directory-> pom.xml then add or paste  copied file into the dependecys tag


//servlet and jsp
servlet
a.servlet is used to process the request.
b.user prcoessing request are going to handle by servlet.
c.servlet is a java file which have features
d. servlet is used because it is used to process the all coming outgoing request for browser
jsp
jsp is used to create dynamic page and capacity to run java code inside browser
a.jsp will help to render data in broswer to create dynamic page
b.while working jsp file is converted into jsp

//main point
    a.never process your request with jsp servlet it will harm business logic
    b.process only view with jsp
    c.write your process code inside servlet



// mvc
    stands model view controller
    a.if we send a request  than it recive by controller
    b.contoller will gernerate data
    c.contoller accept request
    d.model variable hold the data
    e.view is where we have to view the data
        a.controller implemet by servlet
        b.model by the help of java classs
        c.view with help of jsp 

//theory of mvc
    a.client makes a request to controller have a responsibilty to call view and after view is going
    to sent client while calling view by controller data is also sent by controller to view. 
    b.between controller and view there is modeller which hold the data to send the view from
    controller.
    c.controller connect with database. aditional features should be written in another class inspite of
    writing in same class. for example jdbc connection method can be wrriten sepreately and can be imported
    for any class as method.

    exapmle
            controller->modeller->view
            user(request) -> controller(recived)->modeller(store or hold data)->view(recive data through modeller)->user(seen view with data recived from modeller);

            here,
            a.controller created by servlet
            b.view created by jsp
            c.model is pojo(plain old java object) example some classes