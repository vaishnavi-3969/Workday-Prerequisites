[Udemy]
# Section 1: Getting Started
https://www.udemy.com/course/react-the-complete-guide-incl-redux/learn/lecture/25595340#reviews
- React is a JS library for building UI
![[Pasted image 20240715215654.png]]
- in react js we are writing code in a declarative way not imperative code
- React uses javascript under the hSood to update the UI
- https://github.com/academind/react-complete-guide-course-resources
---
# Section 2: JavaScript Refresher
![[Pasted image 20240715215737.png]]
defer → ensures that the js file is executed only after the html is loaded
alternatively we can add script tag at the end of body section
type="module" -> import
- React projects use a build process
	- the code you write isn't the code that gets executed (like this) in the browser
	- Your code is transformed before it's handed off to the browser
	- we can see that tool in the package.json file
	- lists all the dependencies and libraries used by the project
	- your code is transformed before it's handed off to the browser
1. Raw, unprocessed React code won't execute in the browser -> jSx isn't a default js feature
	- jsx -> html code written in js file
2. In addition, the code wouldn't be optimized for production (eg. not minified)
		- react projects require a build process that transform our code
		- create-react-app, vite etc. give us such a build process (no custom setup or tweaking needed)
### import and export
- only 1 default export per file
- import * as utils from './utils.js';
- we can add alias to anything we are importing
### revisiting values and variables
- string, number, boolean, null and undefined
![[Pasted image 20240715231141.png]]
additional -> objects
- variables store alues

![[Pasted image 20240715231232.png]]
![[Pasted image 20240715231247.png]]
![[Pasted image 20240715231309.png]]
camelcase
let, const
const -> mustn't be redefined
### revisiting operators
+,-,* , /, ===
### Revisiting functions and parameters
code that's not executed immediately but whenever we want
`function greet() {`
	`console.log("hello world")`
`}`
`greet()`
- parameters
- functions must only have one return stmt at most
- function w/o 'return' implicitly return 'undefined'
- 
### More on arrow function syntax

### arrays and arrays methods like map()
### destructuring
### destructuring in function parameter lists
### the spread operator
### revisiting control structures
### maniupulating the dom - not with react
### using functions as values
### defining functions inside of functions
### reference vs primitive values
### next-gen js - summary
### js array functions
### module resources


---
# Section 3: React Essentials: Components, JSX, Props, State and More

# Section 4: React Essentials: Deep Dive
# Section 5: React Essentials: Practice Project
# Section 6: Styling React Components
# Section 7: Debugging React Apps
# Section 8: Working with Refs and Portals
# Section 9: Practice Project: Project Management App (with Components, State, Refs and More)
# Section 10: React's Context API and useReducer - Advanced State Management
# Section 11: Handling Side Effects & Working with useEffect() Hook
# Section 12: Practice Project: Building a Quiz App
# Section 13: A look behind the scenes of React and Optimization Techniques
# Section 14: An alternative Way of building components: Class-based Components
# Section 15: Sending HTTP Requests (eg. Connecting to a Database)
# Section 16: Building Custom React hooks
# Section 17: Working with forms and user input
# Section 18: Practice Project: Building a Food Order App
# Section 19: Dividing into Redux (An alternative to the context API)
# Section 20: Advanced Redux
# Section 21: Building a Multi-Page SPA with React Router
# Section 22: Adding authentication to react apps
# Section 23: Deploying React apps
# Section 24: React Query/Tanstack Query : Handing HTTP Requests with Ease
# Section 25: A (Pretty Deep Dive) Introduction to Next.js
# Section 26: Animating React Apps
# Section 27: React Patterns and Best Practices
# Section 28: Replacing Redux with React Hooks
# Section 29: Testing React Apps(Unit Tests)
# Section 30: React + TypeScript
# Section 31: Optional: React Summary and Core Feature WalkThrough
# Section 32: Course Roundup
# Section 33: Course Update and Old Course Content
# Section 34: React Basics and Working with Components
# Section 35: Time to practice: component basics
# Section 36: React State and working with events
# Section 37: Rendering lists and conditional content
# Section 38: Time to Practice: A complete practice project
