def call(String Project, String ImageTag, String dockerhubuser){
 
  sh "docker login -u deepdhiman -p dckr_pat_MaJ5IMXfGB2AbwaMR7sc2F81klg"
  sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}
