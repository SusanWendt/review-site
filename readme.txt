Reviews Site Overview: 
[] Create a reviews site that categorizes reviews. 
[] Create reviews about anything you like: tech, travel, toys, they’re all good.
[] Create a Spring Boot + MVC app that displays a list of reviews, allowing us to click on an individual review to see its details.

Required Tasks
[X] Create/configure a Spring Boot/MVC application.

[X] Create a **Review class** for the content of reviews. 
Its instance variables (attributes) should include:
[X] id (make this of type long – you’ll find out why later) – just use arbitrary, unique numbers for these ids
[X] title
[X] image url
[X] review category
[X] content
whatever other things you’d like to include. Some ideas:
[X] date
[X] description/synopsis

Stretch Task: 
[] tags (this should probably be a Collection)

[X] accessor (get* methods) that return information about review attributes. 
These will allow your Thymeleaf templates to display information about reviews.

[X] Create a **ReviewRepository class**
[X] This class should be annotated properly so that it can be injected into ReviewsController.
[X] It should have a constructor that creates your Review instances and populates a Map that stores your reviews, using each review’s id as the map key.
[X] It should have a method to find all reviews
[X] It should have a method to find one review by id

[X] Create a **ReviewsController class**
[X] apply proper annotation
[X] It should inject…something appropriately
[X] It should have a method mapped to a url that puts all of your reviews into the model, 
forwarding to a “reviews” template.
[X] It should have a method mapped to a url including an id parameter that puts one of your reviews into the model, 
forwarding to a “review” template. 
[X] This method should expect an “id” query parameter in order to select a specific review.
[X] Place images you use into your src/main/resources/static/images folder and link to them there. 
		Example: if your image is in src/main/resources/static/images/foo.jpg, you would reference it in your application as /images/foo.jpg.
[X] Use your html/css-fu to style to your pages consistently and to make them appealing.

Grading
[] create a Review class with appropriate instance data and methods	13
[] create a Repository class with proper annotations	12
[] create a Controller class with proper annotations	20
[] create Thymeleaf template for a single review	10
[] create Thymeleaf template for all reviews	10
[] house and reference images from proper resource folder	5
[] Semantic HTML	10
[] TDD	10
[] Style/formatting/code quality	10