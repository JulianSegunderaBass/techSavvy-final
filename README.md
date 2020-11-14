# techSavvy (finalized maven version)
### The finals project for the subject "entJava"
#### A modularized version of the original techSavvy project which starts out with a Maven project as its base, and includes modules for JSF, EJB and JPA implementations.

We aim to create a platform that allows users to choose from among a myriad of PC and/or Laptop models on a home screen. This screen is planned to give a quick overview
of a specific computer's basic specifications, such as the processor type, RAM and graphics, as well as the base price point.

Selecting a specific model will then take the user to a form page where they can edit those specifications as well as other things like warranty, software subscriptions, etc. 
As of this version, two forms exist to distinguish between Laptop and PC orders.

The current development version primarily uses a pure HTML-Bootstrap structure without template files for more direct styling. An index JSF page is planned to function as the homepage showing the model options.

A confirmed order from the form page will then be stored with its data in an in-memory database using H2.

The link below leads to a mockup created on Canva for the home page. Note that this may change over the development period.
https://www.canva.com/design/DAEKe_WgRP4/I5BkfI39p9l_NgrQgtpjRg/view?utm_content=DAEKe_WgRP4&utm_campaign=designshare&utm_medium=link&utm_source=sharebutton
