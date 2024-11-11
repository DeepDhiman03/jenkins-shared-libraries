def call(String Project, String ImageTag, String dockerhubuser){
 
  sh "docker login -u deepdhiman -p 2677a9b0a9974d8a85e1cb22e1834505
  sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}
