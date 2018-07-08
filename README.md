# springboot-zuulgatewayproxy-student
Project Name: springboot-zuulgatewayproxy-student

Example URL:https://howtodoinjava.com/spring/spring-cloud/spring-cloud-api-gateway-zuul/

Below URLs To Run the Application:
URL1:-http://localhost:8080/student/getStudentDetails/{anysamplename}
URL2:-http://localhost:8080/student/echoStudentName/{anysamplename}

OutPut in Browser:-
URL1 output:- {"name":"Nirmala","address":"Pune","cls":"MCA"}
URL2 output:-Hello Nirmala Responsed on :Sun Jul 08 21:04:19 IST 2018


OutPut in Console:-
Request Method : GET Request URL : http://localhost:8080/student/echoStudentName/Nirmala
Inside Route Filter
Inside Response Filter
Request Method : GET Request URL : http://localhost:8080/student/getStudentDetails/Nirmala
Inside Route Filter
Inside Response Filter
