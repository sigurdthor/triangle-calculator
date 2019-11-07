# Triangle calculator

  Program calculates minimal triangle path and can be executed
 by following instructions:
  
  1. Sbt run(from root directory)
   
   sigurd@sigurd:~/projects/triangle-calculator> sbt run 
   
   Put triangle into sbt stdin e.g.
   1
   2 4 
   3 6 8
   EOF
   
   Important: each input should be finished by EOF
   
  2.Use already built jar in bin directory or build your own 
    by sbt assembly command
    
   sigurd@sigurd:~/projects/triangle-calculator> cat << EOF | java -jar | java -jar bin/triangle-calculator-assembly-1.0.jar  

   Put triangle into stdin as in previous example