# About

This project leverages MySQL database integration and Aspect-Oriented Programming (AOP) with @Before and @AfterReturning annotations to provide seamless logging of key data.
One use-case of this setup is that you can effortlessly track user activity by intercepting method calls before and after execution, ensuring comprehensive logging for monitoring and analysis.
In addition, you can this application can be used to seamlessly stream data generated by user activities to Apache Kafka for real-time processing and analysis.
With Kafka integration, you can leverage various consumer applications such as Apache Flink, Apache Spark, or custom-built consumers to consume and process the logged data.
This enables you to unlock powerful real-time insights and enhance decision-making capabilities.

### Guides
Before running the application, do the following:
1. Run the sql script "govemployee-directory" in MySQL Workbench.
2. VERY IMPORTANT: Once in your IDE, MAKE SURE TO CHANGE the username and password in the "application.properties" file to the username/password you used
   to log into your MySQL DB instance where your database schema is located. You might also remember to update the database URL accordingly.

If you encounter any issues or need help, don't hesitate to create an issue or contact me.

