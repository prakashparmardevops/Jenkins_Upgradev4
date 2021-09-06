job( "Firest-Maven-Project-Via-DSL" ) {
    discriptio ("First Maven Project Create Using DSL ${new date()}")
scm{
    git("https://github.com/prakashparmardevops/Jenkins_Upgradev4.git", main)  
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