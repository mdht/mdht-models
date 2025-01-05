# I *ARCHIVED 1/1/2025
This respository has been combined with based MDHT repository 
Releases will be available here 
https://gitlab.eclipse.org/eclipse/mdht/modeling.mdht.git
 

# Welcome to the Model Driven Health Tools Model Repository
On this site you will find all the MDHT projects supporting the various CDA based implementation guides including Consolidated CDA

**You can get the latest packaged runtime jars here** <https://github.com/mdht/mdht-models/releases>

**You can vist the MDHT eclipse page here** <https://projects.eclipse.org/projects/modeling.mdht>

---

*Note: This readme is a work in progress. Anyone interested in MDHT: Please feel free to modify, update the TODO fields, or add to any part of it with a PR.*

**Documentation:**

The two best places for user documentation are:

1.  <https://www.projects.openhealthtools.org/sf/wiki/do/viewPage/projects.mdht/wiki/User%20Documentation>

2.  <http://cdatools.com/>

Note: Some of this information is outdated but most of it is still very useful. Anyone that wants to contribute new documentation of any kind is appreciated.

**Working with the API for Java Programmers:**

If you are looking to generate serialize, deserialize, or generate C-CDA documents, simply import the latest jars into your java project. They can be found here (choose the latest mdht-models release):

<https://github.com/mdht/mdht-models/releases>

**Development for Java Programmers:**

If you are looking to contribute or modify the source code used in the latest mdht-models release:

You can import the projects that match the names of the projects in the 'mdht' folder within the latest mdht-models release. However, since this code is generated, it is not the recommended approach. The best approach is to setup an environment using the approaches listed in the 'Modeling/Development via code generation' section ahead.

**Modeling/Development via code generation:**

If you are looking to create new or modify existing CDA-based models you will either need:

-   The latest plugins projects (or jars) in an Eclipse modeling IDE (MDHT plugins would not need to be installed)

or

-   To install the plugins into Eclipse directly. Use the following URL as your Update Site in Eclipse: https://hudson.eclipse.org/mdht/job/MDHT-master/lastSuccessfulBuild/artifact/repository. This will inject MDHT into your Eclipse installation.

or

-   To download a product such as the designer (eclipse with MDHT pre-installed)

Via an EMF based transform, reload, and generate process, these models can then be used to generate OCL and message strings for the constraints, ecore, Java source code, JUnit tests, and more.

Note: A detailed document on setting up an development environment is in the works. 
An overview is to:

-   Download Eclipse Mars.2 64 bit 'modeling' version and import the github mdht-models repo projects from the release packages that you may need (e.g. emf.runtime, cda, datatypes, rim, vocab, consol2, mu2consol) and import all of the plugins from the eclipse repo.
