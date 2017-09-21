# Studypoint-4

## Threads Day-1.
  
  ### Exercise 1
  
  src file https://github.com/pravien/Studypoint-4/blob/master/startCodeForThreadExercises/src/main/java/day1/MainDay1.java
  
  a) Do you observe a need for synchronization techniques on any of the threads in practise, or does your program work by         accident?

   - Yes in thread 3. Because we need a global boolean variable to make sure that the while loop stop. I have used volatile.
    By making this variable volatile all our Threads can use it. 

  
  b) Regardless of whether you observe the problem on your machine, we need to handle it.
   What is the problem I’m hinting at, and how can we solve it? (Since I’m such a nice guy, here’s a hint: think about the       VolatileExample class from the demo today).

   - See Question a's answer

  
  c) argue that your solution is correct (argue, don’t prove)

   - My solution is correct because is uses the tools we learned at todays lecture.
    
  ### Excercise 2
  
  Src code https://github.com/pravien/Studypoint-4/blob/master/startCodeForThreadExercises/src/main/java/day1/Exercise2.java

  
  a) Are you able to provoke the expected error on your machine?
  
   - Yes i am able to provoke the expected error , which is getting a number that is not even.
    
  
  b) How often does the problem occur?
    
   - I only managed to provoke the error a few times, with 1000 calls pr run. If you increase this value, you will provoke       the error morefrequently
    
 
 c) Use the synchronization techniques you’ve learned today, to make next() method atomic with respect to itself.
  
 
 d) Argue that your solution is correct (argue, don’t prove)
    
   - The solution is correct because i have used the keyword synchronized, which make sure that when one of the thread's are    using the fucntion next() it has to finish running function before the other thread can use the function, by doin this the    threads don't interfer with eachother.
    
 ### Exercise 5 (Race condition)
package day1.turnstiles

src file : https://github.com/pravien/Studypoint-4/tree/master/startCodeForThreadExercises/src/main/java/day1/turnstiles
  
a) Do you get the right result? 
  
  - Yes i got 40000.
  

b) What is the problem in the code? (It’s there whether you get the right result or not)

  - The problem in the code is that the threads are intefering with eachother, this can be solved by using synchronization.
  

c) Solve the problem using synchronization techniques.

### Exercise 6 (race condition)  RED
 The pakage used is day1.bank
 
 src files : https://github.com/pravien/Studypoint-4/tree/master/startCodeForThreadExercises/src/main/java/day1/bank
  
## Threads Day-2.
 
 ### Exercise 1
  Package used day2.webscraper
  
 src files https://github.com/pravien/Studypoint-4/tree/master/startCodeForThreadExercises/src/main/java/day2/webscraper
   
   a)
  Run the main method in the Tester class, and make sure you understand conceptually what happens. Especially you should note that these lines : tcX.run() probably takes a noticeable amount of time (why?)

- The reason why it takes alot of times, is because we only make one request at a time.
so we can only handle one website request at the time and we have to wait for the response before we can continue to the next website.

b)
Refactor the TagCounter class to extend the Thread class. This should be very simple (why ?)
 - Because the class already contain a run method.
 
c)
Change the Tester class to not call run(), but start the three threads (what's the BIG difference?)

 - The start method is used to start and run a thread. Where the run method just call the method.
 
This will most likely mean that all your system.out’s will be empty or null (why?)
 - Because the main method finish before the threads have finished running.
Fix the problem above
 - Fix by adding .join().
 
 d)
Let's see whether we gained anything by executing the three calculations in parallel, or if we could have achieved the same result via sequential execution.



## Exercise 3
Packege used day2.rndnumberprodcon

src files https://github.com/pravien/Studypoint-4/tree/master/startCodeForThreadExercises/src/main/java/day2/rndnumberprodcon

a) 
Before you start you should understand the general idea, behind the exercise as described above by answering the following questions.

If we need a “large” collection of random numbers, what is the advantage (if any) of introducing threads to “produce” the numbers?
 - By using threads we can create multiple random numbers at the same time.
 
Why does the exercise suggest 4 producer threads, and is that always the right  number?

Given that the Queue is a BlockingQueue implementation, how would you insert data into the Queue (add(), offer(), put() ) if it’s limited in capacity, and items are produced much faster than they are produced?

 - i would use put because of the block method.

Given that the Queue is a BlockingQueue implementation, how would you fetch data from the Queue (remove(), poll(), take() ) if Production is slow, compared to how we consume items

 - Take because of the block method.

b)  Use the code provided in day2.rndnumberprodcon as start code for this exercise. Compile and run the main method in Tester.

c) Complete the run() method in the RandomNumberProducer class, by producing the required number of random numbers and insert them into the numbersProduced Queue (again, chose the right insert method).

d) Complete the run() method in the RandomNumberConsumer class so that the sumTotal variable is updated, and all consumed numbers are inserted into either the below50 or aboveOr50 Lists.

f) Run and “verify” the behaviour of the completed program 


## Exercise 4
Package used day2.webscrapprodcon - 

src files https://github.com/pravien/Studypoint-4/tree/master/startCodeForThreadExercises/src/main/java/day2/webscrapprodcon

d) Note the order in which the consumer prints the results.

Is this the order, in which we added the URL’s to Q1?

 - No it is not.

If not, explain why

 - because we use threads. We have no control over which threads runs first.

If not, can you print results in the right order?  (Note: RED)
Day-3 will provide you a way to “return” values from your threads and control the order



## Exercise 5

src files https://github.com/pravien/Studypoint-4/tree/master/startCodeForThreadExercises/src/main/java/day2/deadlock

a) Does the program behave as expected, if not explain the problem. GREEN

 - Yes it create a deadlock because one thread is locking the first operation and the second lock is locking the second   operation and they both need the other threads operation to continue. 

c) Identify the problem in the code? GREEN

 - see answer a.
 
 
## Threads Day-3.

src files - https://github.com/pravien/Studypoint-4/tree/master/Threads-3-exercise-code

## Studypoint1.

src files - https://github.com/pravien/Studypoint-4/tree/master/Studypoint1/Studypoint1

## Studypoint2.

src files - https://github.com/pravien/Studypoint-4/tree/master/Studypoint2/Studypoint2


