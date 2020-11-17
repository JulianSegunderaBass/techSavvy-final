# techSavvy (finalized maven version)
### The finals project for the subject "entJava"
#### A modularized version of the original techSavvy project which starts out with a Maven project as its base, and includes modules for JSF, EJB and JPA implementations.

We aim to create a platform that allows users to choose from among a myriad of PC and/or Laptop models on a home screen. This screen is planned to give a quick overview
of a specific computer's basic specifications, such as the processor type, RAM and graphics, as well as the base price point.

Selecting a specific model will then take the user to one of two form pages where they can edit those specifications as well as other things like warranty, software subscriptions, etc. This project incorporates two seperate JSF forms to distinguish between Laptops and PCs.

A confirmed order is then passed with its data to the result order page where the model, price and other specifications are displayed. Note that both forms lead to the same result order page.

The link below leads to a mockup created on Canva for the home page. Note that this may change over the development period.
https://www.canva.com/design/DAEKe_WgRP4/I5BkfI39p9l_NgrQgtpjRg/view?utm_content=DAEKe_WgRP4&utm_campaign=designshare&utm_medium=link&utm_source=sharebutton

---
### Languages / Components Used
* **Bootstrap** - Bootstrap is the main styling framework used for the page designs. In this project, no template files were used and Bootstrap was injected directly into each JSF page similar to the standard HTML structure, but with some JSF tags included for the more emphasized elements like the forms.
* **Java** - Java is used for the classes and beans.
* **Java Persistence** - A persistence.xml file can be found under the EJB module.

---
### Java Logic
In this project, we took the approach of placing the form input variables along with their getters and setters in the requestOrder.java file under the EJB module rather than in the requestOrderFormBean.java file under the JSF module. We tried this to combine the form inputs directly with the database tables for H2.

---
### Problem Areas / Lacking Features
* The Persistence model was included, but the group had no way to see if the data was truly being stored in the in-memory database of H2 as the pages did not include an output list of content from said database.
* The latest version of this project still requires the user to "Introspect" the H2 database schema.
* **JavaScript** - JavaScript was intended to be used to allow the model images and price displays on the forms to change dynamically according to the model choice, but the JSF files would not accept either inline or external JS code. Attempts were made such as replacing some elements with their respective JSF tags, multiple event attributes such as onclick, onhover and onchange, as well as using the CDATA method for the JS code. Without the JS code, the images remain stuck on the first models as well as the price displays.
* **Sign Up and Login** - While the Sign Up and Login pages were styled and included in the navigation bar, they serve no other purpose other than as a display.
