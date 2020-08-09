Question 3 Solution
Suggestions/Improvements for "https://www.bestundertaking.net/NewConnection.aspx"

Usability issue list
1.'Click Here' should have hyperlink in this link:-"If Form Already filled, Click here for Payment"
2.This Instruction should be highlighted in red color:-"Application to be submitted only after installation / Wiring is completed in all respects"
3.Help points should have some different bullet icon instead of * as its already used for mandatory field indication
4.Need facility of filling form in other langauge option as well
5.Validation messages font is not consistent throughtout the website
6.Field specifications needs to mention
7.while entering connection details,page is scrolling to top of page sometimes
8.After submission of form user is not getting any instruction or help for next process


UI Aesthetics issue list
1.UI Design is not appropriate,many color are used.
2.Position of validation is not consistant for Upload of photo,signature,occupancy and identity proof
3.Color for Terms and conditions message should be same in connection details and form submission
4.Deprecated Blink tag is in use
4
Functionality lssue list
1.User is getting 2 validation messages for Email field,One will comes and disappears after inserting Invalid Email id
2.User is unable to navigate to Home page after clicking on payment link,from payment page,home link is not working
3.Mobile number validation message is getting blink
4.Success message should be displayed for OTP generation
5.Success message should be displayed for OTP Validation
 6."I, the above referred applicant, agree and accept the conditions in "Declaration / Undertaking" with complete awareness about safety provisions in Law and promise to abide by them in word and spirit." this should be accepted with checkbox instead of "Yes" button
7."Whether power supply address is same as billing address *-Yes/No":- here,in NO ,'O" should be small
8.In Connection details,all amount fields should be comma seperated
9.Photo and signature upload image icon is not displaying after click on 'Reset All' button
10.Email Id should have field specifications,for entering long value(more than 20 digits) website is becoming non-responsive
11.success message is not displaying for form submission
12.Reset all is not clearing these fields:-Aadhar No.,Test report,OTP and uploaded photo
13.Validation message are not displaying for consumer no and password field on Login page
14.on Registration form,only 2 fields are in 2 laguages,need to maintain consistancy for all foms and all fields


Solution of Question1
Project Name:-	Sadguru's Amrit-Tulya Tea Shop							
Build ID:-	Build 1							
								
								
Test case Id	Test Scenario	Test Objective	Pre-requisites	Test Steps	Test Data	Expected Result	Actual Result	Result(P/F)
	Frontend Requirement tescases							
TC_01	Create New Item	Check the creation of new item by entering all details	User should be on "Sadguru Tea stall" application	"1.Go to item list page of application
2.Click on create item button
3.Enter name of an item
4.Enter Desciption of an item
5.Enter price of an item
6.Upload an image for an item
7.Click on create button"	"Name:-Tea powder

Description:-Used to prepare Tea

Price:-15rs

Image:-Image1.png"	User should be able to create an new item by entering all details with uploaded image		
TC_02		Check the creation of new item by entering only mandatory details	User should be on "Sadguru Tea stall" application	"1.Go to item list page of application
2.Click on create item button
3.Enter name of an item
4.Enter Desciption of an item
5.Enter price of an item
6.Click on create button"	"Name:-Tea powder

Description:-Used to prepare Tea

Price:-15rs
"	User should be able to create an new item by entering all details like name,price and description		
TC_03		Check the creation of new item with invalid Name	User should be on "Sadguru Tea stall" application	"1.Go to item list page of application
2.Click on create item button
3.Enter name of an item more than length of data
4.Enter Desciption of an item more than length of data
5.Enter price of an item
6.Upload an image for an item
7.Click on create button"	"Name:-sdgdsdsjddshdsjdsj

Description:--Used to prepare Tea

Price:-15rs

Image:-Image1.png"	User should get appropriate error message for Name field for invalid input		
TC_04		Check the creation of new item with invalid Price	User should be on "Sadguru Tea stall" application	"1.Go to item list page of application
2.Click on create item button
3.Enter name of an item more than length of data
4.Enter Desciption of an item more than length of data
5.Enter price of an item
6.Upload an image for an item
7.Click on create button"	"Name:-sdgdsdsjddshdsjdsj

Description:--Used to prepare Tea

Price:-15ads237&*

Image:-Image1.png"	User should get appropriate error message for Price field for invalid input		
TC_05	List of added items	Check the added item on grid page	"User should be on ""Sadguru Tea stall"" application
item should be added"	"1.Go to item list page of application
2.Check the added item name and price on grid view"	"Name:-Sugar

"	User should be able to view added item in the list with price on grid page		
TC_06	Delete of Item	Check the delete button display for each item on list page	"User should be on ""Sadguru Tea stall"" application
item should be added"	"1.Go to item list page of application
2.Check the Delete button display for each item"		User should be able to view delete button for each item on grid page		
TC_07		Check the working of Delete functionality 	"User should be on ""Sadguru Tea stall"" application
item should be added"	"1.Go to item list page of application
2.Click on Delete button of tea powder"		User should be able to delete added item from list		
TC_08	Thumbnail view of Item image	Check the Thumbnail view of uploaded image for an item	"User should be on ""Sadguru Tea stall"" application
item should be added with an image"	"1.Go to item list page of application
2.Click on thumbnail of Sugar
3.Check image on new tab"		User should be to view thumbnail of uploaded image for an item and user should be able to click on it		
TC_09	View of an item	Check the View page of an item	"User should be on ""Sadguru Tea stall"" application
item should be added with an image"	"1.Go to item list page of application
2.Click on any item
3.Check all details of an item"	"Name:-Sugar

"	User should be able to view all entered details on view page.Image also should be displayed if added to an item		
TC_10	Page URL	Check page URL after every action  	User should be on "Sadguru Tea stall" application	"1.Go to item list page of application
2.Create an item
3.Click on item to check all details on view page
4.Click on delete button of any item"		user should be able to perform all actions of same page without reloading full page.Full page should get reloads when there is navigation between pages		
TC_11	Visual style of page	Check the Visual syle of all pages	User should be on "Sadguru Tea stall" application	"1.Check the content of create page
2.Check the content of list page"		Content of pages should be both horizontally and vertically centered		
	Backend Requirement tescases							
TC_12		Check the entry of added item into inventory table	User should be on database of an application	"1.Go to Inventory table
2.Check the added sugar item entry in table"		User should be able to view Sugar item in database with new item id		
TC_13		Check the Image column for an item 	User should be on database of an application	"1.Go to Inventory table
2.Check the image column for 'Tea Powder'  item entry in table"		User should be able to view image link for Tea powder item in table		
TC_14		Check the item details in inventory table after deleting it from frontend	User should be on database of an application	"1.Go to Inventory table
2.Check the sugar item in table after deleting it from frontend"		Sugar item should get deleted from database table as well when its deleted from forntend		


