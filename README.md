# Jenkins_shared_library

# Steps to configure Jenkins pipeline library:

1. Go to manage jenkins ---> configure system ---> Global Pipeline Libraries
2. Under the Library section, configure values as below.
   - Name (remember, we will refer to this shared library from Jenkinsfile using this name).
   - Default version (branch name of our Shared Library git repo).
   - Under the Retrieval method, choose Modern SCM.
   - Under Source Code Management, choose Git.
        + Enter your Pipeline Shared Libraries repo URL under Project Repository
        + Configure credentials if your repo requires credentials to checkout code Cre

3. Create Jenkins Pipeline job and Write:
   
    @Library('first-shared-lib') _
    jenkinsForJava 'https://github.com/iamvickyav/spring-boot-data-H2-embedded.git'
    
    
    Here first-shared-lib is a name that we have mentioned in library section under configuration
    and  jenkinsForJava  is groovy file name which is in vars folder


# Reference
https://www.lambdatest.com/blog/use-jenkins-shared-libraries-in-a-jenkins-pipeline/
