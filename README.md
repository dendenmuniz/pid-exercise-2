# Programming in Depth - Exercise 2 - JSON

Following exercise regards working with JSON, Javascript Object Notation. Some resources are provide in the 
following links: [JSON intro](https://www.w3schools.com/js/js_json_intro.asp), [json.org](https://json.org). JSON is a lightweight 
data-interchange format, meaning that it is used for formatting documents such that data can be exchanged between 
computers. These types of documents are human read- and writable. JSON documents are also easy for computers to parse 
and generate which means that it is compatible with many programming language. Therefore, it is suitable tool for long 
term storage for small applications. 

### Task
In this exercise you’ll code an application for taking attendance. It should make
use of member files. A member file is simply a JSON file containing a list of people represented by a name and an id. See
the sample file `example-member-list.json`. The application 
should run in the terminal and have a text interface, similar to the project in Individual Project. The functionalities 
should include:

1. Load in a member file (one sample file is provided for you).
2. If there are people with the same id, the user should be warned (ids are supposed to be unique).
3. Take the attendance of every member in the loaded file. You decide how this happens but it should be user friendly!
4. Save the attendance sheet onto a file using JSON formatting (either in a large single file, or a file for every
5. Load and display an already saved attendance sheet. Print it in a nice way for the user so that you can easily
see who has attended.

**Extra functionalities**:

6. Add a way to create new member files via your application and a way to edit existing member files (add/remove people).
5. Make it so that you can browse through previously saved attendance sheets. You can either show a list of attendance
sheets from which the user can choose or you can show one attendance list at a time and let the user go to the next or
previous one.

### Requirements:
- You should write tests for at least two classes and for each class there should be at least three tests. 

- You should also convert you project into a .jar file with 
a [Build Tool](https://stackoverflow.com/questions/7249871/what-is-a-build-tool). For Java there are couple Build Tools 
you can choose from e.g. Gradle, Maven and Ant.

- You should properly use git for version control.

- It should not require a restart of the application for some of the functionalities to work.

- Java is the chosen programming language for this exercise. Explore and choose a suitable Java library of 
your own choice to parse and write JSON files.

### Questions

These are some open questions for you to think about,
1. How can we save the attendance sheet? What information do we need to save?
1. How is the JSON library handling file writes?
1. What are the pros and cons of having to save a file...
   1. ...of the whole attendance sheet?
   1. ...for every member?
1. What could be used instead of JSON?
1. Discuss the decision behind your chosen library.
1. What kind of data structure can we use to store members?
1. What kind of data structures can we use for the application?

Good luck, and great job on the previous exercises.
