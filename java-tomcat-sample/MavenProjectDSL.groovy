job( "Firest-Maven-Project-Via-DSL" ) {
    description ("First Maven Project Create Using DSL ${new Date()}, on this date ")
scm{
    git("https://github.com/prakashparmardevops/Jenkins_Upgradev4.git", 'master')  
}
triggers {
    scm('* * * * *')
}
steps{
     maven ('clean package', 'java-tomcat-sample/pom.xml')
}
publishers{
    archiveArchifacts '**/*.jar'  
}
}