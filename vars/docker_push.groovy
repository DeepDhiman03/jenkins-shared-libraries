def call(String Project, String ImageTag, String dockerhubuser){
 
  sh "docker login -u deepdhiman -p dckr_pat_fBfDbOBhgiqKnvH45cVFwKC4Bh8
  sh "docker push ${dockerhubuser}/${Project}:${ImageTag}"
}
