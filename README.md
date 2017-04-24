# CodeDoesGood Android Style Guide

In order for our volunteers to be able to easily jump between projects and also to facilitate easy code review we are strict 
about having our platform style guides followed. We are a professional group of developers and one of our main purposes to is 
train up new developers. We believe that part of being an effective team member and a high quality developer is creating high 
quality, readable, consistent code. We believe following a style guide is an important part of being a developer.

There are additional things covered by Google's [Code Style for Contributors](https://source.android.com/source/code-style) 
if you are interested in how to format your code. What is listed below however are the only things that we are asking all 
devs to do the same. We find large style guides difficult to follow and mostly unnecessary and so we have only included what 
we consider the most important for a readable codebase with consistent formatting.
 
[Documentation](#documentation) 

## Lead Mentors
(please delete this section when you copy the style guide into your project)  

This style guide should be copied into the wiki for each new project either by the Lead Mentor or by someone the Lead Mentor assigns this task to. One of our guiding principles is to demonstrate distributed authority and teach our volunteers autonomy. What this means to us is that as long as our volunteers adhere to the processes and policies we do set, they have the freedom to make decisions. We know that every developer has a preferred way of working and coding and we do not want to get in the way of your efficiency (hey, another one of our guiding principles is to make efficient use of volunteer time!) and for that reason we want our Lead Mentors to be able to set the style guidelines for their own project. 

Some guidelines are required, some are preferred, and some are optional. Guidelines which are not required will be under the heading **Project-Specific** may be changed by the Lead Mentor either at their own discretion or through consensus with their team. Please note guidelines which are marked as _"Preferred"_ really are preferred and we would prefer you change them only if you have a good reason...but you are free to change them if you wish. Please delete the word "Preferred" from the ones that are labelled preferred so that your Hatchlings do not get confused and think they do not need to follow those guidelines.

\* With optional and preferred guidelines there is actually one requirement. The requirement is that you _must_ list a guideline for that item. No guidelines may be removed, but they can be edited. Note: You are more than welcome to add additional guidelines if there are things that are important to you which we have not included.

## Documentation
Android projects should be self-documenting but sometimes documentation is required.

- The code is a work-around for a bug (please include the URL of where you found the work around if you found it online)
- A large chunk of code has been copied from another project or article (please include the URL and other identifying information of where the work comes from as well as the License if it comes from a hosted repository / not an article or Stack Overflow post)
- You are doing anything that may seem out of the ordinary / not a native or standard approach

### Organization
- Use Google's coding standards for source code in the Java™ Programming Language. [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html)
- Commented out code must include a // TODO: statement explaining why it is commented out

In general, though, if you need to write documentation to explain what a function does, that code is not written well. 
Do not optimize unnecessarily or prematurely, but rewrite your code to be as clear and obviously self-evident as you can. 
If you are not sure how to fix it talk to another person on your team or post the snippet in your platform channel 
on Slack for help. Usually it can be resolved by encapsulating parts of the function into smaller single-purpose functions.

Please do not leave code commented out without adding a `TODO://` statement which explains why it is commented out. 
If we find code commented without a TODO statement we will be contacting the dev who wrote it to ask why.

#### Project-Specific Recommendations

\* If you are working on an API that will be consumed by other projects or turned into a framework/library, additional documentation will be required. Your Lead Mentor will adjust this style guide in that scenario with more information specific to your project. Lead Mentors please delete this line when creating your project style guide.
 
